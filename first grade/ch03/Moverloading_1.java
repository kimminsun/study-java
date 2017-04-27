class Moverloading_1
{
	public static void main(String[] args) 
	{
		Square s1 = new Square();
		int input[] = new int[args.length];

		for(int i = 0 ; i < args.length ; i++){
			input[i] = Integer.parseInt(args[i]);
		}

		switch(args.length){
			case 0: s1.cals(); break;
			case 1: s1.cals(input[0]); break;
			case 2: s1.cals(input[0], input[1]); break;
			case 3: s1.cals(input[0], input[1], input[2]); break;
			case 4: System.out.println("�Ű������� �ʹ� �����ϴ�.");
		}
	}
}

class Square
{
	void cals(){
		System.out.println("�Ű������� �����ϴ�.");
	}

	void cals(int width){
		System.out.println("���簢���� ���� : " + width*width);
	}

	void cals(int width, int height){
		System.out.println("���簢���� ���� : " + width*height);
	}

	void cals(int width, int height, int depth){
		System.out.println("������ü�� ���� : " + width*height*depth);
	}
}