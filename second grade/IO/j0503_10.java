import java.io.*;
public class j0503_10 {

	public static void main(String[] args) {
		//10.FileInputStream을 연결하여 c:\\windows\\system.ini 파일을 읽고 화면에 출력하는 프로그램을
		//버퍼스트림을 이용하여 작성하기(BufferedReader)
		int b;
		try{
			FileInputStream fis = new FileInputStream("c:\\windows\\system.ini");
			while((b=fis.read())!=-1){
				System.out.print((char)b);
			}
			fis.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}