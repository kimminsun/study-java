import java.awt.*;
public class j0906_7 extends Frame{
	Dialog dig;
	Label lb;
	Button b1;
	FileDialog fd;
	
	j0906_7(){
		//dig=new Dialog(this,"��ȭ����",true);
		//lb=new Label("�����Ͻðڽ��ϱ�?");
		//dig.add(lb,"North");
		//b1=new Button("����");
		//dig.add(b1,"Center");
		
		//dig.setBounds(150,120,200,100);
		fd=new FileDialog(this,"Open");
		fd.setBounds(130,80,100,80);
			
		this.setBounds(100,120,300,160);
		this.setVisible(true);
		fd.setVisible(true);
		//dig.setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new j0906_7();
	}

}
