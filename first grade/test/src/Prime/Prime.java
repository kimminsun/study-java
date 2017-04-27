package Prime;
import java.util.Scanner;

public class Prime
{
	public static void checkPrime(int a)
	{ 
	    int count=0;
	    for (int i=2;i<a;i++ )
	    {
	       if (a%i==0)
	          count++;
	         }
	    if(count==0)
	       System.out.println("소수 입니다");

	       else
	       System.out.println("소수가 아닙니다");
	}
	
    public static void main(String[] args) 
    {
    int a=0;
    Scanner scan = new Scanner(System.in);
    System.out.print("숫자 입력 : ");
    a = scan.nextInt();
    scan.close(); //memory leak check!! Important
    checkPrime(a);
    
    }
}

