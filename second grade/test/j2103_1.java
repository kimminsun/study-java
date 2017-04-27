import java.io.*;
public class j2103_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			String str=" ";
			while ((str=br.readLine())!="eof")
			{
			FileWriter fw=new FileWriter("a.txt");
			fw.write(str);	
			fw.close();
			}
		
		}catch(Exception e){};

	}

}
