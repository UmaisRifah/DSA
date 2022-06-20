import java.util.*;

public class b_displayReverseArray {
    public static void main(String[] args) throws Exception {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int[] a = new int[n];
        for(int i = 0;i<a.length;i++){
            a[i]=scr.nextInt();
        }
        scr.close();
        displayArrReverse(a, n-1);
    }

    public static void displayArrReverse(int[] arr, int idx) {
        if(idx==-1){
            return;
        }
        System.out.println(arr[idx]);
        displayArrReverse(arr, idx-1);
    }
}
