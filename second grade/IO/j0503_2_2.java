import java.io.*;
public class j0503_2_2 {

	public static void main(String[] args) {
		//2.Ű��������� �Է��� �����͸� test2.txt���Ϸ� ����(���ڴ���)
		int c;
		try{
			InputStreamReader isr = new InputStreamReader(System.in);
			FileWriter fr = new FileWriter("test2.txt");
			while((c=isr.read())!=-1)
				fr.write(c);
			fr.close();
			System.out.println("���� �Ϸ�");
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}