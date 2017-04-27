import java.io.*;
public class j0503_2_1 {

	public static void main(String[] args) {
		//2.키보드로 입력한 데이터를 test1.txt파일로 저장(바이트단위)
		
		int b;
		try{
			FileOutputStream fos = new FileOutputStream("test1.txt");
			while((b=System.in.read())!=-1){
				fos.write(b);
			}
			fos.close();
			System.out.println("저장 완료");
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}