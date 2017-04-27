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
		
		m1=new MenuItem("새로만들기(N)  Ctrl+N  ",ms1);
		m2=new MenuItem("불러오기");
		m3=new MenuItem("저장하기");
		m4=new MenuItem("다른 이름으로 저장하기");
		m5=new MenuItem("끝내기(x)   Ctrl+X  ",ms2);
		
		
		m4=new MenuItem("모양");
		m5=new MenuItem("도구모음");
		
		
		m6=new MenuItem("기본모양");
		m7=new MenuItem("모양");
		
		
		
		mn1=new Menu("파일");
		mn2=new Menu("편집");
		mn3=new Menu("보기");
		
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
