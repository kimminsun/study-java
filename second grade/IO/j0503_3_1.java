import java.io.*;
public class j0503_3_1 {

	public static void main(String[] args) {
		//3.test1.txt������ ����Ϳ� ���(����Ʈ����)
		int b;
		try{
			FileInputStream fis = new FileInputStream("test1.txt");
			while((b=fis.read())!=-1){
				System.out.print((char)b);
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}