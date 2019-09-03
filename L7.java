//7. Biggest among 3 integers
import java.util.*;
class L7{
	public static void main(String args[]){
		int x, sum=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		x = sc.nextInt();		
		
		while(x>0){
			sum+=x%10;
			x/=10;
		}
		System.out.print("Sum of all digits is ");
		System.out.print(sum);
		
	}
}