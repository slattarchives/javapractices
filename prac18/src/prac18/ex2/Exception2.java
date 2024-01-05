package prac18.ex2;

import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        String intString = myScanner.next();
        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter an integer.");
        } catch (ArithmeticException e) {
            System.out.println("Attempted division by zero.");
        }
    }

    public static void main(String[] args) {
        Exception2 demo = new Exception2();
        demo.exceptionDemo();
    }
}
/*    В шаге 1 мы предоставили программу, которая пытается делить число 2 на введенное пользователем целое число.
Если пользователь вводит некорректные данные, программа вызовет исключение.

        При вводе некорректных данных, таких как "Qwerty", "0", "1.2",
        программа вызывает разные исключения:

        Ввод "Qwerty" вызовет NumberFormatException, так как программа пытается преобразовать
        некорректную строку в целое число.
        Ввод "0" вызовет ArithmeticException, так как программа пытается делить на ноль.
        Ввод "1.2" также вызовет NumberFormatException, так как программа ожидает ввод целого числа.
        В шаге 3, мы добавили блоки try-catch для обработки исключений. Теперь при вводе
        некорректных данных программа не "ломается", а вместо этого выводит соответствующее сообщение
        об ошибке.*/