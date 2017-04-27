import java.awt.*;
public class j0830_8 extends Frame{
	
	TextArea ta1;
	Button b1;
	Panel p;
	j0830_8(){
		p=new Panel();
		ta1=new TextArea(10,20);
		b1=new Button("submit");
		p.add(ta1);
		p.add(b1);
		this.add(p);
		
		this.setSize(1000, 1000);
		this.setVisible(true);
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		j0830_8 j=new j0830_8();
	}

}
