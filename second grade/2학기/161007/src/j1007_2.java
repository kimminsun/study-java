import java.awt.*;
public class j1007_2 extends Frame {
	Label l1,l2,l3,l4,l5,l6;
	TextField tf1,tf2;
	Button b1,b2,b3,b4;
	Choice ch1,ch2;
	Checkbox cb1,cb2;
	Checkbox cb3,cb4,cb5,cb6;
	CheckboxGroup cbg1;
	Panel p1,p2,p3;
	BorderLayout bl;

	j1007_2(){
		setLayout(new GridLayout(3,1));
		
		bl=new BorderLayout();
		p1=new Panel();
		p2=new Panel();
		p3=new Panel();
		
		l1=new Label("�� ��");
		l2=new Label("�� �� :");
		l3=new Label("��");
		l4=new Label("��");
		l5=new Label("��ȭ��ȣ:");
		l6=new Label("�� �� : ");
		
		b1=new Button("�˻�");
		b2=new Button("����");
		b3=new Button("����");
		b4=new Button("����");
		
		ch1=new Choice();
		for(int i=1;i<=12;i++){
			ch1.addItem(Integer.toString(i)+"��");
		}
		ch2=new Choice();
		for(int i=1;i<=31;i++){
			ch2.addItem(Integer.toString(i)+"��");
		}
		
		cbg1=new CheckboxGroup();
		cb1=new Checkbox("���",cbg1,true);
		cb2=new Checkbox("����",cbg1,false);
		
		cb3=new Checkbox("�� ��");
		cb4=new Checkbox("�� ��");
		cb5=new Checkbox("�� ��");
		cb6=new Checkbox("�� Ÿ");
		
		tf1=new TextField(10);
		tf2=new TextField(20);
		
		
		
		
		p1.add(l1);
		p1.add(tf1);
		p1.add(b1);
		
		p2.add(l2,BorderLayout.NORTH);
		p2.add(ch1,BorderLayout.NORTH);
		p2.add(l3,BorderLayout.NORTH);
		p2.add(ch2,BorderLayout.NORTH);
		
		p2.add(l4,BorderLayout.CENTER);
		p2.add(cb1,BorderLayout.CENTER);
		p2.add(cb2,BorderLayout.CENTER);
		
		p2.add(l5,BorderLayout.SOUTH);
		p2.add(tf2,BorderLayout.SOUTH);
		p2.add(l6,BorderLayout.SOUTH);
		p2.add(cb3,BorderLayout.SOUTH);
		p2.add(cb4,BorderLayout.SOUTH);
		p2.add(cb5,BorderLayout.SOUTH);
		p2.add(cb6,BorderLayout.SOUTH);

		
		p3.add(b2);
		p3.add(b3);
		p3.add(b4);
		
		
		this.add(p1);
		this.add(p2);
		this.add(p3);
		
		this.setSize(500, 300);
		this.setVisible(true);
		
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new j1007_2();
	}

}
