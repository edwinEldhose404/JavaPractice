package Day11;
import java.util.Scanner;

public class EmployeeManagementSystem {
    private Employee[] employees;
    private int count;
    static int option;
    static int running = 1;
    static Scanner sc = new Scanner(System.in);

    EmployeeManagementSystem() {
        employees = new Employee[100];
        count = 0;
    }

    public static void main(String[] args) {

        EmployeeManagementSystem employ = new EmployeeManagementSystem();

        System.out.println("Welcome to Employee Management System");
        System.out.println("1. Add Employee");
        System.out.println("2. Display All Employees");
        System.out.println("3. Update Employee");
        System.out.println("4. Delete Employee");
        System.out.println("5. Search Employee by ID");
        System.out.println("6. Count Employees by Department");
        System.out.println("7. Exit");

        while (running == 1) {
            System.out.println("Choose an option: ");
            option = sc.nextInt();

            switch (option) {
                case 1 -> employ.addEmployee();
                case 2 -> employ.displayEmployee();
                case 3 -> employ.updateEmployee();
                case 4 -> employ.deleteEmployee();
                case 5 -> employ.searchEmployee();
                case 6 -> employ.countByDepartment();
                case 7 -> running = 0;
                default -> System.out.println("Enter a valid option");
            }
        }
    }

    void addEmployee() {
        System.out.print("Enter Employee ID: ");
        int eid = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String ename = sc.nextLine();

        System.out.print("Enter Department: ");
        String dept = sc.nextLine();

        System.out.print("Enter Salary: ");
        double sal = sc.nextDouble();

        employees[count++] = new Employee(eid, ename, dept, sal);
        System.out.println("Employee added successfully!");
    }

    void displayEmployee() {
        for (int i = 0; i < count; i++) {
            System.out.println(employees[i]);
        }
    }

    void updateEmployee() {
        System.out.print("Enter Employee ID: ");
        int eid = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < count; i++) {
            if (employees[i].getId() == eid) {
                System.out.print("Enter New Name: ");
                employees[i].setName(sc.nextLine());

                System.out.print("Enter New Department: ");
                employees[i].setDepartment(sc.nextLine());

                System.out.print("Enter New Salary: ");
                employees[i].setSalary(sc.nextDouble());

                System.out.println("Employee updated successfully!");
                return;
            }
        }
        System.out.println("Employee not found");
    }

    void deleteEmployee() {
        System.out.print("Enter Employee ID: ");
        int eid = sc.nextInt();

        for (int i = 0; i < count; i++) {
            if (employees[i].getId() == eid) {
                for (int j = i; j < count - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[--count] = null;
                System.out.println("Employee deleted successfully!");
                return;
            }
        }
        System.out.println("Employee not found");
    }

    void searchEmployee() {
        System.out.print("Enter Employee ID: ");
        int eid = sc.nextInt();

        for (int i = 0; i < count; i++) {
            if (employees[i].getId() == eid) {
                System.out.println(employees[i]);
                return;
            }
        }
        System.out.println("Employee not found");
    }

    void countByDepartment() {
        sc.nextLine();
        System.out.print("Enter Department: ");
        String dept = sc.nextLine();
        int c = 0;

        for (int i = 0; i < count; i++) {
            if (employees[i].getDepartment().equalsIgnoreCase(dept)) {
                c++;
            }
        }
        System.out.println("Employee count in " + dept + ": " + c);
    }
}

class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;

    Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    int getId() {
        return id;
    }

    String getDepartment() {
        return department;
    }

    void setName(String name) {
        this.name = name;
    }

    void setDepartment(String department) {
        this.department = department;
    }

    void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return "Employee[ID=" + id + ", Name=" + name + ", Department=" + department + ", Salary=" + salary + "]";
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Employee)) return false;
        Employee e = (Employee) obj;
        return id == e.id;
    }

    public int hashCode() {
        return Integer.hashCode(id);
    }
}
