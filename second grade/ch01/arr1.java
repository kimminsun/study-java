import java.util.Scanner;
class arr1 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int arr[];
		arr=new int[5];
		System.out.print("��� 5���� �Է��ϼ��� : ");
		for (int i=0;i<arr.length ;i++)
		{
			arr[i]=scan.nextInt();
			if(arr[i]<0)
				System.out.println("����� �Է��ϼ���!");
		
		}
		for(int j=0;j<arr.length; j++)
			System.out.print(arr[j]+"\t");
			
	}
}