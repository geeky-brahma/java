
package test;
class MyClass {
    static {
        // Static block
        System.out.println("Class MyClass is being loaded.");
    }
}
public class test{
    public static void main(String[] args) {
        MyClass myc = new MyClass();
        
    }
}
