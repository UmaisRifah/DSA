import java.util.*;

public class a_fibonachi {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        scr.close();
        int fib = fibonachi(n,new int[n+1]);
        System.out.print(fib);
    }
    public static int fibonachi( int n ,int[] qb){
        if(n==0||n==1){
            return n;
        }
        if(qb[n]!=0){
            return qb[n];
        }
        
        int fibnm1 = fibonachi(n-1,qb);
        int fibnm2 = fibonachi(n-2,qb);
        int fib = fibnm1+fibnm2;
        
        qb[n] = fib;
        return fib;
    }
}
