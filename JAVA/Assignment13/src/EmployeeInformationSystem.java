import java.util.Scanner;

class Employee {
    String name;
    int employeeId;
    String department;
    double salary;

    // constructor
    public Employee(String name, int employeeId, String department, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.department = department;
        this.salary = salary;
    }

    // getters

    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            System.out.println("Salary can't be negative");
        } else {
            this.salary = salary;
        }
    }

    public void displayEmployeeDetails() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}

public class EmployeeInformationSystem {
    public static void main(String[] args) {

        Employee e1 = new Employee("Bilgod", 101, "IT", 90000);
        Employee e2 = new Employee("God", 102, "IT", 100000);

        int choice;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an operation:");
            System.out.println("1. Update Salary");
            System.out.println("2. Display employee details");
            System.out.println("3. Exit");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter employee ID:");
                    int id = scanner.nextInt();
                    if (id == e1.getEmployeeId()) {
                        System.out.println("Enter the new salary:");
                        double newSalary = scanner.nextDouble();
                        e1.setSalary(newSalary);
                    } else if (id == e2.getEmployeeId()) {
                        System.out.println("Enter the new salary:");
                        double newSalary = scanner.nextDouble();
                        e2.setSalary(newSalary);
                    } else {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 2:
                    System.out.println("Enter employee ID:");
                    id = scanner.nextInt();
                    if (id == e1.getEmployeeId()) {
                        e1.displayEmployeeDetails();
                    } else if (id == e2.getEmployeeId()) {
                        e2.displayEmployeeDetails();
                    } else {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 3:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}