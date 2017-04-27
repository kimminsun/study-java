import java.io.*;
public class j0503_1_1 {

	public static void main(String[] args) {
		//키보드로 입력한 데이터를 모니터로 출력(바이트단위)
		int b;
		try{
			while((b=System.in.read())!=-1){
				System.out.print((char)b);
			}
		}catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}