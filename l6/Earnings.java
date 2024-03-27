package l6;

import java.util.Scanner;
import l6.General.Employee;
import l6.Marketing.Sales;

public class Earnings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input employee details
        System.out.print("Enter the employee id and employee name: ");
        int empid = scanner.nextInt();
        String ename = scanner.next();

        System.out.print("Enter the basic salary: ");
        double basic = scanner.nextDouble();

        // Create an instance of Sales class
        Sales salesPerson = new Sales(empid, ename);

        // Calculate total earnings and travelling allowance
        double totalEarnings = salesPerson.earnings(basic);
        double travelAllowance = salesPerson.tAllowance(basic);

        // Print the results
        System.out.println("The emp id of the employee is " + empid);
        System.out.println("The total earning is " + totalEarnings);
    }
}
