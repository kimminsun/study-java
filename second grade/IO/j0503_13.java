import java.io.*;
public class j0503_13 {

	public static void main(String[] args) {
		//13.����Ʈ ��Ʈ���� �̿��Ͽ� ���̳ʸ� ������ �����ϴ� ���α׷��� �ۼ�
		int b;
		try{
			FileInputStream fis = new FileInputStream("sb.JPG");
			FileOutputStream fos = new FileOutputStream("sb1.JPG");
			while((b=fis.read())!=-1){
				fos.write(b);
			}
			fis.close();
			fos.close();
			System.out.println("���� �Ϸ�");
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}