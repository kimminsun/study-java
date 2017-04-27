import java.awt.*;
import java.awt.event.*;
public class j0923_4 extends Frame implements ItemListener{
	TextArea ta;
	Checkbox cb1, cb2, cb3, cb4;
	Panel p;
	GridLayout gl;
	
	j0923_4() {
		ta = new TextArea();
		cb1 = new Checkbox("∞≥");
		cb2 = new Checkbox("º“");
		cb3 = new Checkbox("∏ª");
		cb4 = new Checkbox("µ≈¡ˆ");
		
		cb1.addItemListener(this);
		cb2.addItemListener(this);
		cb3.addItemListener(this);
		cb4.addItemListener(this);
		
		p = new Panel();
		gl = new GridLayout(2,1);
		
		p.add(cb1);
		p.add(cb2);
		p.add(cb3);
		p.add(cb4);
		
		this.setLayout(gl);
		this.add(p);
		this.add(ta);
		this.setSize(300, 400);
		this.setVisible(true);
	}
	public void ItemStateChanged(ItemEvent e){
		if(e.getStateChange()==ItemEvent.SELECTED){
			ta.append(e.getItem()+"∞° º±≈√µ ");
		}
		else if(e.getStateChange()==ItemEvent.DESELECTED){
			ta.append(e.getItem()+"∞° √Îº“µ ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new j0923_4();
	}

}