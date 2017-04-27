import java.awt.Color;
import java.awt.Container;

import javax.swing.*;
public class j1115_5 extends JFrame{
	JPanel jp1,jp2,jp3;
	JTabbedPane jtp;
	Container cp;
	j1115_5(){
		jp1=new JPanel();
		jp2=new JPanel();
		jp3=new JPanel();
		
		jtp=new JTabbedPane();
		
		jtp.addTab("First",jp1);
		jtp.addTab("Second",jp2);
		jtp.addTab("Third",jp3);
		jp1.setBackground(Color.GREEN);
		jp2.setBackground(Color.RED);
		jp3.setBackground(Color.blue);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cp=getContentPane();
		
		cp.add(jtp);
		
		this.setSize(400,500);
		this.setVisible(true);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new j1115_5();
	}

}
