import java.awt.*;
import java.awt.event.*;
public class j0923_3 extends Frame implements ActionListener{
	TextArea ta1, ta2;
	Button b1;
	GridLayout gl;
	
	j0923_3() {
		gl = new GridLayout(3,1);
		this.setLayout(gl);
		
		b1 = new Button("»Æ¿Œ");
		ta1 = new TextArea();
		ta2 = new TextArea();
		
		this.add(ta1);
		this.add(b1);
		this.add(ta2);
		
		b1.addActionListener(this);
		
		this.setSize(300,400);
		this.setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		String s = null;
		if (ta1 != null) {
			s = ta1.getText();
			ta2.append(s);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new j0923_3();
	}

}