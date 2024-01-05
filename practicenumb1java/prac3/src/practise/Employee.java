package practise;

public class Employee {
    private String fullname;
    private float salary;

    public Employee(String name, float salary) {
        this.fullname = name;
        this.salary = salary;
    }

    public Employee() {
        this.fullname = "default name";
        this.salary = (float)0.00;
    }

    public String getName() {
        return this.fullname;
    }

    public float getSalary() {
        return this.salary;
    }
}
