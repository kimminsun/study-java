class Fruit
{
	private int apple;
	private int straw;
	private int grapes;
	private int sum;

	public Fruit (int apple, int straw, int grapes){
		this.apple = apple;
		this.straw = straw;
		this.grapes = grapes;
	}

	public void setApple(int a){
		apple = a;
	}

	public void getApple(){
		return apple;
	}

	public void setStraw(int s){
		straw = s;
	}

	public void getStraw(){
		return straw;
	}

	public void setGrapes(int g){
		grapes = g;
	}

	public void getGrapes(){
		return grapes;
	}

	public int count(){
		sum = apple + straw + grapes;
		return sum;
	}
}

class FruitDriver
{
	public static void main(String[] args)
	{
		int total;
		Fruit f1 = new Fruit(30,30,30);
		total = f1.count();
		System.out.println("f1�� �� ���� :" + total);
		System.out.println("����� �� ���� : " + f1.apple);
		System.out.println("������ �� ���� : " + f1.straw);
		System.out.println("������ �� ���� : " + f1.grapes);
		//����� ������ �˱� ���� ��������� ���� �����ߴ�.
		//���� ������ ���� �ٲ� ���� �ִ�.
		f1.apple = 50;
		//��ü ��������� �������� �޼��� ����� ������ ���� ����� ���´�.
		//��������� ���� �������� ���ϰ� �Ѵ�. (�ذ�å)
		System.out.println("\nf1�� �� ���� : " + total);
		System.out.println("����� �� ���� : " + f1.apple);
		System.out.println("������ �� ���� : " + f1.straw);
		System.out.println("������ �� ���� : " + f1.grapes);
	}
}