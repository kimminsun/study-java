import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class j0927_3 extends Frame implements ActionListener {
	Label l1,l2;
	Checkbox cb1,cb2,cb3,cb4;
	CheckboxGroup cbg1,cbg2;
	Panel p; 
	GridLayout gl;
	j0927_3(){
		p=new Panel();
		gl=new GridLayout()
		l1=new Label("1. 다음중 제일 미운 동물은?(모두 고르시오)");
		l2=new Label("2. 다음중 제일 이쁜 동물은?(하나만 고르시오)");
		cbg1=new CheckboxGroup();
		cb1=new Checkbox("개",cbg1,true);
		cb2=new Checkbox("소",cbg1,false);
		cb3=new Checkbox("돼지",cbg1,false);
		cb4=new Checkbox("말",cbg1,false);
		
		p.add(cb1);
		p.add(cb2);
		p.add(cb3);
		p.add(cb4);
		
		this.add(p);
	
		this.setSize(300,400);
		this.setVisible(true);
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new j0927_3();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	
}
