import java.awt.*;
public class j0830_2 extends Frame {
	Panel p;
	TextField tf1,tf2,tf3,tf4;
	j0830_2(){
		GridLayout gl=new GridLayout(4,1);
		tf1 =new TextField();
		tf2=new TextField(30);
		tf3=new TextField("입력");
		tf4=new TextField("입력2",30);
		
		p=new Panel();
		p.add(tf1);	p.add(tf2);	p.add(tf3);	p.add(tf4);
		this.add(p);
		
		p.setLayout(gl);
		this.setSize(400, 400);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		j0830_2 j2=new j0830_2();
	}

}
