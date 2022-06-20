import java.util.*;

public class a_displayArray {
    public static void main(String[] args) throws Exception {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int[] a = new int[n];
        for(int i = 0;i<a.length;i++){
            a[i] = scr.nextInt();
        }
        scr.close();
        displayArr(a, n-1);
        
    }

    public static void displayArr(int[] arr, int idx){
        if(idx==-1){
            return;
        }
        displayArr(arr, idx-1);
        System.out.println(arr[idx]);   
    }
}