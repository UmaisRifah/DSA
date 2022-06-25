import java.util.*;

public class b_climbStairs {
    public static void main(String[] args) throws Exception {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        scr.close();
        int count = Stairs(n,new int[n+1]);
        int c2 = countPathTab(n);
        System.out.println(count);
        System.out.println(c2);
    }

    public static int Stairs(int n, int[] qb){
        if(n<0){
            return 0;
        }else if(n==0){
            
            return 1;
        }
        if(qb[n]!=0){
            return qb[n];
        }

        int nm1 = Stairs(n-1,qb);
        int nm2 = Stairs(n-2,qb);
        int nm3 = Stairs(n-3,qb);
        int res = nm1+nm2+nm3;

        qb[n] = res;
        return res;
    }

    public static int countPathTab(int n){
        int[] dp = new int[n+1];
        dp[0]=1;
        for(int i = 1;i<=n;i++){
            if(i==1){
                dp[i]=dp[i-1];
            }else if(i==2){
                dp[i] = dp[i-1] + dp[i-2];
            }else{
                dp[i] = dp[i-1]+dp[i-2]+dp[i-3];
            }
        }
        return dp[n];
    }
}