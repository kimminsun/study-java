import java.io.*;
public class j0503_14 {

	public static void main(String[] args) {
		//14. 파일에서 한줄씩 읽어와서 화면에 출력
		String s;
		try{
			FileReader fr = new FileReader("test2.txt");
			BufferedReader br = new BufferedReader(fr);
			OutputStreamWriter osw = new OutputStreamWriter(System.out);
			while((s=br.readLine())!=null){
				//osw.write(s);
				System.out.println(s);
			}
			fr.close();
			br.close();
			osw.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}