import java.io.*;
public class j0503_2_1 {

	public static void main(String[] args) {
		//2.Ű����� �Է��� �����͸� test1.txt���Ϸ� ����(����Ʈ����)
		
		int b;
		try{
			FileOutputStream fos = new FileOutputStream("test1.txt");
			while((b=System.in.read())!=-1){
				fos.write(b);
			}
			fos.close();
			System.out.println("���� �Ϸ�");
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}