package prac18.ex4;

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
        } finally {
            System.out.println("This is the finally block.");
        }
    }

    public static void main(String[] args) {
        Exception2 demo = new Exception2();
        demo.exceptionDemo();
    }
}
/* В шаге 1, мы добавили блок finally. Блок finally выполняется всегда, независимо от того,
   произошло исключение или нет. Это может быть полезно, например, для освобождения ресурсов,
   таких как файлы или сетевые соединения.

При повторном запуске программы в шаге 2, блок finally будет выполнен после того,
как блоки try и catch завершатся. Это позволяет гарантировать, что некоторый код будет выполнен
независимо от того, возникло исключение или нет.*/