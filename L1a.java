//1a. WAP to calculate area of rectangle
import java.util.*;
class L1a{
	public static void main(String args[]){
		int l, b;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter l: ");
		l=sc.nextInt();

		System.out.print("Enter b: ");
		b=sc.nextInt();

		System.out.print("Area of rectangle is ");
		System.out.println(l*b);
	}
}