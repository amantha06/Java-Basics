public class CompNum{

   double real, img;
	
   CompNum(double r, double i){
	this.real = r;
	this.img = i;
   }
	
   public static CompNum sum(CompNum v1, CompNum v2)
   {

        CompNum sum = new CompNum(0, 0);

        sum.real = v1.real + v2.real;
        sum.img = v1.img + v2.img;
        
        return sum;
    }
    public static void main(String args[]) {
	CompNum v1 = new CompNum(5.5, 4);  // numbers may vary
	CompNum v2 = new CompNum(1.2, 3.5);
        CompNum sum = sum(v1, v2);
        System.out.print("Sum is: "+ sum.real+" + "+ sum.img +"i");
    }
}