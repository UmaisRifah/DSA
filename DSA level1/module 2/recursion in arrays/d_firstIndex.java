import java.util.*;

public class d_firstIndex {
    public static void main(String[] args) throws Exception {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int[] a= new int[n];
        for(int i = 0;i<a.length;i++){
            a[i]=scr.nextInt();
        }
        int x = scr.nextInt();
        scr.close();
        int res = firstIndex(a, 0, x);
        System.out.print(res);
    }

    public static int firstIndex(int[] arr, int idx, int x){
        if(idx==arr.length){
            return -1;
        }
        int indexa=firstIndex(arr, idx+1, x);
        if(arr[idx]==x){
            return idx;
        }else{
           return indexa; 
        }
           
    }
}