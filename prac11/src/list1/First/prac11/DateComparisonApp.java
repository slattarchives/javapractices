package list1.First.prac11;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateComparisonApp {
    public static void main(String[] args) {
        // Создаем объект SimpleDateFormat для ввода даты от пользователя
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

        // Получаем текущую дату и время
        Date currentDate = new Date();

        // Запрос у пользователя ввода даты
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите дату и время (dd.MM.yyyy HH:mm:ss): ");
        String userInput = scanner.nextLine();

        try {
            // Преобразуем введенный текст в объект Date
            Date userDate = dateFormat.parse(userInput);

            // Сравниваем даты
            if (userDate.before(currentDate)) {
                System.out.println("Введенная дата раньше текущей.");
            } else if (userDate.after(currentDate)) {
                System.out.println("Введенная дата позже текущей.");
            } else {
                System.out.println("Введенная дата совпадает с текущей.");
            }
        } catch (ParseException e) {
            System.err.println("Ошибка: Неверный формат даты и времени. Используйте формат dd.MM.yyyy HH:mm:ss");
        }

        scanner.close();
    }
}