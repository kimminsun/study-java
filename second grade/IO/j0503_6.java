import java.io.*;
public class j0503_6 {

	public static void main(String[] args) {
		//6.5번에서 저장된 파일out.txt에서 내용을 읽어 화면에 출력
		int c;
		try{
			FileReader fr = new FileReader("out.txt");
			OutputStreamWriter osw = new OutputStreamWriter(System.out);
			while((c=fr.read())!=-1){
				osw.write(c);
			}
			fr.close();
			osw.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}