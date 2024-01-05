package list1.First.prac12;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RectangleAnimation extends JPanel implements ActionListener {
    private int x = 0; // Начальная координата X прямоугольника
    private int frame = 0; // Текущий кадр анимации
    private Timer timer;
    private static final int RECTANGLE_WIDTH = 50;
    private static final int RECTANGLE_HEIGHT = 50;

    public RectangleAnimation() {
        timer = new Timer(100, this); // Создаем таймер с интервалом 100 миллисекунд и устанавливаем себя как слушателя событий
        timer.start(); // Запускаем таймер
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, getWidth(), getHeight());

        // Определите кадры анимации, например, 5 кадров
        int numFrames = 5;

        // Вычислите текущий кадр анимации
        frame = (frame + 1) % numFrames; // Увеличиваем текущий кадр и обеспечиваем зацикливание анимации

        // Вычислите X-координату на основе текущего кадра
        x = (getWidth() - RECTANGLE_WIDTH) * frame / numFrames; // Рассчитываем новую X-координату для анимации

        // Рисуем красный прямоугольник
        g.setColor(Color.RED);
        g.fillRect(x, (getHeight() - RECTANGLE_HEIGHT) / 2, RECTANGLE_WIDTH, RECTANGLE_HEIGHT);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint(); // Перерисовка панели для следующего кадра
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Анимация прямоугольника");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Устанавливаем действие при закрытии окна
            frame.add(new RectangleAnimation()); // Добавляем экземпляр нашего класса на окно
            frame.setSize(400, 200); // Устанавливаем размер окна
            frame.setVisible(true); // Делаем окно видимым
        });
    }
}