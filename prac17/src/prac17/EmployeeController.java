package prac17;

// Класс EmployeeController (Контроллер)
public class EmployeeController {
    private Employee model;
    private EmployeeView view;

    public EmployeeController(Employee model, EmployeeView view) {
        this.model = model;
        this.view = view;
    }

    // Метод для обновления представления с информацией о сотруднике
    public void updateEmployeeView() {
        view.printEmployeeDetails(model);
    }

    // Методы для установки значений модели (имени, почасовой ставки и отработанных часов)
    public void setEmployeeName(String name) {
        model.setName(name);
    }

    public void setEmployeeHourlyRate(double hourlyRate) {
        model.setHourlyRate(hourlyRate);
    }

    public void setEmployeeHoursWorked(int hoursWorked) {
        model.setHoursWorked(hoursWorked);
    }
}