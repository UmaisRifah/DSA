import java.util.*;

public class c_stairPathWithVariableJumps {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<arr.length;i++){
            arr[i] =scr.nextInt();
        }
        scr.close();
        int res = countPath(n, arr);
        System.out.println(res);
    }

    public static int countPath(int n,int[] arr){
        int[] dp = new int[n+1];
        dp[n] = 1;
        for(int i = n-1;i>=0;i--){
            for(int j = 1;j<=arr[i]&& i+j<dp.length;j++){
                    dp[i] = dp[i]+dp[i+j];
            }
        }
        return dp[0];
    }
}