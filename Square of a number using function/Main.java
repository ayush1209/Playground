import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    System.out.print(square_of_a_number(n));
	}
	public static int square_of_a_number(int a)
	{
	    int result = a * a;
	    return result;
	} 
} 
