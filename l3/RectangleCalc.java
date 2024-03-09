import java.util.Scanner;

class Rectangle {
    private double length;
    private double breadth;

    
    public void read() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of rectangle: ");
        length = scanner.nextDouble();
        System.out.print("Enter breadth of rectangle: ");
        breadth = scanner.nextDouble();
    }

    
    public double calculateArea() {
        return length * breadth;
    }

    
    public double calculatePerimeter() {
        return 2 * (length + breadth);
    }

    
    public void display() {
        System.out.println("Area of Rectangle: " + calculateArea());
        System.out.println("Perimeter of Rectangle: " + calculatePerimeter());
    }
}

public class RectangleCalc {
    public static void main(String[] args) {
        
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle();

        
        System.out.println("For Rectangle 1:");
        rect1.read();

        
        System.out.println("For Rectangle 2:");
        rect2.read();

        
        System.out.println("Rectangle 1:");
        rect1.display();
        
        
        System.out.println("Rectangle 2:");
        rect2.display();
    }
}
