class MathTest
{
	public static void main(String[] args){
		double rad=5.0,pi=3.14;
		double dr;
		double cirarea;

		dr=Math.pow(rad,2); // ������ rad�� �������ִ� �޼ҵ� pow ����
		cirarea = pi*dr;
		System.out.println("���� ���� "+cirarea);
	}
}