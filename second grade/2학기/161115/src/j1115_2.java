import java.awt.Container;

import javax.swing.*;
public class j1115_2 extends JFrame {
	Container cp;
	JSlider jslider;
	j1115_2(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cp=getContentPane();
		
		jslider=new JSlider(JSlider.HORIZONTAL,0,200,100);
		jslider.setPaintLabels(true);
		jslider.setPaintTicks(true);
		jslider.setPaintTrack(true);
		jslider.setMajorTickSpacing(50);
		jslider.setMinorTickSpacing(10);
		
		
		cp.add(jslider);
		this.setSize(400,500);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new j1115_2();
	}

}
