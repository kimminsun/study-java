import java.io.*;
public class j0503_12 {

	public static void main(String[] args) {
		//12. FileReader ��Ʈ���� �����Ͽ� c:\\windows\\system.ini ������ �а� 
		//file(system2.ini)�� ����ϴ� ���α׷��� ���۽�Ʈ���� �̿��Ͽ� �ۼ��ϱ�.(BufferdReader)
		int c;
		try{
			FileReader fr = new FileReader("c:\\windows\\system.ini");
			BufferedReader br = new BufferedReader(fr);
			FileWriter fw = new FileWriter("system2.ini");
			while((c=fr.read())!=-1){
				fw.write(c);
			}
			fr.close();
			fw.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}