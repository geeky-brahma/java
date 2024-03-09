package l4;

import java.util.Scanner;

class Plate {
    int length, width;
    
    public Plate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter plate dimensions (length and width):");
        length = scanner.nextInt();
        width = scanner.nextInt();
        // scanner.close();
    }
}

class Box extends Plate {
    int height;
    
    public Box() {
        super();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter box height:");
        height = scanner.nextInt();
        // scanner.close();
    }
}

class WoodBox extends Box {
    int thick;
    
    public WoodBox() {
        super();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter woodbox thickness:");
        thick = scanner.nextInt();
        // scanner.close();
    }
}

public class Box_Calc {
    public static void main(String[] args) {
        WoodBox woodBox = new WoodBox();
        System.out.println("Dimensions of WoodBox: " + woodBox.length + "x" + woodBox.width + "x" + woodBox.height + " with thickness " + woodBox.thick);
    }
}
