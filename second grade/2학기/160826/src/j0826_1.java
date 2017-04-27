import java.awt.*;
public class j0826_1 extends Frame {
	Button b1,b2,b3,b4;
	Panel p;
	FlowLayout fl,f2,f3;
	j0826_1(String str){
		super(str);
		fl=new FlowLayout();
		f2=new FlowLayout(FlowLayout.RIGHT);
		f3=new FlowLayout(FlowLayout.RIGHT,20,20);
		
		b1=new Button("Add");
		b2=new Button("sub");
		b3=new Button("Mul");
		b4=new Button("cal");
		
		p=new Panel();
		
		p.setLayout(f3);
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		
		this.add(p);
		
		this.setSize(500,500);
		this.setVisible(true);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		j0826_1 j=new j0826_1("str");

	}

}
