import java.util.*;

public class h_coinCombination {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int[] a = new int[n];
        for(int i = 0; i<a.length;i++){
            a[i]= scr.nextInt();
        }
        int amount = scr.nextInt();
        scr.close();
        int[] dp = new int[amount+1];
        dp[0] = 1;
        for(int i = 0;i<a.length;i++){
            for(int j = a[i]; j<dp.length;j++){
                dp[j] += dp[j-a[i]]; 
            }
        }
        System.out.println(dp[amount]);
    }
}