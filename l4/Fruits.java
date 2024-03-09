package l4;

class Apple {
    void show() {
        System.out.println("This is Apple");
    }
}

class Banana extends Apple {
    void show() {
        System.out.println("This is Banana");
    }
}

class Cherry extends Apple {
    void show() {
        System.out.println("This is Cherry");
    }
}

public class Fruits {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Apple banana = new Banana();
        Apple cherry = new Cherry();
        
        apple.show();
        banana.show();
        cherry.show();
    }
}
