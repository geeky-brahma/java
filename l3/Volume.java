import java.util.Scanner;
class Box{
    int length;
    int width;
    int height;
    void insert(int l, int w, int h){
        length=l;
        width=w;
        height=h;
    }
    int volume(){
        return (length*width*height);
    }
}

class Volume{
    public static void main(String args[]){
        Box b1 = new Box();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter l: ");
        int l = sc.nextInt();
        System.out.println("Enter w: ");
        int w = sc.nextInt();
        System.out.println("Enter h: ");
        int h = sc.nextInt();

        b1.insert(l,w,h);
        
        System.out.println(b1.volume());
    }
}