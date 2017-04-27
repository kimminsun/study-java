import java.awt.*;
import java.awt.event.*;
public class Eunbee extends Frame implements ActionListener, MouseListener{
	Panel p, p1,p2,p3,p4,p5;
	Label num1,num2,result;
	TextField t1,t2;
	Checkbox plus,minus,multiple,division;
	CheckboxGroup calculation;
	Button ok,clear,exit;
	GridLayout g;
	Eunbee(){
		g = new GridLayout(5,1);
		p = new Panel();
		p1 = new Panel();
		p2= new Panel();
		p3 = new Panel();
		p4 = new Panel();
		p5 = new Panel();
		num1 = new Label("num1 : ");
		num2 = new Label("num2 : ");
		result = new Label("result : ");
		t1 = new TextField(20);
		t2 = new TextField(20);
		calculation = new CheckboxGroup();
		plus = new Checkbox("+",calculation,true);
		minus = new Checkbox("-",calculation,false);
		multiple = new Checkbox("*",calculation,false);
		division = new Checkbox("/",calculation,false);
		ok = new Button("ok");
		clear = new Button("clear");
		exit = new Button("exit");
		
		
		p1.add(num1);
		p1.add(t1);
		p2.add(num2);
		p2.add(t2);
		p3.add(plus);
		p3.add(minus);
		p3.add(multiple);
		p3.add(division);
		p4.add(ok);
		p4.add(clear);
		p4.add(exit);
		p5.add(result);
		p.setLayout(g);
		p.add(p1);
		p.add(p2);
		p.add(p3);
		p.add(p4);
		p.add(p5);
		
		this.add(p);
		this.setSize(300,200);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Eunbee();
	}
	public void actionPerformed(ActionEvent e){
		if(e.getActionCommand().equals("ok")){
			if(plus.getState()){
				Integer.parseInt(t1.getText());
			}
		}
	}

}
