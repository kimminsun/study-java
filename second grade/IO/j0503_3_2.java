import java.io.*;
public class j0503_3_2 {

	public static void main(String[] args) {
		//3.test2.txt������ ����Ϳ� ���(���ڴ���)
		int c;
		try{
			FileReader fr = new FileReader("test2.txt");
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