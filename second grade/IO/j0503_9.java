import java.io.*;
public class j0503_9 {

	public static void main(String[] args) {
		//9.FileReader��Ʈ���� �����Ͽ� c:\\windows\\system.ini ������ �а� ȭ�鿡 ����ϴ� ���α׷���
		//���۽�Ʈ���� �̿��Ͽ� �ۼ��ϱ�(BufferedReader)
		int c;
		try{
			FileReader fr = new FileReader("c:\\windows\\system.ini");
			BufferedReader br = new BufferedReader(fr);
			OutputStreamWriter osw = new  OutputStreamWriter(System.out);
			while ((c=fr.read())!=-1){
				osw.write(c);
			}
			fr.close();
			osw.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}