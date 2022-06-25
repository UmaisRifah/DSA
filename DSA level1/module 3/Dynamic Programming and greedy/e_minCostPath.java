import java.util.*;

public class e_minCostPath {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int m = scr.nextInt();
        int[][] a = new int[n][m];
        for(int i = 0;i<a.length;i++){
            for(int j = 0;j<a[0].length;j++){
                a[i][j]= scr.nextInt();
            }
            
        }
        scr.close();

        int[][] dp = new int[n][m];
        
        for(int r = n-1;r>=0;r--){
            for(int c = m-1;c>=0;c--){
                if(r==n-1&&c==m-1){
                    dp[r][c] = a[r][c];
                }else if(r==n-1){
                    dp[r][c] = a[r][c] + dp[r][c+1];
                }else if(c==m-1){
                    dp[r][c] = a[r][c] + dp[r+1][c];
                }else{
                    dp[r][c] = Math.min(dp[r][c+1],dp[r+1][c]) + a[r][c];
                }
                
            }
        }  
        System.out.print(dp[0][0]);      
    }
}