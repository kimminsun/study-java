import java.io.*;
public class j0503_6 {

	public static void main(String[] args) {
		//6.5������ ����� ����out.txt���� ������ �о� ȭ�鿡 ���
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