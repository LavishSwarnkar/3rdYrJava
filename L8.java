//8. First 15 terms of Fibonacci sequence
import java.util.*;
class L8{
	public static void main(String args[]){
		int a=0, b=1, c;
		System.out.print("0, 1, ");
		for(int i=2 ; i<15 ; i++){
			c=a+b;
			System.out.print(c);
			System.out.print(", ");
			a=b;
			b=c;
		}
		
	}
}