//combine occurances and vow cons program

import java.util.Scanner;
public class countVowCons{
   public static void main(String[] args){
   
   Scanner input = new Scanner(System.in);
   System.out.println("Enter word here");
   String word = input.nextLine();
   input.close();
   
   int vow = 0;
   int con = 0;
   
   word = word.toLowerCase();
   
   for(int i = 0; i <word.length(); i++){
   
   char detect = word.charAt(i);
   if(detect == 'a'|| detect == 'e' || detect == 'i' || detect == 'o' || detect == 'u'){
   vow++;
   }
  
   }
   
   con = word.length() - vow;
   
   System.out.println("number of vowels is " + vow);
   System.out.println("number of consonants is " + con);
   
   }
}