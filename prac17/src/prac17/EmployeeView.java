package prac17;

public class EmployeeView {
    // Метод для вывода информации о сотруднике
    public void printEmployeeDetails(Employee employee) {
        System.out.println("Имя сотрудника: " + employee.getName());
        System.out.println("Почасовая ставка: $" + employee.getHourlyRate());
        System.out.println("Отработанные часы: " + employee.getHoursWorked());
        System.out.println("Заработная плата: $" + employee.calculateSalary());
    }
}