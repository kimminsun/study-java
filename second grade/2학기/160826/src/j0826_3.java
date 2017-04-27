import java.awt.*;
public class j0826_3 extends Frame {
	Button b1,b2;
	Label l1,l2;
	Panel p;
	GridLayout gl;
	j0826_3(String str){
		super(str);
		b1=new Button("a");
		b2=new Button("b");
		l1=new Label("ab");
		l2=new Label("cd");
		
		
		p=new Panel();
		gl=new GridLayout(2,2,10,10);
		p.setLayout(gl);
		p.add(b1);
		p.add(b2);
		p.add(l1);
		p.add(l2);
		
		this.add(p);
		this.setSize(500,500);
		this.setVisible(true);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		j0826_3 j=new j0826_3("str");

	}

}
