import java.io.*;
public class j0503_15 {

	public static void main(String[] args) {
		//15. bufferedreader를 이용하여 정수 2개를 입력하여 두 수의 총점, 평균 구하여 출력
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
		System.out.println("합 : "+sum);
		System.out.println("평균 : "+average);
	}
}