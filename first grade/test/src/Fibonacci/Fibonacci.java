package Fibonacci;

public class Fibonacci {
	
	private static int excuteFibo(int num)
	{
		if(num < 2)
			return num;
		else
			return excuteFibo(num-2) + excuteFibo(num-1);
	}
	
	public static void main(String args[])
	{
		int fibo_10=10, fibonacciSum=0;
		for(int i=1; i<fibo_10+1; i++)
		{
		System.out.print(excuteFibo(i)+" ");
		fibonacciSum = fibonacciSum + excuteFibo(i);
			if(i<fibo_10)
			{
				System.out.print("+ ");
			}
			else if(i == fibo_10)
			{
				System.out.print("= ");
				System.out.print(fibonacciSum);
			}
		}
		
	}
}
