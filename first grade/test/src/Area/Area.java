package Area;

public class Area
{
 public static void main(String args[]){

  int fac=1;
  
  if (args.length == 0 || args.length > 3) {
       System.out.println("�Է°����� �Ű������� 1~3�� �����Դϴ�!!");
       
     }
     
  
     if(args.length == 1)
     {
   
      int number  = Integer.parseInt(args[0]);
      //�߰�
      int i=1;
      
      for(i =1; i<number+1; i++)
      {
   	   fac = fac*i;
      }
      //�߰� ��
      System.out.println(fac); //����
     }
    
     else if(args.length == 2)
     {
      int number2 = Integer.parseInt(args[0]);
      int number3 = Integer.parseInt(args[1]);
      
      System.out.println("�� ���� ����" + (number2 - number3));
     }
  
     else if(args.length == 3)
     {
      int number4 = Integer.parseInt(args[0]);
      int number5 = Integer.parseInt(args[1]);
      int number6 = Integer.parseInt(args[2]);
      
      System.out.println("�� ���� ��" + number4 * number5 * number6);
     }
 }
}
