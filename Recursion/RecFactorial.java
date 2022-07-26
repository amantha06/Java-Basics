/* 
1. Scan Int
2. 2 methods 
   a. main method to implement the program
   b. Driver method to have the brains of the operation
3. In Main Method Scan the int and call "fac"
4. In fac have if statement that continues to do fac(n-1) * n over and over again
*/

import java.util.Scanner;
class RecFactorial{
   public static void main(String args[]){
  
      Scanner s = new Scanner(System.in);
      System.out.println("Enter the number:");
      int num = s.nextInt();
      s.close();
      
      int factorial = fac(num);
     
      System.out.println(num + "! = " +factorial);
   }
   static int fac(int n)
   {
       int output;
       if(n==1){
         return 1;
       }

       output = fac(n-1)* n;
       return output;
   }
}