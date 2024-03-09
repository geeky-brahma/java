class Subtract{
    int subtract(int a, int b){
        return (a-b);
    }
    int subtract(int a, int b, int c){
        return (a-b-c);
    }
    float subtract(float a, float b){
        return (a-b);
    }
}

public class SubtractMethodOverload {
    public static void main(String[] args) {
        Subtract s1 = new Subtract();
        System.out.println(s1.subtract(2,1));
        Subtract s2 = new Subtract();
        System.out.println(s2.subtract(3,2,1));
        Subtract s3 = new Subtract();
        System.out.println(s3.subtract(2.0f,1.0f));
    }
}