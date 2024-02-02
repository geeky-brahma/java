import java.util.Scanner;
class Palindrome
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int OGNum = sc.nextInt();
		int NewNum=0;
		int i = OGNum;
		while(i!=0)
		{
			NewNum= (NewNum*10)+(i%10);
			i/=10;
		}
		if (OGNum==NewNum)
		{
			System.out.println("Palindrome successfully detected!!");
		}
		else{
			System.out.println("The input number is not a palindrome!!");	
		}
		

	}
}