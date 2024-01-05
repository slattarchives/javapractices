package prac17;

public class Employee {
    private String name;
    private double hourlyRate;
    private int hoursWorked;

    public Employee(String name, double hourlyRate, int hoursWorked) {
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public String getName() {
        return name;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    // Метод для расчета заработной платы
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    public void setName(String name) {
        this.name = name; // Устанавливаем новое имя
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate; // Устанавливаем новую почасовую ставку
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked; // Устанавливаем новое количество отработанных часов
    }
}