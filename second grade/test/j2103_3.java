import java.io.*;
class j2103_3
{
	public static void main(String[] args) 
	{
		try
		{
			byte[]b=new byte[10000];
			BufferedInputStream bis=new BufferedInputStream(System.in);
			FileInputStream fis=new FileInputStream("a.jpg");
			BufferedOutputStream bos=new BufferedOutputStream(System.out);
			FileOutputStream fos=new FileOutputStream("b.jpg");
			
			fis.read(b);
			fos.write(b);
			fis.close();
			fos.close();
		
		}
		catch (IOException e)
		{};
	}
}
