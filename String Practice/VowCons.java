import java.util.Scanner;
public class VowCons{
   public static void main(String[] args){
   
      Scanner detect = new Scanner(System.in);
      System.out.println ("Enter Character ");
      String letter = detect.nextLine();
      detect.close();
   
      if(letter == "a" || letter == "e" || letter == "i" || letter == "o" || letter == "u"){
         System.out.println("The letter " + letter + " is a vowel ");  
      }
      else{
         System.out.println("The letter " + letter + "is a Consonant ");
      }
   }
   
}