import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	    Scanner sc = new Scanner(System.in);
	    int num = sc.nextInt();
	    int m = num;
	    int sum = 0;
	    while(num > 0){
	        int rem = num % 10;
	        int fact = 1;            
	        for(int count = 1; count <= rem; count++)
	        {
	            fact = fact * count;
	        }
	        sum = sum + fact;
	        num = num / 10;
	    }
	    if(m == sum)
	    {
	        System.out.println("Yes");
	    }
	    else{
	        System.out.println("No");
	    }
	}
}