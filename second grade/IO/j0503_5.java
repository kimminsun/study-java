import java.io.*;
public class j0503_5 {

	public static void main(String[] args) {
		//5.Ű����κ��� ���ڿ��� �Է¹޾� FileWriter�� ����Ͽ� out.txt�� ����
		int c;
		try{
			InputStreamReader isr = new InputStreamReader(System.in);
			FileWriter fw = new FileWriter("out.txt");
			while((c=isr.read())!=-1){
				fw.write(c);
			}
			isr.close();
			fw.close();
			System.out.println("���� �Ϸ�");
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}