package Day11;
import java.util.Scanner;


public class EmployeeManagementSystem{
    Employee[] employees;
    int count;
    static int option;
    static int running = 1;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Employee Management System");
        System.out.println("1. Add Employee");
        System.out.println("2. Display All Employees");
        System.out.println("3. Update Employee");
        System.out.println("4. Delete Employee");
        System.out.println("5. Search Employee by ID");
        System.out.println("6. Count Employees by Department");
        System.out.println("7. Exit");

        while (running == 1){
            System.out.println("Choose an option: ");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    addEmployee();
                    break;

                case 2:
                    displayEmployee();
                    break;

                case 3:
                    updateEmployee();
                    break;

                case 4:
                    deleteEmployee();
                    break;

                case 5:
                    searchEmployee();
                    break;

                case 6:
                    countByDepartment();
                    break;
            
                case 7:
                    running = 0;
                    break;

                default:
                    System.out.println("Enter a valid option");
                    break;
            }
        }
    }

    static void addEmployee(){

    }

    static void displayEmployee(){

    }

    static void updateEmployee(){

    }

    static void deleteEmployee(){

    }

    static void searchEmployee(){

    }

    static void countByDepartment(){

    }

}

class Employee{
    private int id;
    private String name;
    private String department;
    private double salary;

    Employee(int id,String name,String department,double salary){
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    int getId(){
        return this.id;
    }

    String getDepartment(){
        return this.department;
    }

    void setName(String name){
        this.name = name;
    }

    void setDepartment(String department){
        this.department = department;
    }

    void setSalary(double salary){
        this.salary = salary;
    }

    public String toString(){
        return "Employee[ID="+this.id+",Name="+this.name+",Department="+this.department+",Salary="+this.salary;
    }

    public boolean equals(Object obj){
        Employee m = (Employee)obj;
        return  m.id == this.id;
    }

    public int hashCode(Object obj){
        return hashCode(this.id);
    }
}
