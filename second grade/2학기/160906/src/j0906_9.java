import java.awt.*;
public class j0906_9 extends Frame {
	Panel p;
	TextField tf1,tf2;
	Label l1,l2;
	j0906_9(){
		p=new Panel();
		l1=new Label("아이디");
		l2=new Label("비밀번호");
		tf1=new TextField(20);
		tf2=new TextField(20);
		tf2.setEchoChar('*');	
		p.add(l1);
		p.add(tf1);
		p.add(l2);
		p.add(tf2);
		
		this.add(p);
		
		this.setSize(400, 500);
		this.setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new j0906_9();
	}

}
