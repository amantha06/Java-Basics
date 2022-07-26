import java.util.Scanner;
public class CheckEvenOdd{
   public static void main(String[] args){
   Scanner check = new Scanner(System.in);
   System.out.println("Enter any number to check if it is even or odd");
   int val = check.nextInt();
   check.close();
   
   if (val/2 == 0){
      System.out.println("The value " + val + " is neither odd nor even ");
   }
   else{
   if (val%2 == 0){
         System.out.println("The value " + val + " is even");
      }
      else{
         System.out.println("The value " + val + " is odd");
   }
   }
}
}
   
   
   
   
