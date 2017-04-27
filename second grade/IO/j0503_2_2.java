import java.io.*;
public class j0503_2_2 {

	public static void main(String[] args) {
		//2.키보드단위로 입력한 데이터를 test2.txt파일로 저장(문자단위)
		int c;
		try{
			InputStreamReader isr = new InputStreamReader(System.in);
			FileWriter fr = new FileWriter("test2.txt");
			while((c=isr.read())!=-1)
				fr.write(c);
			fr.close();
			System.out.println("저장 완료");
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}