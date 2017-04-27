package Area;

public class Area
{
 public static void main(String args[]){

  int fac=1;
  
  if (args.length == 0 || args.length > 3) {
       System.out.println("입력가능한 매개변수는 1~3개 사이입니다!!");
       
     }
     
  
     if(args.length == 1)
     {
   
      int number  = Integer.parseInt(args[0]);
      //추가
      int i=1;
      
      for(i =1; i<number+1; i++)
      {
   	   fac = fac*i;
      }
      //추가 끝
      System.out.println(fac); //변경
     }
    
     else if(args.length == 2)
     {
      int number2 = Integer.parseInt(args[0]);
      int number3 = Integer.parseInt(args[1]);
      
      System.out.println("두 수의 차이" + (number2 - number3));
     }
  
     else if(args.length == 3)
     {
      int number4 = Integer.parseInt(args[0]);
      int number5 = Integer.parseInt(args[1]);
      int number6 = Integer.parseInt(args[2]);
      
      System.out.println("세 수의 곱" + number4 * number5 * number6);
     }
 }
}
