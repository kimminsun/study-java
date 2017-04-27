import java.awt.*;
import java.awt.event.*;
public class j161021_1 extends Frame implements KeyListener{
	Panel p;
	j161021_1(){
		p=new Panel();
		
		this.addKeyListener(this);
		this.add(p);
		this.setSize(400, 500);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new j161021_1();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode()==KeyEvent.VK_F3){
			p.setBackground(Color.YELLOW);
			
		}
		if(e.getKeyCode()==KeyEvent.VK_5){
			p.setBackground(Color.RED);
		}
		
		System.out.println("alt key"+e.isAltDown());
		System.out.println("shift key"+e.isShiftDown());
		System.out.println("ctrl key"+e.isControlDown());

		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
