import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
public class j0927_4 extends Frame implements ActionListener {
	TextArea ta;
	TextField tf;
	Panel p;
	BorderLayout bl;
	j0927_4(){
		bl=new BorderLayout(3,1);
		ta=new TextArea();
		tf=new TextField(30);
		p=new Panel();
		
		tf.addActionListener(this);
		
		p.add(ta, BorderLayout.NORTH);
		p.add(tf,BorderLayout.CENTER);
		
		
		this.add(p);
		
		this.setSize(500,300);
		this.setVisible(true);
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new j0927_4();
	}


	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String s = null;
		if (tf != null) {
			s = tf.getText();
			ta.append(s+"\n");
			tf.requestFocus();
			ta.setEnabled(false);
		}
		
	}

}
