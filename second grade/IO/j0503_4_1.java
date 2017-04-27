import java.io.*;
public class j0503_4_1 {

	public static void main(String[] args) {
		//4.파일복사(바이트단위)
		int b;
		try{
			FileInputStream fis = new FileInputStream("test1.txt");
			FileOutputStream fos = new FileOutputStream("test1_1.txt");
			while((b=fis.read())!=-1){
				fos.write(b);
			}
			fis.close();
			fos.close();
			System.out.println("복사 완료");
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}