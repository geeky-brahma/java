import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Choose a shape to calculate its area:");
        System.out.println("1. Circle");
        System.out.println("2. Triangle");
        System.out.println("3. Square");
        System.out.print("Enter your choice (1/2/3): ");
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                System.out.println("Area of the circle: " + area(Math.PI, radius));
                break;
            case 2:
                System.out.print("Enter the base of the triangle: ");
                double base = scanner.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                double height = scanner.nextDouble();
                System.out.println("Area of the triangle: " + area(0.5,base, height));
                break;
            case 3:
                System.out.print("Enter the side of the square: ");
                double side = scanner.nextDouble();
                System.out.println("Area of the square: " + area(side));
                break;
            default:
                System.out.println("Invalid choice!");
        }
        
        scanner.close();
    }
    
    public static double area(double pi, double radius) {
        return pi * radius * radius;
    }
    
    public static double area(double half, double base, double height) {
        return half * base * height;
    }
    
    public static double area(double side) {
        return side * side;
    }
}
