import java.awt.*;
public class j0826_4 extends Frame {
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;
	Panel p;
	GridLayout gl=new GridLayout(4,3);
	j0826_4(String str){
		b1=new Button("1");
		b2=new Button("2");
		b3=new Button("3");
		b4=new Button("4");
		b5=new Button("5");
		b6=new Button("6");
		b7=new Button("7");
		b8=new Button("8");
		b9=new Button("9");
		b10=new Button("*");
		b11=new Button("0");
		b12=new Button("#");
		
		p=new Panel();
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5);
		p.add(b6);
		p.add(b7);
		p.add(b8);
		p.add(b9);
		p.add(b10);
		p.add(b11);
		p.add(b12);
		p.setLayout(gl);
		this.add(p);
		this.setSize(250,400);
		this.setVisible(true);
		
		
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		j0826_4 j=new j0826_4("str");
	}

}
