import java.util.*;

public class w_partitionIntoSubsets {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int k = scr.nextInt();
        scr.close();

        if(n==0||k==0||n<k){
            System.out.print("0");
            return;
        }

        long[][] dp = new long[k+1][n+1];
        for(int team =1; team<dp.length;team++){
            for(int players= 1;players<dp[0].length;players++){
                if(players<team){
                    dp[team][players] = 0;
                }else if(team ==players){
                    dp[team][players] = 1;
                }else{
                    dp[team][players] = dp[team][players-1] + team * dp[team-1][players-1];
                }
            }
        }
        System.out.print(dp[k][n]);
    }
}