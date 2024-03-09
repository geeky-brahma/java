package l4;
import java.util.Scanner;

class TwoDim{
    int costPerSqFt = 40;
    int fPrice(int l, int b){
        int area = l * b;
        int fCost = area * costPerSqFt;
        return fCost;
    }
}

class ThreeDim extends TwoDim{
    int costPerCubic = 60;
    int fPrice(int l, int b, int h){
        int volume = l * b * h;
        int fCost = volume * costPerCubic;
        return fCost;
    }
}

public class Platic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter length and breadth for 2D shape:");
        int length2D = scanner.nextInt();
        int breadth2D = scanner.nextInt();
        
        System.out.println("Enter length, breadth, and height for 3D shape:");
        int length3D = scanner.nextInt();
        int breadth3D = scanner.nextInt();
        int height3D = scanner.nextInt();
        
        scanner.close();
        
        ThreeDim obj = new ThreeDim();
        int cost2D = obj.fPrice(length2D, breadth2D);
        int cost3D = obj.fPrice(length3D, breadth3D, height3D);
        
        System.out.println("Cost of 2D shape: Rs " + cost2D);
        System.out.println("Cost of 3D shape: Rs " + cost3D);
    }
}

