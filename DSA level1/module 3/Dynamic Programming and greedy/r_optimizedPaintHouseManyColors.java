import java.util.*;

public class r_optimizedPaintHouseManyColors {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n_house = scr.nextInt();
        int m_colors = scr.nextInt();

        int[][] a = new int[n_house][m_colors];
        for(int i = 0;i<a.length;i++){
            for(int j = 0;j<a[0].length;j++){
                a[i][j] = scr.nextInt();
            }
        }
        scr.close();

        int[][] dp = new int[a.length][a[0].length];

        int least = Integer.MAX_VALUE;
        int sleast = Integer.MAX_VALUE;
        for(int i =0,j=0;j<a[0].length;j++){
            dp[i][j] = a[i][j];

            if(dp[i][j]<=least){
                sleast = least;
                least = dp[i][j];
            }else if(dp[i][j]<=sleast){
                sleast = dp[i][j];
            }
        }

        for(int i = 1; i<dp.length;i++){
            int nleast = Integer.MAX_VALUE;
            int nsleast = Integer.MAX_VALUE;
            
            for(int j = 0;j<dp[0].length;j++){
                if(least == dp[i-1][j]){
                    dp[i][j] = a[i][j] + sleast;
                }else{
                    dp[i][j] = a[i][j] + least;
                }
                
                if(dp[i][j]<=nleast){
                    nsleast = nleast;
                    nleast = dp[i][j];
                }else if(dp[i][j]<=nsleast){
                    nsleast =dp[i][j];
                }
            }
            least = nleast;
            sleast = nsleast; 
        }
                
        System.out.print(least);
    }
}
