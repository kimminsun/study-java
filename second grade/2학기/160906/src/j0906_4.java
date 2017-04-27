import java.awt.*;
public class j0906_4 extends Frame{
	
	Choice c1,c2;
	Panel p;
	j0906_4(){
		p=new Panel();
		c1=new Choice();
		c2=new Choice();
		for(int i=1;i<=12;i++){
			c1.addItem(i+"¿ù");
		}
		for(int i=1;i<=31;i++){
			c2.addItem(i+"ÀÏ");
		}
		p.add(c1);
		p.add(c2);
		
		this.add(p);
		
		this.setSize(500,400);
		this.setVisible(true);
		System.out.println(c1.getSelectedItem());
		System.out.println(c1.getSelectedIndex());
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			j0906_4 j=new j0906_4();
	}

}
