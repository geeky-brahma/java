import java.util.Scanner;

public class LargestIntegerFinder {
    public static void main(String[] args) {
        // Create Scanner object to take input
        Scanner scanner = new Scanner(System.in);

    
        System.out.println("Enter three numbers:");

    
        System.out.print("Number 1: ");
        double num1 = scanner.nextDouble();

    
        System.out.print("Number 2: ");
        double num2 = scanner.nextDouble();

        
        System.out.print("Number 3: ");
        double num3 = scanner.nextDouble();

        // Check if the entered numbers are integers
        if (isInteger(num1) && isInteger(num2) && isInteger(num3)) {
            
            int largest = findLargest((int) num1, (int) num2, (int) num3);

            
            System.out.println("The largest number among the input integers is: " + largest);
        } else {
            
            System.out.println("Enter valid integer inputs.");
        }

        
    }

    // Method to check if a number is an integer
    private static boolean isInteger(double num) {
        return num % 1 == 0;
    }

    // Method to find the largest among three integers
    private static int findLargest(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }
}
