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
		System.out.println("�̸�: "+name+" ����: "+sex+" ����: "+age);
	}
	
}

class PersonDriver
{
	public static void main(String args[]){
	Person p1=new Person("��μ�","����",18);
	Person p2=new Person();
	p2.name="�����";
	p2.sex="����";
	p2.age=16;
	p1.show();
	p2.show();
	}
}
