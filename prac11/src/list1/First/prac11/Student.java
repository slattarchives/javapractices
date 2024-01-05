package list1.First.prac11;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    private String name;          // Имя студента
    private int id;               // Идентификационный номер студента
    private Date dateOfBirth;     // Добавляем поле для даты рождения

    // Конструктор класса Student
    public Student(String name, int id, Date dateOfBirth) {
        this.name = name;
        this.id = id;
        this.dateOfBirth = dateOfBirth;
    }

    // Геттер для получения даты рождения
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    // Метод для форматирования даты рождения в указанный формат
    public String formatDateOfBirth(String format) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        return dateFormat.format(dateOfBirth);
    }

    // Переписанный метод toString() для вывода информации о студенте
    @Override
    public String toString() {
        return "ID: " + id + "\nИмя: " + name + "\nДата рождения: " + dateOfBirth;
    }

    public static void main(String[] args) {
        // Пример использования
        Date dateOfBirth = new Date();  // Здесь можно установить конкретную дату рождения
        Student student = new Student("Иванов Иван", 1, dateOfBirth);

        // Вывод информации о студенте
        System.out.println(student);

        // Форматирование даты рождения в разные форматы
        System.out.println("Дата рождения в коротком формате: " + student.formatDateOfBirth("dd.MM.yy"));
        System.out.println("Дата рождения в среднем формате: " + student.formatDateOfBirth("dd MMM yyyy"));
        System.out.println("Дата рождения в полном формате: " + student.formatDateOfBirth("dd.MM.yyyy HH:mm:ss"));
    }
}