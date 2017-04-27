import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.*;
public class j1115_4 extends JFrame{
	ImageIcon icon1,icon2,icon3,icon4;
	JToggleButton jtb1,jtb2,jtb3,jtb4;
	Container cp;
	
	j1115_4(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cp=getContentPane();
		
		icon1=new ImageIcon("img/img1.jpg");
		icon2=new ImageIcon("img/img2.jpg");
		icon3=new ImageIcon("img/img3.jpg");
		icon4=new ImageIcon("img/img4.jpg");
		
		jtb1=new JToggleButton(icon1);
		jtb2=new JToggleButton("2",icon2);
		jtb3=new JToggleButton("3");
		jtb4=new JToggleButton(icon4);
		
		jtb1.setMnemonic(1);
		jtb2.setRolloverIcon(icon1);
		jtb3.setPressedIcon(icon3);
		
		ButtonGroup bg=new ButtonGroup();
		GridLayout gl=new GridLayout(1,4,5,5);
		
		bg.add(jtb1);cp.add(jtb1);
		bg.add(jtb2);cp.add(jtb2);
		bg.add(jtb3);cp.add(jtb3);
		bg.add(jtb4);cp.add(jtb4);
		
		cp.setLayout(gl);
		this.setSize(400,500);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new j1115_4();
	}

}
