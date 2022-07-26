import java.util.Scanner;
class ReverseNum
{
   public static void main(String args[]){
   
    Scanner input = new Scanner(System.in);
    System.out.println("Enter Number Here: ");
    int whileLoop = input.nextInt();
    int doWhileLoop = input.nextInt();
    input.close();
   
   ReverseNum diffLoop = new ReverseNum();
   diffLoop.numWhile(whileLoop);
   diffLoop.numDoWhile(doWhileLoop);
                    
     
     
   }
   public void numWhile(int whileLoop){
      int revnumwhile =0;

    
    while( whileLoop != 0 )
      {
          revnumwhile = revnumwhile * 10;
          revnumwhile = revnumwhile + whileLoop%10;
          whileLoop = whileLoop/10;
      }

      System.out.println("Reverse of input using While is: "+revnumwhile);
      }
      
      
    public void numDoWhile(int doWhileLoop){
      int revnumdo = 0;
       
      do{
      
         revnumdo = revnumdo * 10;
         revnumdo = revnumdo + doWhileLoop%10;
         doWhileLoop = doWhileLoop/10;
         
      }while( doWhileLoop !=0);
            
      System.out.println("Reverse of input using DoWhile is: "+ revnumdo);

    }
}