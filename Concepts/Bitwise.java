import java.util.Scanner;
public class Bitwise 
{
    public static void main(String args[])
    {
        int x, y;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number:");
        x = scanner.nextInt();
        System.out.print("Enter second number:");
        y = scanner.nextInt();
             
              x = x ^ y;
              y = x ^ y;           
              x = x ^ y;
        scanner.close();
        System.out.println("The First number after swapping:"+x);
        System.out.println("The Second number after swapping:"+y);
    }
}