// package l5;

import java.util.Scanner;

// Define the Employee interface
interface Employee {
    void getDetails();
}

// Define the Manager interface extending Employee
interface Manager extends Employee {
    void getDeptDetails();
}

// Define the Head class implementing the Manager interface
class Head implements Manager {
    private int empId;
    private String empName;
    private int deptId;
    private String deptName;
    Scanner scanner = new Scanner(System.in);
    @Override
    public void getDetails() {
        // Scanner scanner = new Scanner(System.in);
        System.out.println("Enter employee id:");
        empId = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println("Enter employee name:");
        empName = scanner.nextLine();
    }
    
    @Override
    public void getDeptDetails() {
        // Scanner scanner = new Scanner(System.in);
        System.out.println("Enter department id:");
        deptId = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println("Enter department name:");
        deptName = scanner.nextLine();
    }
    
    public void printDetails() {
        System.out.println("Employee id - " + empId);
        System.out.println("Employee name - " + empName);
        System.out.println("Department id - " + deptId);
        System.out.println("Department name - " + deptName);
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {
        Head head = new Head();
        head.getDetails();
        head.getDeptDetails();
        head.printDetails();
    }
}
