package prac22;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

public class RPNCalculator extends JFrame {
    private JTextField inputField;
    private JTextField resultField;

    public RPNCalculator() {
        setTitle("RPN Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 400);
        setLayout(new BorderLayout());

        inputField = new JTextField();
        resultField = new JTextField();
        resultField.setEditable(false);

        JPanel buttonPanel = new JPanel(new GridLayout(5, 4));

        String[] buttonLabels = {
                "7", "8", "9", "+",
                "4", "5", "6", "-",
                "1", "2", "3", "*",
                "C", "0", "=", "/",
        };

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.addActionListener(new ButtonClickListener());
            buttonPanel.add(button);
        }

        add(inputField, BorderLayout.NORTH);
        add(resultField, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                RPNCalculator calculator = new RPNCalculator();
                calculator.setVisible(true);
            }
        });
    }

    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String buttonLabel = ((JButton) e.getSource()).getText();

            if (buttonLabel.equals("=")) {
                try {
                    String expression = inputField.getText();
                    double result = evaluateRPN(expression);
                    resultField.setText(Double.toString(result));
                } catch (IllegalArgumentException ex) {
                    resultField.setText("Error: " + ex.getMessage());
                }
            } else if (buttonLabel.equals("C")) {
                inputField.setText("");
            } else {
                inputField.setText(inputField.getText() + buttonLabel);
            }
        }
    }

    private double evaluateRPN(String expression) {
        String[] tokens = expression.split(" ");
        Stack<Double> stack = new Stack<>();

        for (String token : tokens) {
            if (token.matches("-?\\d+(\\.\\d+)?")) {
                stack.push(Double.parseDouble(token));
            } else if (token.matches("[+\\-*/]")) {
                if (stack.size() < 2) {
                    throw new IllegalArgumentException("Not enough operands for operator: " + token);
                }
                double b = stack.pop();
                double a = stack.pop();
                double result = 0;
                switch (token) {
                    case "+":
                        result = a + b;
                        break;
                    case "-":
                        result = a - b;
                        break;
                    case "*":
                        result = a * b;
                        break;
                    case "/":
                        if (b == 0) {
                            throw new IllegalArgumentException("Division by zero");
                        }
                        result = a / b;
                        break;
                }
                stack.push(result);
            } else {
                throw new IllegalArgumentException("Invalid token: " + token);
            }
        }

        if (stack.size() != 1) {
            throw new IllegalArgumentException("Invalid expression");
        }

        return stack.pop();
    }
}