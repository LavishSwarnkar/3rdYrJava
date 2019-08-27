//1c. WAP to print individual digitd of a 3 digit number
import java.util.*;
class L1c{
	public static void main(String args[]){
		int a, b=0;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a: ");
		a=sc.nextInt();

		System.out.println("Digits are:-");	
		
		while(a>0){
			b = (b*10) + (a%10);
			a/=10;
		}
		
		while(b>0){
			System.out.println(b%10);
			b/=10;
		}
	}
}