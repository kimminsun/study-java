import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class w_adapter extends WindowAdapter{
	public void WindowClosing(WindowEvent e){
		System.exit(0);
	}
}
public class j1101_2 extends Frame{
	j1101_2(){
		//w_adapter w=new w_adapter();
		this.addWindowListener(new w_adapter());
		//�̺�Ʈ�� ó�����ִ� �̺�Ʈ�ڵ鷯�� w_adapter ��ü��
		this.setSize(300,400);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new j1101_2();
	}

}
