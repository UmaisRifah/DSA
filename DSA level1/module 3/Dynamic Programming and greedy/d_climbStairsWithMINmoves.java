import java.util.*;

public class d_climbStairsWithMINmoves {
    public static void main(String[] args) throws Exception {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i]= scr.nextInt();
        }
        scr.close();
        int res = climb(n, arr);
        System.out.print(res);
    }

    public static int climb(int n, int[] arr){

        Integer[] dp = new Integer[n+1];
        dp[n] = 0;
        for(int i = n-1;i>=0;i--){
            int min = Integer.MAX_VALUE;
            for(int j = 1;j<=arr[i]&&i+j<dp.length;j++){
                if(dp[i+j]!=null){
                    min = Math.min(min, dp[i+j]);
                }
            }
            if(min!=Integer.MAX_VALUE){
                dp[i] = min + 1;
            }
        }
        return dp[0];
    }
}