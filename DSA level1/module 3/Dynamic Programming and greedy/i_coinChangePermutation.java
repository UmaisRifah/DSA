import java.util.*;

public class i_coinChangePermutation {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int[] a = new int[n];
        for(int i = 0;i<a.length;i++){
            a[i]=scr.nextInt();
        }
        int amt = scr.nextInt();
        scr.close();

        int[] dp = new int[amt+1];
        dp[0] = 1;
        for(int amount = 1;amount<dp.length;amount++){
            for(int coin = 0;coin<a.length;coin++){
                if(a[coin]<=amount){
                    dp[amount] += dp[amount-a[coin]];
                }
                
            }
        }
        System.out.println(dp[amt]);
    }
}