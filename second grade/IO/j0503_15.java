import java.io.*;
public class j0503_15 {

	public static void main(String[] args) {
		//15. bufferedreader�� �̿��Ͽ� ���� 2���� �Է��Ͽ� �� ���� ����, ��� ���Ͽ� ���
		String a="",b="";
		int sum=0;
		double average=0;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try{
			System.out.print("a : ");
			a=br.readLine();
			System.out.print("b : ");
			b=br.readLine();
		}catch(IOException e){
			e.printStackTrace();
		}
		int c=Integer.parseInt(a);
		int d=Integer.parseInt(b);
		sum=c+d;
		average=sum/2.0;
		System.out.println("�� : "+sum);
		System.out.println("��� : "+average);
	}
}