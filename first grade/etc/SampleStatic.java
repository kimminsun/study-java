class MathTest
{
	public static void main(String[] args){
		double rad=5.0,pi=3.14;
		double dr;
		double cirarea;

		dr=Math.pow(rad,2); // 반지름 rad를 제곱해주는 메소드 pow 수행
		cirarea = pi*dr;
		System.out.println("원의 넓이 "+cirarea);
	}
}