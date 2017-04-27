import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.*;
public class j1104_1 extends JFrame{
	ImageIcon img1,img2,img3,img4;
	JLabel jlb1,jlb2;
	JButton jb1,jb2;
	FlowLayout fl;
	j1104_1(){
		fl=new FlowLayout();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container cp=getContentPane();
		
		
		img1=new ImageIcon("D:/2학기/161104/src/img/img1.jpg");
		img2=new ImageIcon("D:/2학기/161104/src/img/ka_1.jpg");
		img3=new ImageIcon("D:/2학기/161104/src/img/img3.jpg");
		img4=new ImageIcon("D:/2학기/161104/src/img/ka_2.jpg");
		
		
		
		jb1=new JButton("카톡버튼주세요",img1);
		jb2=new JButton("라이언버튼주세요",img2);
		
		jb1.setRolloverIcon(img3);
		jb2.setPressedIcon(img4);
		
	
		
		
		cp.add(jb1);
		cp.add(jb2);
		
		this.setLayout(fl);
		
		
		
		
		this.setSize(600,250);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new j1104_1();

	}

}
