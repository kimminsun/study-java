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
		//이벤트를 처리해주는 이벤트핸들러는 w_adapter 객체에
		this.setSize(300,400);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new j1101_2();
	}

}
