public class EvenOddCounter {
    public static void main(String[] args) {
        // Check if there are exactly ten command line arguments
        if (args.length != 10) {
            System.out.println("Please provide exactly ten numbers as command line arguments.");
            return;
        }

        // Arrays to store even and odd numbers
        int[] evenNumbers = new int[10];
        int[] oddNumbers = new int[10];

        // Variables to keep track of counts
        int evenCount = 0;
        int oddCount = 0;

        // Process command line arguments
        for (int i = 0; i < 10; i++) {
            try {
                // Parse the command line argument to an integer
                int number = Integer.parseInt(args[i]);

                // Check if the number is even or odd
                if (number % 2 == 0) {
                    evenNumbers[evenCount] = number;
                    evenCount++;
                } else {
                    oddNumbers[oddCount] = number;
                    oddCount++;
                }
            } catch (NumberFormatException e) {
                // Handle non-integer input
                System.out.println("Please enter valid integers only. Skipping input: " + args[i]);
            }
        }

        // Print counts and corresponding numbers
        System.out.println("Even Numbers Count: " + evenCount);
        System.out.print("Even Numbers: ");
        for (int i = 0; i < evenCount; i++) {
            System.out.print(evenNumbers[i] + " ");
        }

        System.out.println(); // Move to the next line for better formatting

        System.out.println("Odd Numbers Count: " + oddCount);
        System.out.print("Odd Numbers: ");
        for (int i = 0; i < oddCount; i++) {
            System.out.print(oddNumbers[i] + " ");
        }
    }
}
