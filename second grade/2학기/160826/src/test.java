
import java.awt.*;

public class test extends Frame{
	TextField tf1, tf2, tf3, tf4;
	Panel p,p2;
	GridLayout gl;
	FlowLayout fl;
	
	test(){
		tf1=new TextField();
		tf2=new TextField(30);
		tf3=new TextField("입력1");
		tf4=new TextField("입력2", 20);
		p=new Panel();
		p2=new Panel();
		fl=new FlowLayout();
	    gl=new GridLayout(4, 1);
		
		p.setLayout(gl);
		p.add(tf1);
		p.add(tf2);
		p.add(tf3);
		p.add(tf4);
		p2.setLayout(fl);
		p2.add(p);
		
		this.add(p2);
		this.setSize(400, 200);
		this.setVisible(true);
	}
	public static void main(String [] args){
		test e=new test();
	}
}
