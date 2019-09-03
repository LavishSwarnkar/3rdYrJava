//6. Biggest among 3 integers
import java.util.*;
class L6{
	public static void main(String args[]){
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter 1st number: ");
		a = sc.nextInt();
		System.out.print("Enter 2nd number: ");
		b = sc.nextInt();
		System.out.print("Enter 3rd number: ");
		c = sc.nextInt();		

		System.out.print(a>b ? (a>c ? a : c) : (b>c ? b : c));
		System.out.print(" is biggest among the 3 numbers.");
	}
}