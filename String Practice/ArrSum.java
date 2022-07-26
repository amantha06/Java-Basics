import java.util.Scanner;
class ArrSum{
   
   public static void main(String args[]){
      
      Scanner array = new Scanner(System.in);
      int[] list = new int[10];
      int sum = 0;
      System.out.println("Enter the elements:");
      for (int i=0; i<5; i++)  //how you only enter 5 elements
      {
    	  list[i] = array.nextInt();    
      }
      for( int num : list) {
          sum = sum+num;   // adding the sum of the previous to next in loop
      }
      array.close();
      System.out.println("Sum of array elements is "+sum);
   }
}