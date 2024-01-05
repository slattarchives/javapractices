package practise;

public class Report {

    public static void generateReport(Employee[] array) {
        System.out.printf("%-15s%15s\n%s\n", "Employee", "Salary", "---------------------------------");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%-15s%15.2f\n",array[i].getName(), array[i].getSalary());
        }
    }
}
