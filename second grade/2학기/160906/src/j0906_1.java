import java.awt.*;
public class j0906_1 extends Frame {
	TextArea ta1;
	Panel p;
	Button b;
	Label l;
	j0906_1(){
		ta1=new TextArea(10,20);
		b=new Button("Submit");
		l=new Label("Hi : a b c d e");
		
		p=new Panel();
		p.add(ta1);
		p.add(b);
		p.add(l);
		
		this.add(p);
		
		this.setSize(500, 400);
		this.setVisible(true);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		j0906_1 j=new j0906_1();

	}

}
