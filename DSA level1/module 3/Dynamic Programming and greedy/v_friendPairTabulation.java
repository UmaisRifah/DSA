import java.util.*;

public class v_friendPairTabulation {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        scr.close();

        int[] dp = new int[n+1];
        dp[1]=1;
        dp[2] = 2;
        for(int i = 3; i<dp.length;i++){
            dp[i] = dp[i-1] + (i-1)* dp[i-2];
        }
        System.out.print(dp[n]);
    }
}