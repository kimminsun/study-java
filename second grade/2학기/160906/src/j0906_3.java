import java.awt.*;
public class j0906_3 extends Frame{
	Choice c;
	Panel p;
	j0906_3(){
		c=new Choice();
		c.add("��");
		c.add("��");
		c.add("����");
		c.add("��");
		p=new Panel();
		p.add(c);
		this.add(p);
		
		this.setSize(500, 400);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		j0906_3 j=new j0906_3();
	}

}
