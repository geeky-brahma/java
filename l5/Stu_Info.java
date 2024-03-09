package l5;
import java.util.Scanner;
abstract class Student {
    int roll_no;
    int reg_no;
    void getInput(int roll, int reg_no){
        roll_no = roll;
        this.reg_no = reg_no;
    }
    abstract int[] course();
    
}
/**
 * Kiitians
 */
class Kiitians extends Student {

    int[] course(){
        int[] details= {roll_no,reg_no};
        return details;
    }
}
public class Stu_Info {
    public static void main(String[] args) {
        Kiitians k1 = new Kiitians();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Roll No.: ");
        int roll = sc.nextInt();
        System.out.println("Enter the Reg No.: ");
        int reg = sc.nextInt();
        k1.getInput(roll, reg);
        int[] res = k1.course();
        System.out.println("Roll no.: "+res[0]+"\nReg No.: "+res[1]);
    }
    
}
