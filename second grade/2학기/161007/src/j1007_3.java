import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class j1007_3 extends Frame implements ActionListener{
	Dialog d;
	Label l1;
	Button b1;
	
	j1007_3(){
		
		d=new Dialog(this,"다이얼로그",true);
		d.setLayout(new GridLayout(2,1));
		l1=new Label("여러분 안녕");
		b1=new Button("닫기");
		d.add(l1);
		d.add(b1);
		b1.addActionListener(this);
		
		this.setSize(500,600);
		this.setVisible(true);
		
		d.setBounds(150,120,200,100);
		
		
		d.setSize(300,300);
		d.setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new j1007_3();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1)
			System.exit(0);
	}

}
