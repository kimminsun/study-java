import java.awt.*;
import java.awt.FileDialog;
import java.io.*;
public class j1004_2 extends Frame {
	TextArea ta1;
	FileDialog fd;
	Panel p;
	j1004_2(){
		p=new Panel();
		ta1=new TextArea();
		fd=new FileDialog(this,"¿­±â",FileDialog.LOAD);
	
		
		try{	
		String fname=fd.getDirectory()+fd.getFile();
		FileReader fr=new FileReader("fname");
		BufferedReader bfr=new BufferedReader(fr);
		String s=bfr.readLine();
		ta1.append(s+"\n");
	
		}catch(IOException e){
			e.printStackTrace();
		}	
		fd.setSize(300,400);
		fd.setVisible(true);
		p.add(ta1);
		this.add(p);
		this.setSize(500, 500);
		this.setVisible(true);
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new j1004_2();
	}

}
