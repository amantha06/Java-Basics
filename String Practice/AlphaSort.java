/**
1. import scanner and arrays
2. create a method which does the main work
   use arrays to sort the take string into array and sort
3. go to main method
   Scan String 
   invoke sortString method of the string word  
**/
import java.util.Arrays; 
import java.util.Scanner;
  
public class AlphaSort { 
 
   public static void sortString(String str) { 
      char []arr = str.toCharArray(); 
      Arrays.sort(arr); 
      System.out.print(String.valueOf(arr)); 
   } 
 
   public static void main(String[] args) { 
      
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter string here");
      String word = scan.nextLine();
      scan.close();
   
      sortString(word); 
   } 
} 
