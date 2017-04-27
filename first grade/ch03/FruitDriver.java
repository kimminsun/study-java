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
		System.out.println("f1의 총 갯수 :" + total);
		System.out.println("사과의 총 갯수 : " + f1.apple);
		System.out.println("딸기의 총 갯수 : " + f1.straw);
		System.out.println("포도의 총 갯수 : " + f1.grapes);
		//사과의 갯수를 알기 위해 멤버변수에 직접 접근했다.
		//직접 접근해 값을 바꿀 수도 있다.
		f1.apple = 50;
		//객체 멤버변수가 변했으나 메서드 결과는 변하지 않은 결과가 나온다.
		//멤버변수에 직접 접근하지 못하게 한다. (해결책)
		System.out.println("\nf1의 총 갯수 : " + total);
		System.out.println("사과의 총 갯수 : " + f1.apple);
		System.out.println("딸기의 총 갯수 : " + f1.straw);
		System.out.println("포도의 총 갯수 : " + f1.grapes);
	}
}