import java.awt.*;
public class j0906_5 extends Frame {
	List l;
	Panel p;
	j0906_5(){
		l=new List(4);
		p=new Panel();
		l.add("개");
		l.add("소");
		l.add("돼지");
		l.add("말");
		
		p.add(l);
		this.add(p);
		
		this.setSize(400,500);
		this.setVisible(true);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		j0906_5 j=new j0906_5();
	}

}
