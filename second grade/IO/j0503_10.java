import java.io.*;
public class j0503_10 {

	public static void main(String[] args) {
		//10.FileInputStream�� �����Ͽ� c:\\windows\\system.ini ������ �а� ȭ�鿡 ����ϴ� ���α׷���
		//���۽�Ʈ���� �̿��Ͽ� �ۼ��ϱ�(BufferedReader)
		int b;
		try{
			FileInputStream fis = new FileInputStream("c:\\windows\\system.ini");
			while((b=fis.read())!=-1){
				System.out.print((char)b);
			}
			fis.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}