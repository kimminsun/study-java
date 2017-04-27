class Moverloading
{
	public static void main(String[] args) 
	{
		Add a = new Add();
		System.out.println(a.sum("미림", "솔루션"));
		System.out.println(a.sum(10, 20));
	}
}

class Add
{
	String sum(String s1, String s2){	//메서드 오버로딩은 리턴타입이 달라도 관계없다.
		return s1 + s2;
	}
	int sum(int i1, int i2){
		return i1 + i2;
	}
}