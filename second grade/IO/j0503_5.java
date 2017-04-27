import java.io.*;
public class j0503_5 {

	public static void main(String[] args) {
		//5.키보드로부터 문자열을 입력받아 FileWriter를 사용하여 out.txt에 저장
		int c;
		try{
			InputStreamReader isr = new InputStreamReader(System.in);
			FileWriter fw = new FileWriter("out.txt");
			while((c=isr.read())!=-1){
				fw.write(c);
			}
			isr.close();
			fw.close();
			System.out.println("저장 완료");
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}