import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class j1101_1 extends Frame implements WindowListener
{
	Panel p;
	j1101_1(){
		p=new Panel();
		this.add(p);
		this.addWindowListener(this);
		this.setSize(400,500);
		this.setVisible(true);
	}
	
	
	
	public static void main(String[] args){
		new j1101_1();
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

