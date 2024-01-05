package prac18.ex7;

import java.util.Scanner;

public class ThrowsDemo {
    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
        String key;
        do {
            System.out.print("Enter a key: ");
            key = myScanner.next();
        } while (key.equals(""));
        printDetails(key);
    }

    public void printDetails(String key) {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    private String getDetails(String key) throws Exception {
        if (key.equals("")) {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        ThrowsDemo demo = new ThrowsDemo();
        demo.getKey();
    }
}
/* В этом задании представлен класс ThrowsDemo, который содержит методы для
ввода ключа и вывода данных на основе ключа. Если ключ пустой, то метод getDetails бросает
исключение Exception.

В шаге 1, мы создали этот класс, но при попытке компиляции возникла ошибка,
так как метод getKey не объявляет, что он может бросать исключение, которое генерирует метод getDetails.

В шаге 2, мы убрали throws Exception из метода getKey и добавили блок
try-catch для обработки исключений. Теперь программа успешно компилируется
и позволяет пользователю вводить ключи.

В шаге 3, добавлен цикл для предоставления




*/