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
	       System.out.println("�Ҽ� �Դϴ�");

	       else
	       System.out.println("�Ҽ��� �ƴմϴ�");
	}
	
    public static void main(String[] args) 
    {
    int a=0;
    Scanner scan = new Scanner(System.in);
    System.out.print("���� �Է� : ");
    a = scan.nextInt();
    scan.close(); //memory leak check!! Important
    checkPrime(a);
    
    }
}

