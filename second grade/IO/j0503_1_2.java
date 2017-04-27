import java.io.*;
public class j0503_1_2 {

	public static void main(String[] args) {
		//키보드로 입력한 데이터를 모니터로 출력(문자단위)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		OutputStreamWriter osw= new OutputStreamWriter(System.out);
		int c;
		try{
			while((c=br.read())!=-1)
				osw.write(c);
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}