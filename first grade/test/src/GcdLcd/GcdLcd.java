package GcdLcd;

import java.util.Scanner;

public class GcdLcd {
	
	private static int checkGcd(int num1, int num2)
	{
		if(num2 ==0) return num1;
		return checkGcd(num2, num1%num2);
	}
	
	 public static void main(String args[])
	 {
		 int num1=0, num2=0;
		 Scanner scan = new Scanner(System.in);
		 System.out.print("첫번째 숫자를 입력하세요 : ");
		 num1 = scan.nextInt();
		 System.out.print("두번째 숫자를 입력하세요 : ");
		 num2 = scan.nextInt();   
		 scan.close();
		 
		 System.out.println(num1+"과 "+num2+"의 최대공약수: "+ checkGcd(num1,num2));
		 System.out.println(num1+"과 "+num2+"의 최소공배수: "+ num1*num2/checkGcd(num1,num2));
	 }
}