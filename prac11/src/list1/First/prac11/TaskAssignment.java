package list1.First.prac11;
import java.util.Date;

public class TaskAssignment {
    public static void main(String[] args) {
        // Фамилия разработчика
        String developerLastName = "Фамилия Разработчика";

        // Дата и время получения задания
        Date dateAssigned = new Date(); // Создаем объект Date, который представляет текущую дату и время

        // Дата и время сдачи задания (сдача задания произойдет через 9 дней)
        long dueDateMillis = System.currentTimeMillis() + 9 * 24 * 60 * 60 * 1000; // Рассчитываем миллисекунды через 9 дней
        Date dueDate = new Date(dueDateMillis); // Создаем объект Date для даты и времени сдачи задания

        // Вывод информации о задании
        System.out.println("Фамилия разработчика: " + developerLastName);
        System.out.println("Дата и время получения задания: " + dateAssigned); // Выводим дату и время получения задания
        System.out.println("Дата и время сдачи задания: " + dueDate); // Выводим дату и время сдачи задания
    }
}