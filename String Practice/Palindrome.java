/** 
1.Enter String through Scanner
2.Make the word lower case for no case sensitivity
3.Create other string for reverse value to compare
4.Make a for loop to reverse the string 
5.CharAt to add value to reverse in loop to start getting individual values of the chars in the string
    This makes it print in reverse order(can test);
6.You got both reversed and original take another boolean to compare one char at a time
7.Create another for loop
(one key point is to ignore space which is why there is a break)
**/ 

import java.util.Scanner;
public class Palindrome{
   public static void main(String[] args){
   
   Scanner input = new Scanner(System.in);
   System.out.println("Enter your Word here");
   String word = input.nextLine();
   input.close();
   word = word.toLowerCase();
   word =  word.replace(" ", "");
   
   String reverse = "";
   
    for(int i = word.length() - 1; i>=0; i--){
       reverse += word.charAt(i);
       }
       //System.out.println(reverse); 

   boolean isPalindrome = true;
   
   for(int i = 0; i < word.length(); i++){
   //System.out.print(i);
      if(word.charAt(i) == ' '){
      break;
      }
      if(word.charAt(i) != reverse.charAt(i)) {
      isPalindrome = false;
      }
      }
      if (isPalindrome){
      System.out.println(" is a palindrome");
      }
      else{
      System.out.println(" is not a palindrom");
      }
   }
}