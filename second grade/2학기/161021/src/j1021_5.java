import java.awt.*;
public class j1021_5 extends Frame {
	Button b1,b2;
	Label lb;
	Panel p;
	
	j1021_5(){
		GridLayout gl=new GridLayout(2,2);
		
		p=new Panel();
		p.add(b1);
		p.add(b2);
		
		p.add(lb);
		
		this.add(p);
		this.setSize(300, 300);
		this.setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new j1021_5();
	}

}
