import java.awt.*;


public class j0826_2 extends Frame {
	Button b1,b2,b3,b4,b5;
	Panel p;
	BorderLayout bl;
	j0826_2(String str){
		super(str);

		bl=new BorderLayout();
		b1=new Button("North");
		b2=new Button("West");
		b3=new Button("Center");
		b4=new Button("East");
		b5=new Button("South");
		
		p=new Panel();
		p.setLayout(bl);
		
		
		p.add(b1,BorderLayout.NORTH);
		p.add(b2,BorderLayout.WEST);
		p.add(b3,BorderLayout.CENTER);
		p.add(b4,BorderLayout.EAST);
		p.add(b5,BorderLayout.SOUTH);
		
		b1.setBackground(Color.black);
		b2.setBackground(Color.blue);
		b3.setBackground(Color.darkGray);
		b4.setBackground(Color.gray);
		b5.setBackground(Color.yellow);
		
		this.add(p);
		
		this.setSize(500,500);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		j0826_2 j=new j0826_2("str");

	}

}
