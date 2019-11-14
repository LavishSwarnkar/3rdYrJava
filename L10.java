//Smallest & Largest element in array
import java.util.*;
class L10{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size:");
        int n = sc.nextInt(), min=0, max=0;
        int a[] = new int[n];
        for(int i=0 ; i<n ; i++){
            System.out.print("Enter a[" + i + "]:");
            a[i] = sc.nextInt();
            if(a[i]<a[min])
                min=i;
            if(a[i]>a[max])
                max=i;
        }
        System.out.println("Smallest element = " + a[min]);
        System.out.println("Largest element = " + a[max]);
    }
}