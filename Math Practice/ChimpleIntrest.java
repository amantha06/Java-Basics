import java.util.Scanner;
public class ChimpleIntrest{
   public static void main(String[] args){
   
   Scanner input = new Scanner(System.in);
   System.out.println("Enter amount of money loaned");
   double principle = input.nextDouble();
   
   System.out.println("Enter number of years borrowed");
   double time = input.nextDouble();
   
   System.out.println("Enter the rate of intrest borrowed");
   double rate = input.nextDouble();
   
   input.close();
   
       
      double intrest = (principle * time * rate)/100;
      double amount = principle + intrest;
           
      
      System.out.println("The amount of intrest generated over " + time + " years is $ " + intrest);
      System.out.println("The amount of money owed over " + time + " years is $ " + amount);
   }

}