/**
1. Scan String
2. Replace spaces with no spaces\
3. iterate through loop for repeated occurances (count char function)
4. When done replace that char with nothing

INSIDE COUNT CHAR is the real stuff

**/

import java.util.Scanner;
public class Occurances{
   public static void main(String[] args){
   
      Scanner input = new Scanner(System.in);
      System.out.println("Enter word here");
      String word = input.nextLine();
      input.close();
   
      word = word.replace(" ", "");
      while (word.length() > 0){
         char letter = word.charAt(0);
         System.out.println(letter + " " + countChar(word, letter));
         word = word.replace("" + letter, "");
      }
   
   }
   
   public static int countChar(String word, char letter){
      int count = 0;
      while (word.indexOf(letter) != -1) {
         count++;
         word = word.substring((word.indexOf(letter)+1));
      }
      return count;
   }
}