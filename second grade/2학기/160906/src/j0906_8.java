import java.awt.*;
public class j0906_8 extends Frame{
	Choice c1;
	Panel p;
	j0906_8(){
		p=new Panel();
		c1=new Choice();
		
		c1.addItem("��");
		c1.addItem("����");
		c1.addItem("����");
		c1.addItem("�ܿ�");
		
		p.add(c1);
		this.add(p);
		
		this.setSize(400, 500);
		this.setVisible(true);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new j0906_8();
	}

}
