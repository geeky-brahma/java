package l6;
import java.util.Scanner;
public class ArrayInOutOfBound {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            // Input numbers
            System.out.print("Enter the numbers: ");
            String[] numbers = scanner.nextLine().split(" ");

            int[] array = new int[4];

            // Fill the array
            for (int i = 0; i < numbers.length; i++) {
                array[i] = Integer.parseInt(numbers[i]);
            }

            int value = array[4];
            System.out.println("Value at index 4: " + value); 
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: "+e);
        }
    }
}



