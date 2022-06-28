//this gives index
import java.util.*;

public class r_binarySearch {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        scr.close();
        int low = 0;
        int high = a.length-1;
        while(low<=high){
            int mid = (low + high) / 2;
            if(a[mid]>n){
                high = mid - 1;
            }else if(a[mid]<n){
                low = low + 1;
            }else{
                System.out.print(mid);
                return;
            }
        }
        System.out.print("-1");
    }
}
