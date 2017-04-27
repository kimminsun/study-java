import java.awt.*;
public class j0830_4 extends Frame {
	Panel p;
	Checkbox ch1,ch2,ch3,ch4;
	j0830_4(){
		p=new Panel();
		ch1=new Checkbox("봄");
		ch2=new Checkbox("여름");
		ch3=new Checkbox("가을");
		ch4=new Checkbox("겨울",true);
		
		p.add(ch1);
		p.add(ch2);
		p.add(ch3);
		p.add(ch4);
		
		this.add(p);
		
		this.setSize(400, 400);
		this.setVisible(true);
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		j0830_4 j=new j0830_4();
	}

}
