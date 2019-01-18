import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	    Scanner sc = new Scanner(System.in);
	    int num = sc.nextInt();
	    int number = num;
	    int digit_count = 0;
	    if(num == 0){
	        System.out.print(num);
	    }
	    else
        {
	        while(num > 0)
            {
	            digit_count++;
	            num = num / 10;
	        }
	    }
	    num = number;
	    int sum = 0;
	    int pow = 1;
	    while(num > 0)
	    {
	        int rem = num % 10;
	        for(int count = 1; count <= digit_count; count++){
	            pow = pow * rem;
	        }
	        sum = sum  + pow;
	        pow = 1;
	        num = num / 10;
	    }
	    if(sum == number){
	        System.out.print("Armstrong Number");
	    }
	    else{
	        System.out.print("Not a Armstrong Number");
	    }
	}
}