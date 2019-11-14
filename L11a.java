/*11.    *
		***
       *****
      ******* */
import java.util.*;
class L11a{
	public static void main(String args[]){
		int h;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter height: ");
		h=sc.nextInt();		
		
		for(int i=0 ; i<h ; i++){
			for(int j=1 ; j<=(h-i-1) ; j++)
				System.out.print(" ");
			for(int j=1 ; j<=(2*i+1) ; j++)
				System.out.print("*");
			System.out.println("");
		}		
	}
}