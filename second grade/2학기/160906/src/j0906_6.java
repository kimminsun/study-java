import java.awt.*;
public class j0906_6 extends Frame {
	Dialog d;
	j0906_6(){
		d=new Dialog(this,"다이아로그");
		d.setSize(100, 50);
		this.setSize(300,200);
		this.setVisible(true);
		d.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new j0906_6();
	}

}
