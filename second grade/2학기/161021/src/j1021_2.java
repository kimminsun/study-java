import java.awt.*;
import java.awt.event.*;
public class j1021_2 extends Frame implements KeyListener{
	Panel p;
	Label l;
	
	j1021_2(){
		
		p=new Panel();
		l=new Label("움직인다");
		
		Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
		
		
		//Dimension f_size=super.getSize();
		//int xpos2=(int)(f_size.getWidth());
		//int ypos2=(int)(f_size.getHeight());
		
		
		super.setVisible(true);
		l.setLocation(500,400);
		this.addKeyListener(this);
		p.add(l);
		this.add(p);
	
		
		this.setSize(400, 500);
		this.setVisible(true);
		
		Dimension f_size=this.getSize();
		int xpos=(int)(screen.getWidth());
		int ypos=(int)(screen.getHeight());		//현재사이즈 얻어오는 메서드
		

		System.out.println(f_size.getWidth());
		System.out.println(f_size.getHeight());
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	new j1021_2();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		int keyCode=e.getKeyCode();
		switch(keyCode){
		
		case KeyEvent.VK_UP:
		int ypos=l.getY()-10;
		if(l.getY()<0){
			l.setLocation(l.getX(), 0);
		}//end of if
		else l.setLocation(l.getX(), ypos);
		break;
		
		case KeyEvent.VK_DOWN:
			l.setLocation(l.getX(), l.getY());
			break;
			
		case KeyEvent.VK_LEFT:
			l.setLocation(l.getX(), l.getY());
			break;
		}
		

	}
			
	
		}
		
	}	
		
		
		
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
