package l6;
import java.util.Scanner;

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class NumberProcessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        try {
            ProcessInput(number);
        } catch (NegativeNumberException e) {
            System.out.println("Caught the exception:");
            System.out.println("Exception occurred: " + e.getClass().getSimpleName() + ": " + e.getMessage());
        }
    }

    public static void ProcessInput(int number) throws NegativeNumberException {
        if (number < 0) {
            throw new NegativeNumberException("Number should be positive.");
        } else {
            System.out.println("Double value: " + (double) number);
        }
    }
}
