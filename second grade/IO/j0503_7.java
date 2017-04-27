import java.io.*;
public class j0503_7 {

	public static void main(String[] args) {
		//out.txt파일을 in.txt파일에 출력
		int c;
		try{
			FileReader fr = new  FileReader("out.txt");
			FileWriter fw = new FileWriter("in.txt");
			while((c=fr.read())!=-1){
				fw.write(c);
			}
			fr.close();
			fw.close();
			System.out.println("복사 완료");
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}