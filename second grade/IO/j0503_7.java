import java.io.*;
public class j0503_7 {

	public static void main(String[] args) {
		//out.txt������ in.txt���Ͽ� ���
		int c;
		try{
			FileReader fr = new  FileReader("out.txt");
			FileWriter fw = new FileWriter("in.txt");
			while((c=fr.read())!=-1){
				fw.write(c);
			}
			fr.close();
			fw.close();
			System.out.println("���� �Ϸ�");
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}