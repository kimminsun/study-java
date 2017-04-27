class Person
{
	String name;
	String sex;
	int age;
	Person(){}
	Person(String name,String sex,int age){
		this.name=name;
		this.sex=sex;
		this.age=age;
	}

	void show()
	{
		System.out.println("ÀÌ¸§: "+name+" ¼ºº°: "+sex+" ³ªÀÌ: "+age);
	}
	
}

class PersonDriver
{
	public static void main(String args[]){
	Person p1=new Person("±è¹Î¼±","¿©ÀÚ",18);
	Person p2=new Person();
	p2.name="±è¹ÎÁ¤";
	p2.sex="¿©ÀÚ";
	p2.age=16;
	p1.show();
	p2.show();
	}
}
