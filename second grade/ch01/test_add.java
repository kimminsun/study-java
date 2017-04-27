class test_add 
{
	int num1=10;
	int num2=20;

	void add(){
		System.out.println("num1+num2="+(num1+num2));
	}//리턴타입,매개변수X
	int add1(){
		return (num1+num2);
	}//리턴타입O,매개변수X
	void add2(int num1,int num2)
	{
		System.out.println("num1+num2="+(num1+num2));
	}//매개변수O,리턴타입X
	int add3(int num1,int num2)
	{
		return (num1+num2);
	}//매개변수,리턴타입O


	public static void main(String[] args)
	{
		test_add t1=new test_add();
		t1.add();
		t1.add2(10,20);
		System.out.println("num1+num2="+t1.add1());
		System.out.println("num1+num2="+t1.add3(10,20));

	}
}
