import java.util.Scanner;
class UserDetails
{
	public static void main(String args[])
	{
		Scanner myObj = new Scanner (System.in);
		
		for (int i=0; i<3; i++)
		{	
			System.out.println("Enter Details for User"+i);
			System.out.print("Enter Name: ");
			String p_name = myObj.nextLine();
			System.out.print("Enter Roll: ");
			int p_roll = myObj.nextInt();
			System.out.print("Enter Section: ");
			myObj.nextLine();
			String p_sec = myObj.nextLine();
			System.out.print("Enter Branch: ");
			String p_branch = myObj.nextLine();

			System.out.println("\n");

			System.out.println("User"+i);
			System.out.println("Name: "+p_name);
			System.out.println("Roll: "+p_roll);
			System.out.println("Sec: "+p_sec);
			System.out.println("Branch: "+p_branch);

			System.out.println("\n");
			
		}
	}
}