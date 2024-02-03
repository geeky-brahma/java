import java.util.Scanner;

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int[][] matrix = new int[3][3];

        
        System.out.println("Enter the values for a 3x3 matrix:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter value for cell (" + (i + 1) + "," + (j + 1) + "): ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        
        int leftDiagonalSum = 0;
        for (int i = 0; i < 3; i++) {
            leftDiagonalSum += matrix[i][i];
        }
        System.out.println("Sum of left diagonal elements: " + leftDiagonalSum);

        
        int rightDiagonalSum = 0;
        for (int i = 0; i < 3; i++) {
            rightDiagonalSum += matrix[i][2 - i];
        }
        System.out.println("Sum of right diagonal elements: " + rightDiagonalSum);

        scanner.close();
    }
}
