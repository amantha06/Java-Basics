/**
1.      Duplicate character in a string. When ever you find a duplicate character Print it out and exit the program.

Scan the String.  “helloe”
Get the first char.
1.      You can use charAt method in string class. Keep track to string length
2.      Convert the passed in string to char array and get the first char.
Take the first char and iterate through the string if a match is found exit.
Figure out a way to iterate over all other char’s in the string.
**/


import java.util.Scanner;
public class dupChars{
   public static void main(String[] args){
      Scanner yeet = new Scanner(System.in);
      System.out.println("Enter String Here");
      String word = yeet.nextLine();
      yeet.close();
      
      String Chara = "";
      String Dupp = " ";
      
      for(int i = 0; i < word.length(); i++){
      //System.out.println(word.charAt(i));
            String clearer = word.charAt(i)+"";
      if(Chara.contains(clearer)){
         if(!Dupp.contains(clearer)){
         Dupp += clearer;
         }
      }
      Chara += clearer;
      }
      System.out.println(Dupp);

   }
}