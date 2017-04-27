import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.*;
public class j1104_2 extends JFrame{
	JCheckBox jcb1,jcb2,jcb3;
	ImageIcon img1,img2,img3;
	FlowLayout fl;
	j1104_2(){
		fl=new FlowLayout();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container cp=getContentPane();
		
		img1=new ImageIcon("D:/2학기/161104/src/img/img1.jpg");
		img2=new ImageIcon("D:/2학기/161104/src/img/img2.jpg");
		img3=new ImageIcon("D:/2학기/161104/src/img/img3.jpg");
		
		
		jcb1=new JCheckBox("apple",img1);
		jcb2=new JCheckBox("pine",img2);
		jcb3=new JCheckBox("cherry",img3);
		
		
		jcb3.setSelectedIcon(img2);
		jcb3.setBorderPainted(true);
		
		cp.add(jcb1);
		cp.add(jcb2);
		cp.add(jcb3);
		
		this.setLayout(fl);
		this.setSize(500, 200);
		this.setVisible(true);
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new j1104_2();
	}

}
