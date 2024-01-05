package list1.First.prac15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Пример меню в Java");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Создаем меню
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("Файл");
        JMenu editMenu = new JMenu("Правка");
        JMenu helpMenu = new JMenu("Справка");

        // Подменю для "Файл"
        JMenuItem saveItem = new JMenuItem("Сохранить");
        JMenuItem exitItem = new JMenuItem("Выйти");
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        // Подменю для "Правка"
        JMenu editSubMenu = new JMenu("Копировать, вырезать, вставить");
        JMenuItem copyItem = new JMenuItem("Копировать");
        JMenuItem cutItem = new JMenuItem("Вырезать");
        JMenuItem pasteItem = new JMenuItem("Вставить");
        editSubMenu.add(copyItem);
        editSubMenu.add(cutItem);
        editSubMenu.add(pasteItem);
        editMenu.add(editSubMenu);

        // Добавляем меню в бар меню
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);
        frame.setJMenuBar(menuBar);

        // Создаем текстовое поле
        JTextField textField = new JTextField();
        frame.add(textField, BorderLayout.CENTER);

        // Создаем кнопки
        JButton clearButton = new JButton("Очистить");
        JButton selectAllButton = new JButton("Выделить всё");
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(clearButton);
        buttonPanel.add(selectAllButton);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        // Обработчик для кнопки "Очистить"
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("");
            }
        });

        // Обработчик для кнопки "Выделить всё"
        selectAllButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.selectAll();
            }
        });

        // Обработчик для кнопки "Выйти"
        exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        frame.setVisible(true);
    }
}