import java.io.*;
public class j0503_14 {

	public static void main(String[] args) {
		//14. ���Ͽ��� ���پ� �о�ͼ� ȭ�鿡 ���
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