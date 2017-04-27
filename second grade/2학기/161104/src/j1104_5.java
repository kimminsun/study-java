import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class j1104_5 extends JFrame implements ActionListener{
	JButton j1;
	Container cp;
	j1104_5(){
		cp=getContentPane();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j1=new JButton("색상바꾸기");
		j1.addActionListener(this);
		
		cp.add(j1,BorderLayout.NORTH);
		this.setSize(400,500);
		this.setVisible(true);
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new j1104_5();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Color c=JColorChooser.showDialog(this, "색상변경", Color.MAGENTA);
		cp.setBackground(c);
	}

}
