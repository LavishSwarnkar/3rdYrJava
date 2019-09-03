//4. Biggest among 3 integers
import java.util.*;
class L4{
	public static void main(String args[]){
		int a,b;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter 1st number: ");
		a = sc.nextInt();
		System.out.print("Enter 2nd number: ");
		b = sc.nextInt();		

		if(a==b)
			System.out.print("Both are equal!");
		else{
			if(a>b)
				System.out.print(a);
			else
				System.out.print(b);
			System.out.print(" is biggest.");
		}
	}
}