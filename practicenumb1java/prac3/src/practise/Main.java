package practise;

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nВведите номер задания");

            Scanner in = new Scanner(System.in);
            int task = in.nextInt();

            switch (task) {
                case 0:
                    System.out.println("EXIT");
                    return;
                case 1:
                    System.out.println("Задание 1");
                    ex1();
                    break;
                case 2:
                    System.out.println("Задание 2");
                    ex2();
                    break;
            }

        }
    }




    public static void ex1(){
        // создаем случ. целые числа в диапазоне 0 to 999
        int length = 10; // длина массива
        int[] nums = new int[length];

        Random random = new Random(); // создаем объект класса Random

        for (int i = 0; i < length; i++) {
            // заполняем каждый элемент случайным числом от 0 до 99
            nums[i] = random.nextInt(100);
        }
        //Выводим неотсортированный массив nums
        System.out.println("Неотсортированный массив:");
        System.out.println(Arrays.toString(nums));
        //Сортируем массив nums
        Arrays.sort(nums);
        // выводим массив на экран
        System.out.println("Отсортированный массив:");
        System.out.println(Arrays.toString(nums));
    }

    public static void ex2() {
        Employee[] employees = new Employee[4];

        for (int i = 0; i < employees.length; i++) {
            employees[i] = new Employee();
        }

        employees[0] = new Employee("Bob", 4000);
        employees[1] = new Employee("Gregory", 100500);
        employees[2] = new Employee("John", 999);
        employees[3] = new Employee("Alexander", 2500);

        Report.generateReport(employees);
    }

}