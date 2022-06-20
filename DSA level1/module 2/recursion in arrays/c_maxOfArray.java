import java.util.*;

public class c_maxOfArray {
    public static void main(String[] args) throws Exception {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int[] a = new int[n];
        for(int i= 0;i<a.length;i++){
            a[i]=scr.nextInt();
        }
        scr.close();
        int res =maxOfArray(a, n-1);
        System.out.print(res);
    }

    public static int maxOfArray(int[] arr, int idx){
        if(idx==-1){
            return 0;
        }
        int maxa = maxOfArray(arr, idx-1);
        if(arr[idx]>maxa){
            maxa = arr[idx];

        }
        return maxa;
    }
}