import java.util.*;
// import java.io.*;

public class o_inverseArray  {
    public static void inverse(int[] a, int[] ar){
        for(int i = 0; i < a.length; i++){
            int temp = a[i];
            ar[temp] = i;
        }
    }
    
    
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int[] a = new int[n];
        for(int i = 0 ; i < a.length ; i++){
            a[i] = scr.nextInt();
        }
        scr.close();
        int[] ar = new int[n];
        inverse(a,ar);

        for(int val: ar){
            System.out.print(val+" ");
        }
    }
}
