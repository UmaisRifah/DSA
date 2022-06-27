import java.util.*;

public class q_paintHouse {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int[] r = new int[n];
        int[] b = new int[n];
        int[] g = new int[n];
        for(int i = 0;i<n;i++){
            r[i] = scr.nextInt();
            b[i] = scr.nextInt();
            g[i] = scr.nextInt();
        }
        scr.close();
        int rr = r[0];
        int bb = b[0];
        int gg = g[0];

        for(int i = 1;i<n;i++){
            int nrr = r[i] + Math.min(bb, gg);
            int nbb = b[i] + Math.min(rr, gg);
            int ngg = g[i] + Math.min(bb, rr);
            
            rr = nrr;
            bb = nbb;
            gg = ngg;
        }
        
        int res = Math.min(rr, Math.min(bb, gg));

        System.out.println(res);
    }
}