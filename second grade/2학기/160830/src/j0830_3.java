import java.awt.*;
public class j0830_3 extends Frame {
	TextField tf1,tf2,tf3;
	Button b1;
	Label l1,l2;
	Panel p;
	GridLayout gl=new GridLayout(3,2);
	j0830_3(String str){
		l1=new Label("Enter first number");
		l2=new Label("Enter Second Number");
		tf1=new TextField("12");
		tf2=new TextField("13");
		tf3=new TextField("25");
		b1=new Button("Add");
		p=new Panel();
		p.add(l1);
		p.add(tf1);
		p.add(l2);
		p.add(tf2);
		p.add(b1);
		p.add(tf3);
		
		this.add(p);
		
		
		p.setLayout(gl);
		this.setSize(400, 400);
		this.setVisible(true);
		
		
		
		
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		j0830_3 j1=new j0830_3("str");

	}

}
