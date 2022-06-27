import java.util.*;

public class g_targetSumSubsetsDP {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int[] a = new int[n];
        for(int i = 0;i<a.length;i++){
            a[i] = scr.nextInt();
        }
        int tar = scr.nextInt();
        scr.close();

        boolean[][] dp = new boolean[n+1][tar+1];
        for(int i = 0;i<dp.length;i++){
            for(int j = 0 ; j<dp[0].length; j++){
                if(i==0&&j==0){
                    dp[i][j] = true;
                }else if(i==0){
                    dp[i][j] = false;
                }else if(j==0){
                    dp[i][j] = true;
                }else{
                    if(dp[i-1][j]==true){
                        dp[i][j] = true;
                    }else{
                        int val = a[i-1];
                        if(j>=val){
                            if(dp[i-1][j-val]==true){
                                dp[i][j] = true;
                            }else{
                                dp[i][j] = false;
                            }
                        }
                    }
                }
            }
        }
        System.out.print(dp[a.length][tar]);
    }
}