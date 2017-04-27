import java.io.*;
public class j0503_4_2 {

	public static void main(String[] args) {
		int c;
		try{
			FileReader fr = new FileReader("test2.txt");
			FileWriter fw = new FileWriter("test2_1.txt");
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