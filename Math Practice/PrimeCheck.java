import java.util.Scanner;
class PrimeCheck
{
   public static void main(String args[])
   {		
	int temp;
	boolean Prime=true;
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter any number:");

	int num=scan.nextInt();
        scan.close();
   int i = 2;
   
   do{
      temp=num%i;
   	   if(temp==0)
   	   {
   	      Prime=false;
   	      break;
   	   }
         i++   ; 
   }while(i<=num/2);
   

	if(Prime)
	   System.out.println(num + " is a Prime Number");
	else
	   System.out.println(num + " is not a Prime Number");
   }
}