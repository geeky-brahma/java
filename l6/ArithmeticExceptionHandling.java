package l6;

import java.util.Scanner;

public class ArithmeticExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the dividend: ");
        int dividend = scanner.nextInt();
        
        System.out.println("Enter the divisor: ");
        int divisor = scanner.nextInt();
        
        try {
            int result = dividend / divisor;
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: Division by zero is not allowed.");
        } finally {
            System.out.println("Finally block executed.");
            scanner.close();
        }
    }
}

