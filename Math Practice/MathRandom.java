import java.util.Random;
public class MathRandom{
   public static void main(String[] args){
   
   try{
   
   
   
      Random rand = new Random();   
      int i = rand.nextInt();
      float f = rand.nextFloat();
      double d = rand.nextDouble();
      long l = rand.nextLong();
      String s = "";
      int i1 = Integer.parseInt(s);
      
      System.out.println(i + "is "+  f + d + l);
     }catch(Exception e){
     System.out.println(e);
     throw e;
     }
     finally{
     System.out.println("enter finally");
     }
   } 
}
