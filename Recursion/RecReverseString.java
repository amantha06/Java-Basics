/*
1.  Function to print reverse of the passed string
      have a null string, 
      find the length
      use if statement to go through and reverse string     
2.  Driver program to apply
*/
import java.util.Scanner;
public class RecReverseString 
{ 
    public void reverse(String str) 
    { 
        if ((str==null)||(str.length() <= 1)) 
           System.out.println(str); 
        else
        { 
            System.out.print(str.charAt(str.length()-1)); 
            reverse(str.substring(0,str.length()-1)); 
        } 
    } 
      
    public static void main(String[] args)  
    { 
        Scanner s = new Scanner(System.in);
        System.out.println("Enter String Here");
        String str = s.nextLine();
        s.close();
        
        RecReverseString obj = new RecReverseString(); 
        obj.reverse(str); 
        
    }     
} 