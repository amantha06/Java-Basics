import java.util.Scanner;
public class LeapYear{

   public static void main(String[] args){
   int year;
   Scanner leap = new Scanner(System.in);   
   System.out.println("Enter Year");
   year = leap.nextInt();
   leap.close();
   
   boolean leapYear = true;
   
   {
      if(year % 4 == 0)  // every leap year number is divisible by 4
         leapYear = true;
      else
         leapYear = false;
      }
   {
   if(leapYear == true)
      System.out.println("The year " + year + " is a leap year ");
   else
      System.out.println("The year " + year + " is not a leap year ");
      } 
   
   }
}