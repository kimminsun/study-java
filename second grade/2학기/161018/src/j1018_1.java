import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.*;
public class j1018_1 extends Frame implements ActionListener,WindowListener {
	TextArea ta;
	Button b;
	Panel p;
	FileDialog fd;
	j1018_1(){
		GridLayout gl=new GridLayout(2,1);
		p=new Panel();
		ta=new TextArea();
		b=new Button("저장");
		b.addActionListener(this);
		addWindowListener(this);
		p.add(ta);
		p.add(b);
		
		this.add(p);
		this.setSize(500, 400);
		
		this.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new j1018_1();

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		fd=new FileDialog(this,"저장",FileDialog.SAVE);
		fd.setSize(300,200);
		fd.setVisible(true);
		String text=ta.getText();
		String fname=fd.getDirectory()+fd.getFile();
		this.setTitle(fd.getFile()+"메모장");
		if(fd.getFile()==null)
			return;
		try{
		FileWriter fw=new FileWriter(fname);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write(text);
		bw.close();
		}catch(IOException e1){
			e1.printStackTrace();
		}
		
	}
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
	}
	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}
