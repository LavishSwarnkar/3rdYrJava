//9. Armstrong numbers upto 1000
import java.util.*;
class L9{
	public static void main(String args[]){
		int x, r;
		System.out.print("Armstrong no. upto 1000 are : ");
		for(int i=0 ; i<=1000 ; i++){
			x=i;
			int sum=0;
			while(x>0){
				r=x%10;
				sum+=r*r*r;
				x/=10;
			}
			if(i==sum){
				System.out.print(i);
				System.out.print(", ");
			}
		}
		
	}
}