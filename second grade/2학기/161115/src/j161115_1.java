import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.activation.ActivationInstantiator;

import javax.swing.*;
public class j161115_1 extends JFrame implements ActionListener{
	String s[]={"kiwi","melon","mango","apple"};
	ImageIcon img[]={new ImageIcon("img/img_5.jpg"),new ImageIcon("img/img_2.jpg"),
			new ImageIcon("img/img_3.jpg"),new ImageIcon("img/img_4.jpg")};
	JComboBox j1;
	JLabel jlb;
	FlowLayout fl;
	j161115_1(){
		fl=new FlowLayout();
		j1=new JComboBox(s);
		jlb=new JLabel();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container cp=getContentPane();
		cp.add(j1);
		cp.add(jlb);
		j1.addActionListener(this);
		this.setLayout(fl);
		this.setSize(400,500);
		this.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new j161115_1();
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		for(int i=0;i<=s.length-1;i++){
			if(j1.getSelectedIndex()==i){
				jlb.setIcon(img[i]);
			}
		}
		
	}

}
