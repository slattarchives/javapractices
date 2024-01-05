package prac18.ex3;

import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        String intString = myScanner.next();
        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Exception2 demo = new Exception2();
        demo.exceptionDemo();
    }
}
/*    В шаге 1 мы попытались перехватить общее исключение класса Exception.
      Однако, это не рекомендуется, так как это может затруднить отладку и делает код менее читаемым.

        В шаге 2, после перезапуска программы, она по-прежнему вызовет исключения NumberFormatException
        и ArithmeticException, но обработка этих исключений будет выполнена блоками catch
        для соответствующих исключений, а не блоком catch для общего исключения Exception.*/