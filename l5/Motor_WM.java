// package l5;



/**
 * Motor
 */
interface Motor {

    int capacity = 10;
    void run();
    void consume();
}
class WashingMachine implements Motor{
    public void run(){
        System.out.println("This is run.");
    }
    public void consume(){
        System.out.println("The capacity is: "+capacity);
    }
}
public class Motor_WM {
    public static void main(String[] args) {
        WashingMachine wm = new WashingMachine();
        wm.run();
        wm.consume();
    }
    
}
