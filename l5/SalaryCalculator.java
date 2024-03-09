package l5;

import java.util.Scanner;


interface Payable {
    double earnings(double basic);
    double deductions(double basic);
    double bonus(double basic);
}


class Manager implements Payable {
    @Override
    public double earnings(double basic) {
        double da = 0.8 * basic;
        double hra = 0.15 * basic;
        return basic + da + hra;
    }

    @Override
    public double deductions(double basic) {
        return 0.12 * basic; // 12% of basic as PF deduction
    }

    // Bonus method is not implemented here
    @Override
    public double bonus(double basic) {
        throw new UnsupportedOperationException("Bonus method not implemented for Manager");
    }
}


class Substaff extends Manager {
    @Override
    public double bonus(double basic) {
        return 0.5 * basic; // 50% of basic as bonus
    }
}

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Basic Salary: ");
        double basicSalary = sc.nextInt();
        
        Manager manager = new Manager();
        Substaff substaff = new Substaff();

        // Calculate and display earnings, deductions, and bonus for Substaff
        double earnings = substaff.earnings(basicSalary);
        double deductions = substaff.deductions(basicSalary);
        double bonus = substaff.bonus(basicSalary);

        System.out.println("Substaff Earnings: " + earnings);
        System.out.println("Substaff Deductions: " + deductions);
        System.out.println("Substaff Bonus: " + bonus);
    }
}
