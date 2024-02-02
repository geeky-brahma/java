import java.util.Scanner;
class User_in
{
	public static void main(String args[])
	{
		Scanner myObj = new Scanner (System.in);
		String userName;
		System.out.print("Enter the Name: ");
		userName = myObj.nextLine();
		System.out.println("The Name: " + userName);
	}
}