import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class j1007_1 extends Frame implements WindowListener{
	Label l1;
	TextField tf1;
	Button b1,b2,b3,b4;
	TextArea ta1;
	Panel p;
	
	j1007_1(){
		super("친구정보");
		p=new Panel();
		l1=new Label("이 름 ");
		tf1=new TextField(10);
		b1=new Button("검색");
		
		ta1=new TextArea();
		b2=new Button("저장");
		b3=new Button("삭제");
		b4=new Button("수정");
		
		p.add(l1);
		p.add(tf1);
		p.add(b1);
		
		p.add(ta1);
		
		p.add(b2);
		p.add(b3);
		p.add(b4);
		
		this.add(p);
		this.setSize(400, 500);
		this.setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new j1007_1();
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
	System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
			
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}
