/**
1. Scan the String
2. Create Method where the real stuff is at
   boolean
   check
   account for 1 or 0 letters
   COMPARE
3. Main Method
   execute the method
**/
import java.util.Scanner;
public class RecPalindrome{
      
   public static boolean isPalindrome(String s){
   
   if(s.length() == 0 || s.length() == 1)
      return true; 
   if(s.charAt(0) == s.charAt(s.length()-1))
      return isPalindrome(s.substring(1, s.length()-1));
      
   return false;
   
   }
   
   public static void main(String[] args){
   
   Scanner input = new Scanner(System.in);
   System.out.println("Enter your word here");
   String word = input.nextLine();
   input.close();
   
   if(isPalindrome(word))
      System.out.println(word + " is a palindrome");
   else
      System.out.println(word + " is not a palindrome");
   }

   
 
}