import java.io.*;
public class j0503_8 {

	public static void main(String[] args) {
		//8.out.txt파일의 내용을 대문자로 모두 바꿔 out2.txt에 저장
		int c;
		char ch;
		String s;
		try{
			FileReader fr = new FileReader("out.txt");
			FileWriter fw = new FileWriter("out2.txt");
			while((c=fr.read())!=-1){
				ch=(char)c;
				s = Character.toString(ch);
				fw.write(s.toUpperCase());
			}
			fr.close();
			fw.close();
			System.out.println("복사저장완료");
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}