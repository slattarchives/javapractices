package prac23;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение x: ");

        if (scanner.hasNextDouble()) {
            double x = scanner.nextDouble();

            // Пример вычисления выражения x^2 + 2x + 1
            Expression expression = new Add(
                    new Add(
                            new Multiply(new Variable("x"), new Variable("x")),
                            new Multiply(new Const(2), new Variable("x"))
                    ),
                    new Const(1)
            );


            double result = expression.evaluate(x);
            System.out.println("Результат: " + result);
        } else {
            System.out.println("Некорректный ввод. Пожалуйста, введите число.");
        }

        scanner.close();
    }
}