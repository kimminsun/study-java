import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.util.Random;

import javax.swing.*;
public class j1101_6 extends JFrame {
	JButton [] jbt;
	Color c;
	GridLayout gl;
	Container cp;
	
	j1101_6()
	{
		cp=getContentPane();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gl=new GridLayout(1, 10);
		jbt=new JButton[10];
		for(int i=0;i<jbt.length;i++){
			
			int r=(int) (Math.random()*256);
			int g=(int) (Math.random()*256);
			int b=(int) (Math.random()*256);
			
			c=new Color(r,g,b);
			
			jbt[i].setBackground(c);
			
			
		}
		
		this.setLayout(gl);
		this.setSize(500,100);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new j1101_6();
	}

}
