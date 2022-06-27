import java.util.*;

public class p_maxSumNonAdjescent {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int[] a = new int[n];
        for(int i= 0;i<a.length;i++){
            a[i] = scr.nextInt();
        }
        scr.close();
        int include = a[0];
        int exclude = 0;

        for(int i = 1;i<a.length;i++){
            int ninclude = exclude + a[i];
            int nexclude = Math.max(include, exclude);
            
            include = ninclude;
            exclude = nexclude;
        }

        int ans = Math.max(include, exclude);
        System.out.print(ans);
    }
}