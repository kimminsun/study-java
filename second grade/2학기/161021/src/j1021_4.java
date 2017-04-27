import java.awt.*;
import java.awt.event.*;
public class j1021_4 extends Frame implements MouseMotionListener {
	
	j1021_4(){
		this.addMouseMotionListener(this);
		this.setSize(400,500);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new j1021_4();
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("마우스드래그");
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("마우스무브");
		
	}

}