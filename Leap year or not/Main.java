import java.util.Scanner;
class Main 
{
	public static void main (String[] args)
    {
		Scanner sc = new Scanner(System.in);
		// Get the year from the user
		int year = sc.nextInt();
		if(((year % 4 == 0) && (year % 100 != 0)) || 
		   ((year % 100 == 0) && (year % 400 == 0)))
		{
		    System.out.print("Leap year");
		}
		else
		{
		    System.out.print("Non Leap year"); 
		}
    }
}