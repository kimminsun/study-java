import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
public class j0923_2 extends Frame implements ItemListener {
	Image img;
	int select=0;
	Label lb;
	Choice ch;
	Panel p;
	TextArea ta;
	BorderLayout bl;
	Toolkit tool;
		j0923_2() {
				p=new Panel();
				lb=new Label("Select Image");
				ch=new Choice();
				ch.addItem("사진1");
				ch.addItem("사진2");
				ch.addItem("사진3");
				ch.addItemListener(this);
				p.add(lb);
				p.add(ch);
				this.add(p,"North");
				this.setBounds(0,0,400,300);
				this.setVisible(true);
		}
public static void main(String[] args) {
new j0923_2();
}
public void itemStateChanged(ItemEvent e) {
System.out.println(e.getItem());
if(e.getItem().equals("사진1")) {
select=1;
}
else if(e.getItem().equals("사진2")) {
select=2;
}
else if(e.getItem().equals("사진3")) {
select=3;
}
}
public void paint(Graphics g) {
if(select==1) {
tool=Toolkit.getDefaultToolkit();
img=tool.getImage("img/ka_1.jpg");
g.drawImage(img, 30,50,180,180, this);
}
else if(select==2) {
tool=Toolkit.getDefaultToolkit();
img=tool.getImage("img/ka_2.jpg");
g.drawImage(img, 30,50,180,180, this);
}
else if(select==3) {
tool=Toolkit.getDefaultToolkit();
img=tool.getImage("img/ka_3.jpg");
g.drawImage(img, 30,50,180,180, this); 
}
}
}