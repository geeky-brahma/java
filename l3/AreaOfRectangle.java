import java.util.Scanner;

class Rectangle {
    private double length;
    private double breadth;

    
    public Rectangle() {
        this.length = 0;
        this.breadth = 0;
    }

    
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    
    public double calculateArea() {
        return length * breadth;
    }
}

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Using default constructor
        Rectangle rect1 = new Rectangle();

        System.out.println("Using Default Constructor:");
        System.out.println("Area of Rectangle: " + rect1.calculateArea());
        System.out.println();

        // Using parameterized constructor
        System.out.print("Enter length of rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter breadth of rectangle: ");
        double breadth = scanner.nextDouble();

        Rectangle rect2 = new Rectangle(length, breadth);

        System.out.println("\nUsing Parameterized Constructor:");
        System.out.println("Area of Rectangle: " + rect2.calculateArea());

        scanner.close();
    }
}
