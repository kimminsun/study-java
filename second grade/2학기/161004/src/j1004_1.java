import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
public class j1004_1 extends Frame implements ActionListener,MouseListener{
	Panel p1,p2,p3,p4,p5;
	Button b1,b2,b3;
	CheckboxGroup cbg1;
	Checkbox ch1,ch2,ch3,ch4;
	Label lb1,lb2,lb3,lb4;
	TextField tf1,tf2;
	
	j1004_1(){
		setLayout(new GridLayout(5,1));
		p1=new Panel();
		p2=new Panel();
		p3=new Panel();
		p4=new Panel();
		p5=new Panel();
		
		cbg1=new CheckboxGroup();
		
		tf1=new TextField(10);
		tf2=new TextField(10);
		
		ch1=new Checkbox("+",cbg1,true);
		ch2=new Checkbox("-",cbg1,false);
		ch3=new Checkbox("*",cbg1,false);
		ch4=new Checkbox("/",cbg1,false);
		
		b1=new Button("OK");
		b2=new Button("Clear");
		b3=new Button("Exit");
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addMouseListener(this);
		
		lb1=new Label("Num1: ");
		lb2=new Label("Num2: ");
		
		lb3=new Label("Result ");
		lb4=new Label();
		
		p1.add(lb1);
		p1.add(tf1);
		
		p2.add(lb2);
		p2.add(tf2);
		
		p3.add(ch1);
		p3.add(ch2);
		p3.add(ch3);
		p3.add(ch4);
		
		p4.add(b1);
		p4.add(b2);
		p4.add(b3);
		
		p5.add(lb3);
		p5.add(lb4);
		
		this.add(p1);
		this.add(p2);
		this.add(p3);
		this.add(p4);
		this.add(p5);
		
		this.setSize(400, 600);
		this.setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new j1004_1();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1){
			int n1=Integer.parseInt(tf1.getText());
			int n2=Integer.parseInt(tf2.getText());
			if(ch1.getState()==true){
				int result=n1+n2;
				lb4.setText(String.valueOf(result));
			}
			else if(ch2.getState()==true){
				int result=n1-n2;
				lb4.setText(String.valueOf(result));
				
			}
			else if(ch3.getState()==true){
				int result=n1*n2;
				lb4.setText(String.valueOf(result));
			}
			else if(ch4.getState()==true){
			
				int result=n1/n2;
				lb4.setText(String.valueOf(result));
			}
		}
		
		if (e.getSource()==b2) {
			tf1.setText("  ");
			tf2.setText("  ");
		}
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
