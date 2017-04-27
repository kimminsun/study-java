class Student
{
	String name;
	int grade;
	public Student(){ }
	public Student(String name){
		this.name = name;
	}
	public Student(String name, int grade){
		this(name);	//6번 호출 실행
		this.grade = grade;
	}
}
class StudentExam 
{
	public static void main(String[] args)
	{
		Student kim = new Student("김명은");		//2번 생성자 메서드 실행
		Student song = new Student("송아지", 3);	//2번, 3번 생성자 메서드 실행
		System.out.println("Hello World!");
	}
}