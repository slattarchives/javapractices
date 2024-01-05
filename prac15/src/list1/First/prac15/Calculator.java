package list1.First.prac15;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Калькулятор");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);

        JPanel panel = new JPanel(new GridLayout(4, 4));

        JTextField display = new JTextField();
        frame.add(display, BorderLayout.NORTH);
        frame.add(panel, BorderLayout.CENTER);

        JButton[] buttons = new JButton[16];
        String[] buttonLabels = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "C", "0", "=", "+"
        };

        for (int i = 0; i < 16; i++) {
            buttons[i] = new JButton(buttonLabels[i]);
            panel.add(buttons[i]);
        }

        for (int i = 0; i < 16; i++) {
            final int index = i;
            buttons[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String buttonText = buttons[index].getText();
                    if (buttonText.equals("C")) {
                        display.setText("");
                    } else if (buttonText.equals("=")) {
                        try {
                            String expression = display.getText();
                            double result = evaluateExpression(expression);
                            display.setText(String.valueOf(result));
                        } catch (Exception ex) {
                            display.setText("Ошибка");
                        }
                    } else {
                        display.setText(display.getText() + buttonText);
                    }
                }
            });
        }

        frame.setVisible(true);
    }

    private static double evaluateExpression(String expression) {
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < expression.length()) ? expression.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (ch == ' ')
                    nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < expression.length()) {
                    throw new RuntimeException("Неверное выражение: " + (char) ch);
                }
                return x;
            }

            double parseExpression() {
                double x = parseTerm();
                for (; ; ) {
                    if (eat('+')) x += parseTerm(); // сложение
                    else if (eat('-')) x -= parseTerm(); // вычитание
                    else return x;
                }
            }

            double parseTerm() {
                double x = parseFactor();
                for (; ; ) {
                    if (eat('*')) x *= parseFactor(); // умножение
                    else if (eat('/')) x /= parseFactor(); // деление
                    else return x;
                }
            }

            double parseFactor() {
                if (eat('+')) return parseFactor(); // унарный плюс
                if (eat('-')) return -parseFactor(); // унарный минус

                double x;
                int startPos = this.pos;
                if (eat('(')) { // скобки
                    x = parseExpression();
                    eat(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') { // числа
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(expression.substring(startPos, this.pos));
                } else {
                    throw new RuntimeException("Неверное выражение: " + (char) ch);
                }

                if (eat('^')) x = Math.pow(x, parseFactor()); // возведение в степень

                return x;
            }
        }.parse();
    }
}