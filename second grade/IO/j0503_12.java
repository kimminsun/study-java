import java.io.*;
public class j0503_12 {

	public static void main(String[] args) {
		//12. FileReader 스트림을 연결하여 c:\\windows\\system.ini 파일을 읽고 
		//file(system2.ini)에 출력하는 프로그램을 버퍼스트림을 이용하여 작성하기.(BufferdReader)
		int c;
		try{
			FileReader fr = new FileReader("c:\\windows\\system.ini");
			BufferedReader br = new BufferedReader(fr);
			FileWriter fw = new FileWriter("system2.ini");
			while((c=fr.read())!=-1){
				fw.write(c);
			}
			fr.close();
			fw.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}