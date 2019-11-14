/*10.   *
	**
	***
	**** */
import java.util.*;
class L10a{
	public static void main(String args[]){
		int h;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter height: ");
		h=sc.nextInt();		
		
		for(int i=1 ; i<=h ; i++){
			for(int j=1 ; j<=i ; j++)
				System.out.print("*");
			System.out.println("");
		}		
	}
}