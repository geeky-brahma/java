import java.util.Scanner;
class MarkGrade
{
	public static void main(String args[])
	{
		Scanner myObj = new Scanner(System.in);
		System.out.print("Enter the Marks: ");
		int marks = myObj.nextInt();
		if (marks >=90)
		{
			System.out.println("A-Excellent");
		}
		else if (marks<90 && marks>=80)
		{
			System.out.println("B-Very Good");
		}
		else if (marks<80 && marks>=70)
		{
			System.out.println("C-Good");
		}
		else if (marks<70 && marks>=60)
		{
			System.out.println("D-Satisfactory");
		}
		else if (marks<60 && marks>=50)
		{
			System.out.println("E-Work Hard");
		}
		else if (marks<50 && marks>=40)
		{
			System.out.println("F-Just Pass");
		}
		else if (marks<40)
		{
			System.out.println("Failed");
		}
	}
}