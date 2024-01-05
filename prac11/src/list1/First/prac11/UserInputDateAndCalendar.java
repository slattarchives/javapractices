package list1.First.prac11;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class UserInputDateAndCalendar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запрос у пользователя года, месяца и числа
        System.out.println("Введите год (например, 2023): ");
        int year = scanner.nextInt();
        System.out.println("Введите месяц (1-12): ");
        int month = scanner.nextInt() - 1; // Вычитаем 1, так как месяцы в Java начинаются с 0
        System.out.println("Введите число (1-31): ");
        int dayOfMonth = scanner.nextInt();

        // Запрос у пользователя часов и минут
        System.out.println("Введите часы (0-23): ");
        int hours = scanner.nextInt();
        System.out.println("Введите минуты (0-59): ");
        int minutes = scanner.nextInt();

        // Создаем объект Date на основе введенных данных
        Date date = createDate(year, month, dayOfMonth, hours, minutes);

        // Создаем объект Calendar и устанавливаем его на основе введенных данных
        Calendar calendar = createCalendar(year, month, dayOfMonth, hours, minutes);

        // Выводим созданные объекты Date и Calendar
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        System.out.println("Созданный объект Date: " + dateFormat.format(date));
        System.out.println("Созданный объект Calendar: " + dateFormat.format(calendar.getTime()));

        scanner.close();
    }

    // Метод для создания объекта Date
    private static Date createDate(int year, int month, int dayOfMonth, int hours, int minutes) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, dayOfMonth, hours, minutes);
        return calendar.getTime();
    }

    // Метод для создания объекта Calendar
    private static Calendar createCalendar(int year, int month, int dayOfMonth, int hours, int minutes) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, dayOfMonth, hours, minutes);
        return calendar;
    }
}