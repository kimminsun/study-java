import java.awt.BorderLayout;
import java.awt.CheckboxGroup;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class j1104_3 extends JFrame implements ActionListener{
	JCheckBox jcb1,jcb2,jcb3;
	JLabel j1,j2;

	GridLayout gl;
	j1104_3(){
		gl=new GridLayout(3,1);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container cp1=getContentPane();
		Container cp2=getContentPane();
		Container cp3=getContentPane();
		
		j1=new JLabel("주문할 메뉴를 선택해 주세요");
		j1.setEnabled(false);
		cp1.add(j1);
		
		
		jcb1=new JCheckBox("짜장면");
		jcb2=new JCheckBox("탕수육");
		jcb3=new JCheckBox("짬뽕");
		
		jcb1.addActionListener(this);
		jcb2.addActionListener(this);
		jcb3.addActionListener(this);
		
		
		cp2.add(jcb1);
		cp2.add(jcb2);
		cp2.add(jcb3);
		
		j2=new JLabel(" ");
		cp3.add(j2);
		
		
		this.setLayout(gl);
		this.setSize(500, 200);
		this.setVisible(true);
		
		
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new j1104_3();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(jcb1.isSelected()==true){
			j2.setText("짜장면");
		}
		
	}

}
