import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class j1007_3 extends Frame implements ActionListener{
	Dialog d;
	Label l1;
	Button b1;
	
	j1007_3(){
		
		d=new Dialog(this,"���̾�α�",true);
		d.setLayout(new GridLayout(2,1));
		l1=new Label("������ �ȳ�");
		b1=new Button("�ݱ�");
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
