import java.io.*;
public class j0503_13 {

	public static void main(String[] args) {
		//13.바이트 스트림을 이용하여 바이너리 파일을 복사하는 프로그램을 작성
		int b;
		try{
			FileInputStream fis = new FileInputStream("sb.JPG");
			FileOutputStream fos = new FileOutputStream("sb1.JPG");
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