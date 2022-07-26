import java.util.Scanner;
public class Shapes{
   public static void main(String[] args){
   //System.out.println(Math.PI); <- How to get PI
   
   
   
   Scanner shapes = new Scanner(System.in);
   System.out.println("Enter the radius of your circle");
   double radius = shapes.nextDouble();   
   
   System.out.println("Enter the base of your triangle");
   double base = shapes.nextDouble();
   
   System.out.println("Enter the height of your triangle");
   double height = shapes.nextDouble();
   
   shapes.close();
   
   Shapes myShapes = new Shapes();
   myShapes.circle(radius);
   myShapes.triangle(base, height);
   
   }
   public void circle(double radius){
      
      double area = (radius * radius) * Math.PI;
      
      double circum = radius * 2 * Math.PI;
      
         System.out.println("The area of the circle with a radius of " + radius + " is " + area);
         
         System.out.println("The circumfrence of the circle with a radius of " + radius + " is " + circum);
     }
   
   
   public void triangle(double base, double height){
     
     double triArea = (base * height)/2;
     
     System.out.println("The area of the triangle with a base of " + base + " and a height of " + height + " is " + triArea);
     }
}