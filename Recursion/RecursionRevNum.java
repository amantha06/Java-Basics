/**
1. Scan
2. create method for reverse method
3. invoke it into the second main method
**/ 

import java.util.Scanner;
public class RecursionRevNum
{

   public static void reverseMethod(int number) {
       if (number < 10) {
	   System.out.println(number);
	   return;
       }
       else {
           System.out.print(number % 10);
           reverseMethod(number/10);
       }
   }
   public static void main(String args[])
   {
	int num=0;
	System.out.println("Enter your number here");
	Scanner in = new Scanner(System.in);
	num = in.nextInt();
	System.out.print("Reverse of the input number is ");
	reverseMethod(num);
	System.out.println();
   }
}