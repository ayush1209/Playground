import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     // Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
     
      int sum=0;
      for(int temp = 1; temp <= n; temp = temp + 1)
      {
         sum = sum + temp;
         
      }
      System.out.println(sum);
     
	}
}