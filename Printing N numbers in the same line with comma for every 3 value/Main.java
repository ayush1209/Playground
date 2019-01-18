import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   //Type your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int count;
    int coma = 0;
    for(count = 1; count <= n; count++)
    {
      System.out.print(count);
   coma= coma + 1;
      if(coma % 3 == 0)
        System.out.print(",");
    }
  }
}