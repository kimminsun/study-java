import java.awt.*;
public class j0830_1 extends Frame {
	Label l1;
	Panel p1;
	Checkbox c1,c2,c3,c4;
	Button b1;
	j0830_1(){
		CheckboxGroup cbg=new CheckboxGroup();
		l1=new Label("취미를 선택하세요 ");
		this.add(l1,BorderLayout.NORTH);
		p1=new Panel();
		c1=new Checkbox("개",false,cbg);
		c2=new Checkbox("소",false,cbg);
		c3=new Checkbox("돼지",true,cbg);
		c4=new Checkbox("말",false,cbg);
		p1.setBackground(Color.lightGray);
		p1.add(c1 );
		p1.add(c2 );
		p1.add(c3 );
		p1.add(c4 );
		this.add(p1,BorderLayout.CENTER);
		b1=new Button("입력완료");
		this.add(b1,BorderLayout.SOUTH);
	
		
		
		this.setSize(400, 400);
		this.setVisible(true);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		j0830_1 j1=new j0830_1();

	}

}
