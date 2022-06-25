import java.util.*;

public class f_MaxGoldDig {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int m = scr.nextInt();
        int[][] a = new int[n][m];
        for(int i = 0;i<a.length;i++){
            for(int j = 0; j<a[0].length;j++){
                a[i][j] = scr.nextInt();
            }
        }
        scr.close();

        int[][] dp = new int[n][m];
        for(int c = a[0].length-1;c>=0;c--){
            for(int r = 0;r<a.length;r++){
                if(c==a[0].length-1){
                    dp[r][c] = a[r][c];
                }else if(r==0){
                    dp[r][c] = Math.max(dp[r][c+1], dp[r+1][c+1])+a[r][c];
                }else if(r==a.length-1){
                    dp[r][c] = Math.max(dp[r][c+1], dp[r-1][c+1])+a[r][c];
                }else{
                    dp[r][c] = Math.max(Math.max(dp[r][c+1], dp[r+1][c+1]) , dp[r-1][c+1])+a[r][c]; 
                }
            }
        }
        int max = dp[0][0];
        for(int r = 1;r<dp.length;r++){
            if(dp[r][0] >max){
                max = dp[r][0];
            }
        }
        
        System.out.print(max);
    }
}