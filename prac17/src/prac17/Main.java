package prac17;

// Пример использования
public class Main {
    public static void main(String[] args) {
        // Создаем объект сотрудника
        Employee employee = new Employee("Иван", 20.0, 40);
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(employee, view);

        // Вывести информацию о сотруднике
        controller.updateEmployeeView();

        // Изменить данные о сотруднике
        controller.setEmployeeHourlyRate(30);
        controller.setEmployeeHoursWorked(50);

        // Вновь вывести информацию о сотруднике
        controller.updateEmployeeView();
    }
}