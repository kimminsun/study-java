import java.io.*;
public class j0503_1_1 {

	public static void main(String[] args) {
		//Ű����� �Է��� �����͸� ����ͷ� ���(����Ʈ����)
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