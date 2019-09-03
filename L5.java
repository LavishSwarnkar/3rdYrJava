//5. Check even or odd
import java.util.*;
class L5{
	public static void main(String args[]){
		int a;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		a = sc.nextInt();
		
		if(a%2==0)
			System.out.print("It is even number!");
		else
			System.out.print("It is odd number!");
	}
}