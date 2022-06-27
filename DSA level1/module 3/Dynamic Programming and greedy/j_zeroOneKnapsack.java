import java.util.*;

public class j_zeroOneKnapsack {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int[] cost = new int[n];
        for(int i = 0;i<cost.length;i++){
            cost[i] = scr.nextInt();
        }
        int[] weight = new int[n];
        for(int i = 0;i<weight.length;i++){
            weight[i] = scr.nextInt();
        }
        int maxWeigth = scr.nextInt();
        scr.close();

        int[][] dp = new int[n+1][maxWeigth+1];
        
        for(int i = 1;i<dp.length;i++){
            for(int j = 1;j<dp[0].length;j++){
                if(weight[i-1]<=j){
                    int x = cost[i-1] + dp[i-1][j-weight[i-1]];
                    int y = dp[i-1][j];
                    dp[i][j] = Math.max(x, y);
                }else{
                    dp[i][j] = dp[i-1][j];
                }                       
            }
        }
        System.out.println(dp[n][maxWeigth]);
    }
}