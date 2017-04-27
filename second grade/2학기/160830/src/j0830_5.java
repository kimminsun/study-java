import java.awt.*;
public class j0830_5 extends Frame {
	Panel p;
	Checkbox ch1,ch2,ch3,ch4;
	j0830_5(){
		CheckboxGroup cbg=new CheckboxGroup();
		p=new Panel();
		ch1=new Checkbox("A형",cbg,true);
		ch2=new Checkbox("B형",cbg,false);
		ch3=new Checkbox("O형",cbg,false);
		ch4=new Checkbox("AB형",cbg,false);
		
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
		j0830_5 j=new j0830_5();

	}

}
