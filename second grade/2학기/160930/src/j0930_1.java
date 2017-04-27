import java.awt.*;
import java.awt.event.*;
public class j0930_1 extends Frame implements ActionListener, WindowListener{
	TextField tfId;
	TextField tfPwd;
	Panel p;
	Label l1,l2;
	BorderLayout bl;
	Button b;
	TextArea ta;
	j0930_1(){
		bl=new BorderLayout();
		p=new Panel();
		l1=new Label("id : ");
		l2=new Label("Pwd : ");
		b=new Button("OK");
		b.addActionListener(this);
		
		
		tfId=new TextField(10);
		tfPwd=new TextField(10);
		ta=new TextArea();
		tfPwd.setEchoChar('*');
		
		p.add(l1,BorderLayout.NORTH);
		p.add(tfId,BorderLayout.NORTH);
		p.add(l2,BorderLayout.NORTH);
		p.add(tfPwd,BorderLayout.NORTH);
		p.add(b,BorderLayout.NORTH);
		p.add(ta,BorderLayout.SOUTH);
		
		this.addWindowListener(this);
		this.add(p);
		this.setSize(500,500);
		this.setVisible(true);
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new j0930_1();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String s1=tfId.getText();
		String s2=tfPwd.getText();
		if(s1.equals("javachobo")&&s2.equals("asdf")){
			ta.append("javachobo님, 성공적으로 로그인 되셨습니다\n");
		}
			else{
				tfId.requestFocus();
				tfId.selectAll();
				ta.append("	입력하신 id가 유효하지 않습니다. 다시 입력해주세요. \n");
			}
			
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
