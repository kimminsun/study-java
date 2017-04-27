import java.awt.*;
public class j0906_2 extends Frame {
	Label [] lb=new Label[5];
	TextField []tf=new TextField[5];
	String []tit={"Id","Password","name","Age","tel"};
	TextArea ta;
	Label lb2;
	Button btn;
	
	j0906_2(){
		ta=new TextArea(40,30);
		this.setLayout(null);//레이아웃 해지
		for(int i=0;i<lb.length;i++){
			lb[i]=new Label(tit[i],Label.RIGHT);
			lb[i].setBounds(0, (i*30)+40, 70, 25);
			tf[i]=new TextField();
			tf[i].setBounds(80,(i*30)+40,150,25);
			this.add(lb[i]);
			this.add(tf[i]);
		}
		tf[1].setEchoChar('*');
		lb2=new Label("입력결과");
		lb2.setBounds(10, 200, 200, 20);
		ta.setBounds(10,220,480,140);
		btn=new Button("확인");
		btn.setBounds(410,370,80,30);
		this.add(lb2);
		this.add(ta);
		this.add(btn);
		this.setSize(480, 500);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		j0906_2 j=new j0906_2();

	}

}
