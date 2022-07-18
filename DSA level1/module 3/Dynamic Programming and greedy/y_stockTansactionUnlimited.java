import java.util.*;

public class y_stockTansactionUnlimited {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        
        int[] a = new int[n];
        for(int i = 0;i<a.length;i++){
            a[i] = scr.nextInt();
        }
        scr.close();

        int least = a[0];
        int max = 0;
        int p = 0;
        int res = 0;
        for(int i = 1;i<a.length;i++){
            if(a[i]<a[i-1]){
                res = res + max;
                max = 0;
                least = a[i];
            }
            p = a[i] - least;
            if(max<p){
                max = p;
                if(i == a.length-1){
                    res = res +max;
                }
            }
        }
        System.out.print(res);
    }
}