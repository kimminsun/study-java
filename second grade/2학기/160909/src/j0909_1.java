import java.awt.*;
import java.awt.event.KeyEvent;
public class j0909_1 extends Frame {
	MenuBar mb;
	Menu mn1,mn2,mn3;
	MenuItem m7,m8;
	MenuItem m9,m10,m11;
	MenuShortcut ms1,ms2;
	MenuItem m1,m2,m3,m4,m5,m6;
	CheckboxMenuItem cmi1,cmi2;
	j0909_1(){
		mb=new MenuBar();	
		
		ms1=new MenuShortcut(KeyEvent.VK_N,false);
		ms2=new MenuShortcut(KeyEvent.VK_X,false);
		
		m1=new MenuItem("���θ����(N)  Ctrl+N  ",ms1);
		m2=new MenuItem("�ҷ�����");
		m3=new MenuItem("�����ϱ�");
		m4=new MenuItem("�ٸ� �̸����� �����ϱ�");
		m5=new MenuItem("������(x)   Ctrl+X  ",ms2);
		
		
		m4=new MenuItem("���");
		m5=new MenuItem("��������");
		
		
		m6=new MenuItem("�⺻���");
		m7=new MenuItem("���");
		
		
		
		mn1=new Menu("����");
		mn2=new Menu("����");
		mn3=new Menu("����");
		
		mn1.add(m1);
		mn1.add(m2);
		mn1.addSeparator();
		mn1.add(m3);
		mn1.add(m4);
		mn1.add(m5);
		
		mn3.add(m4);
		mn3.add(m5);
		
		mb.add(mn1);
		mb.add(mn2);
		mb.add(mn3);
		
		Image icon=this.getToolkit().getImage("img/img1.PNG");
		this.setIconImage(icon);
		
		this.setMenuBar(mb);
		this.setSize(400,500);
		this.setVisible(true);
		
		
		
	}
	public void paint(Graphics g){
		Toolkit tool=Toolkit.getDefaultToolkit();
		Image img=tool.getImage("img/img1.PNG");
		g.drawImage(img, 0, 0, 520,350,this);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new j0909_1();

	}

}
