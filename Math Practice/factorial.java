import java.util.Scanner;
public class factorial{
   public static void main(String[] args){
   
   Scanner input = new Scanner(System.in);
   
   System.out.println("Enter Value");

   int val = input.nextInt();
   
   input.close();
   
   factorial fac = new factorial();
   fac.doWhile();
   fac.forLoop(val);

   }
   
   public void doWhile(){
      //int num may vary
      int num = 8;
      long fac = 1;
      int i = 1;
      
      do{
         fac = fac * i;  //starting with 1
         i++;  //changing into 2
      }while(i<= num);  //making sure it is multiplying till 7
      System.out.println(num + "! " + "= " + fac);  
  
  }
   
   public void forLoop(int val){
      
      int fac = 1;
      
      for(int i = 1; i<= val; i++){
         fac = fac * i;

      }
         System.out.println(val + "! " + "= " + fac);

   }
   
   
   
}