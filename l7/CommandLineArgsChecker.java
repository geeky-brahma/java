package l7;

class CheckArgument extends Exception {
    public CheckArgument(String message) {
        super(message);
    }
}

public class CommandLineArgsChecker {

    public static void main(String[] args) {
        try {
            // Check if the number of arguments is less than four
            if (args.length < 4) {
                throw new CheckArgument("Exception occurred - CheckArgument");
            }

            // Calculate the addition of squares of all four elements
            int sum = 0;
            for (int i = 0; i < 4; i++) {
                int number = Integer.parseInt(args[i]);
                sum += number * number;
            }

            // Print the result
            System.out.println(sum);
        } catch (CheckArgument e) {
            // Catch and print the custom exception message
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            // Catch and handle potential NumberFormatException
            System.out.println("Please ensure all arguments are integers.");
        }
    }
}
