package test;

import java.util.Scanner;

class Technical{
    int bsalary;
    double earn, deduction, bonus, net;
    void input(int s)
    {
        bsalary = s;
    }
    void slip(){
        earn = bsalary + (0.4*bsalary) + (0.15 * bsalary);
        deduction = 0.12 * bsalary;
        bonus = 0.2 * bsalary;
        net = earn-deduction+bonus;
        System.out.println("Earning = "+earn);
        System.out.println("Deduction = "+deduction);
        System.out.println("Bonus = "+bonus);
        System.out.println("Net salary = "+net);
    }

}

class NonTech extends Technical{
    void input(int sal){
        bsalary = sal;
    }

}

public class Salary_Calc {
    public static void main(String[] args) {
        Technical tech = new Technical();
        NonTech ntech = new NonTech();
        Scanner sc = new Scanner(System.in);

        int salary;

        System.out.println("Enter Basic salary for Technical: ");
        salary = sc.nextInt();
        tech.input(salary);
        tech.slip();

        System.out.println("Enter Basic salary for Non-Technical: ");
        salary = sc.nextInt();
        ntech.input(salary);
        ntech.slip();
        sc.close();

    }
}
