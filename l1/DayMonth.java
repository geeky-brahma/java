import java.util.Scanner;
class DayMonth
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Day Number: ");
		int dayNum = sc.nextInt();
		switch(dayNum%7)
		{
			case(0):
				System.out.println("Sunday");	
				break;
			case(1):
				System.out.println("Monday");	
				break;
			case(2):
				System.out.println("Tuesday");	
				break;
			case(3):
				System.out.println("Wednesday");	
				break;
			case(4):
				System.out.println("Thursday");	
				break;
			case(5):
				System.out.println("Friday");	
				break;
				
			case(6):
				System.out.println("Saturday");
				break;
		}

	}
}