import java.io.*;
public class j0503_9 {

	public static void main(String[] args) {
		//9.FileReader스트림을 연결하여 c:\\windows\\system.ini 파일을 읽고 화면에 출력하는 프로그램을
		//버퍼스트림을 이용하여 작성하기(BufferedReader)
		int c;
		try{
			FileReader fr = new FileReader("c:\\windows\\system.ini");
			BufferedReader br = new BufferedReader(fr);
			OutputStreamWriter osw = new  OutputStreamWriter(System.out);
			while ((c=fr.read())!=-1){
				osw.write(c);
			}
			fr.close();
			osw.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}