import java.awt.*;
public class j0826_5 extends Frame {
	Checkbox c1,c2,c3,c4,c5;
	Label l1;
	Panel p;
	j0826_5(String str){
		super(str);
		p=new Panel();
		l1=new Label("������ �����Ͻÿ�.");
		c1=new Checkbox("��");
		c2=new Checkbox("��");
		c3=new Checkbox("����",true);
		c4=new Checkbox("��");
		c5=new Checkbox("��");
		
		p.add(l1);
		p.add(c1);
		p.add(c2);
		p.add(c3);
		p.add(c4);
		p.add(c5);
		
		this.add(p);
		
		this.setSize(400, 400);
		this.setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		j0826_5 j=new j0826_5("STR");

	}

}
