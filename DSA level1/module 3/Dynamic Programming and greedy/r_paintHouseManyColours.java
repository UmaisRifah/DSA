import java.util.*;

public class r_paintHouseManyColours {
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
        for(int i =0,j=0;j<a[0].length;j++){
            dp[i][j] = a[i][j];
        }

        for(int i = 1; i<dp.length;i++){
            for(int j = 0;j<dp[0].length;j++){
                int min = Integer.MAX_VALUE;
                for(int k = 0;k<dp[0].length;k++){
                    if(k!=j){
                        if(dp[i-1][k]<min){
                            min = dp[i-1][k];
                        }
                    }
                }
                dp[i][j] = a[i][j] + min;
            }
        }

        int min = Integer.MAX_VALUE;
        for(int i = dp.length-1,j=0;j<dp[0].length;j++){
            if(dp[i][j]<min){
                min = dp[i][j];
            }
        }
        System.out.println();
        for(int i = 0;i<dp.length;i++){
            for(int j =0;j<dp[0].length;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.print(min);
    }
}