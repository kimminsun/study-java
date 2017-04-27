import java.util.Scanner;
class Game369
{
	public static void main(String args[]){
		System.out.print("1~99»çÀÌÀÇ Á¤¼ö¸¦ ÀÔ·ÂÇØÁÖ¼¼¿ä>>");
		Scanner scan=new Scanner(System.in);
		int number=scan.nextInt();

		int fnumber=number/10;
		int tnumber=number%10;

		int clap=0;

		if(fnumber==3 || fnumber==6 || fnumber==9)
			clap++;
		if(tnumber==3 || tnumber==6 || tnumber==9)
			clap++;

		if(clap==2)
			System.out.print("Â¦Â¦");
		else if(clap==1)
			System.out.print("Â¦");
		else
			System.out.print("X");


	}
}
