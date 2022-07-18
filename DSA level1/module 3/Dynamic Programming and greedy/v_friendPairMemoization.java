import java.util.*;

public class v_friendPairMemoization {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        scr.close();
        int res =friends(n,new int[n+1]);
        System.out.print(res);
    }
    public static int friends(int n,int[] qb){
        if(n==0 || n==1){
            return 1;
        }
        if(qb[n]!=0){
            return qb[n];
        }

        int x = friends(n-1,qb);
        int y = friends(n-2,qb);

        int res = x + (n-1)* y;
        qb[n] = res;
        return res;
    }
}