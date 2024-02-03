import java.util.Scanner;

public class ElementOccurrencesCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // System.out.print("Enter the size of the array: ");
        int size = Integer.parseInt(args[0]);

        int[] array = new int[size];

        System.out.println("Enter the array elements:");

        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.println("Element Occurrences:");

        
        for (int i = 0; i < size; i++) {
            if (array[i] != -1) {
                int count = 1;

                for (int j = i + 1; j < size; j++) {
                    if (array[i] == array[j]) {
                        count++;
                        array[j] = -1;  // Mark repeated elements to avoid recounting
                    }
                }

                System.out.println("Element " + array[i] + ": " + count + " occurrences");
            }
        }

        scanner.close();
    }
}
