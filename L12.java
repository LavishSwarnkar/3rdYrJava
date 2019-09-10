/*12.    1
	222
       33333
      4444444 */
import java.util.*;
class L12{
	public static void main(String args[]){
		int h;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter height: ");
		h=sc.nextInt();		
		
		for(int i=1 ; i<=h ; i++){
			for(int j=1 ; j<=(h-i) ; j++)
				System.out.print(" ");
			for(int j=1 ; j<=2*i-1 ; j++)
				System.out.print(i);
			System.out.println("");
		}		
	}
}