import java.awt.Color;
import java.awt.Container;

import javax.swing.*;
public class j1115_3 extends JFrame{
	JPanel jp;
	SpinnerListModel listModel;
	SpinnerNumberModel numberModel;
	JSpinner spinner;
	Container cp;
	
	String [] items={"mango","apple","banana","grape","straw"};
	
	
	j1115_3(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cp=getContentPane();
		jp=new JPanel();
		jp.setBackground(Color.yellow);
		listModel=new SpinnerListModel(items);
		//spinner�� listmodel �Ű������� ��ü ����
		spinner=new JSpinner(listModel);
		jp.add(spinner);
		//�ǳڿ� ������ ����
		
		numberModel=new SpinnerNumberModel(1,0,9,1);
		//spinner��ü ���� numbermodel�� �Ű������� ��ü����
		//�ǳڿ� ���ǳ� ����
		spinner=new JSpinner(numberModel);
		jp.add(spinner);
		cp.add(jp);
		
		this.setSize(400, 500);
		this.setVisible(true);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new j1115_3();
	}

}
