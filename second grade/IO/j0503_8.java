import java.io.*;
public class j0503_8 {

	public static void main(String[] args) {
		//8.out.txt������ ������ �빮�ڷ� ��� �ٲ� out2.txt�� ����
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
			System.out.println("��������Ϸ�");
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}