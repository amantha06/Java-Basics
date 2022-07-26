//FOR THIS ASSIGNMENT WE ARE ONLY SUPPOSED TO DO pseu·do·code 
//I STARTED THE BEGGINING OF THE PROGRAM

/** PSEUDOCODE
1. scan 3 strings
   change to lowercase
   change to no space interfierance
2. take the first char of each 
   Use Array or
   Use CharAt
4. If Statement


**/ 
 
import java.util.Scanner;
public class StringAlpha{
   public static void main(String[] args){
   
      Scanner enter = new Scanner(System.in);
      System.out.println("Enter First String Here:");
      String wordA = enter.nextLine();
   
      System.out.println("Enter Second String Here:");
      String wordB = enter.nextLine();
   
      System.out.println("Enter Third String Here;");
      String wordC = enter.nextLine();
      
      
   
      if(wordA.compareToIgnoreCase(wordB)>0)
      {
         if(wordB.compareToIgnoreCase(wordC)>0){
            System.out.println(wordC + " " + wordB + " " + wordA);
         }
         else{
            if(wordC.compareToIgnoreCase(wordA)>0){
               System.out.println(wordB + " " + wordA + " " + wordC);
            }
         }
      }
   
      if(wordA.compareToIgnoreCase(wordC)>0)
      {
         if(wordC.compareToIgnoreCase(wordB)>0){   
            System.out.println(wordB + " " + wordC + " " + wordA);
         }
         else{
            if(wordB.compareToIgnoreCase(wordA)>0){
               System.out.println(wordC + " " + wordA + " " + wordB);
            }
         }
      
      }
      if(wordB.compareToIgnoreCase(wordC)>0)
      {
         if(wordC.compareToIgnoreCase(wordA)>0){
            System.out.println(wordA + " " + wordC + " " + wordB);
         }
         else{
            if(wordA.compareToIgnoreCase(wordC)<0){
               System.out.println(wordA + " " + wordB + " " + wordC);
            }
         }
      
      
      }   
   
   
   
   } 
}   
