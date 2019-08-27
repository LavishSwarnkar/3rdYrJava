//1b. WAP to find the results of following expressions:- (a<<2) + (b>>2), (b>0), (a+b*100)/10, a&b
import java.util.*;
class L1b{
	public static void main(String args[]){
		int a, b;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a: ");
		a=sc.nextInt();

		System.out.print("Enter b: ");
		b=sc.nextInt();

		System.out.print("(a<<2)+(b>>2) = ");
		System.out.println((a<<2)+(b>>2));		
	
		System.out.print("b>0 = ");
		System.out.println(b>0);

		System.out.print("(a+b*100)/10 = ");
		System.out.println((a+b*100)/10);	

		System.out.print("a&b = ");
		System.out.println(a&b);	
	}
}