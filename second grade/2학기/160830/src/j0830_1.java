import java.awt.*;
public class j0830_1 extends Frame {
	Label l1;
	Panel p1;
	Checkbox c1,c2,c3,c4;
	Button b1;
	j0830_1(){
		CheckboxGroup cbg=new CheckboxGroup();
		l1=new Label("��̸� �����ϼ��� ");
		this.add(l1,BorderLayout.NORTH);
		p1=new Panel();
		c1=new Checkbox("��",false,cbg);
		c2=new Checkbox("��",false,cbg);
		c3=new Checkbox("����",true,cbg);
		c4=new Checkbox("��",false,cbg);
		p1.setBackground(Color.lightGray);
		p1.add(c1 );
		p1.add(c2 );
		p1.add(c3 );
		p1.add(c4 );
		this.add(p1,BorderLayout.CENTER);
		b1=new Button("�Է¿Ϸ�");
		this.add(b1,BorderLayout.SOUTH);
	
		
		
		this.setSize(400, 400);
		this.setVisible(true);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		j0830_1 j1=new j0830_1();

	}

}
