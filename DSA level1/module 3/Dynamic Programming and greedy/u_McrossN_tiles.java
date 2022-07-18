import java.util.*;

public class u_McrossN_tiles {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int m = scr.nextInt();
        scr.close();
        int[] dp = new int[n+1];
        for(int i = 1; i<dp.length;i++){
            if(i<m){
                dp[i] = 1;
            }else if(i==m){
                dp[i] = 2;
            }else{
               dp[i] = dp[i-1] + dp[i-m]; 
            }
        }
        System.out.print(dp[n]);
    }
}