import java.util.*;

public class k_unboundedKnapsack {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int[] cost = new int[n];
        int[] weight = new int[n];

        for(int i = 0;i<cost.length;i++){
            cost[i]= scr.nextInt();
        }

        for(int i = 0;i<weight.length;i++){
            weight[i]= scr.nextInt();
        }
        int maxWeigth = scr.nextInt();
        scr.close();

        int[] dp = new int[maxWeigth+1];
        dp[0] = 0;

        for(int i =1;i<dp.length;i++){
            int max =0;
            for(int j = 0;j<n;j++){
                if(weight[j]<=i){
                    int remi = i - weight[j];
                    int remj = dp[remi];
                    int total = remj + cost[j];
                    
                    if(total>max){
                        max = total;
                    }
                }
            }
            dp[i] = max;
        }
        System.out.print(dp[maxWeigth]);

    }
}