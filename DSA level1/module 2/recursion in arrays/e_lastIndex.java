import java.util.*;

public class e_lastIndex {
    public static void main(String[] args) throws Exception {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int[] a= new int[n];
        for(int i = 0;i<a.length;i++){
            a[i]=scr.nextInt();
        }
        int x = scr.nextInt();
        scr.close();
        int res = lastIndex(a, n-1, x);
        System.out.print(res);
    }

    public static int lastIndex(int[] arr, int idx, int x){
        if(idx==-1){
            return -1;
        }
        int lastIndex = lastIndex(arr, idx-1, x);
        if(arr[idx]==x){
            return idx;
        }else{
            return lastIndex;
        }
        
    }

}