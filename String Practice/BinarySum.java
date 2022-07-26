import java.util.Scanner;
public class BinarySum {
   public static void main(String[] args){

	long v1, v2;
	int i = 0, carry = 0;


	int[] sum = new int[10];


	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter binary number ");
	v1 = scanner.nextLong();

	System.out.print("Enter binary number ");
	v2 = scanner.nextLong();

	scanner.close();
	while (v1 != 0 || v2 != 0) 
	{
		sum[i++] = (int)((v1 % 10 + v2 % 10 + carry) % 2);
		carry = (int)((v1 % 10 + v2 % 10 + carry) / 2);
		v1 = v1 / 10;
		v2 = v2 / 10;
	
   }
	if (carry != 0) {
		sum[i++] = carry;
	}
	--i;
	System.out.print("Output ");
	while (i >= 0) {
		System.out.print(sum[i--]);
	}
	System.out.print("\n");  
   }
}