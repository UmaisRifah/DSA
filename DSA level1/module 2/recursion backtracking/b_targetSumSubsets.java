import java.util.*;

public class b_targetSumSubsets {
    public static void main(String[] args) throws Exception {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<arr.length;i++){
            arr[i] = scr.nextInt();
        }
        int tar = scr.nextInt();
        scr.close();

        printTargetSumSubsets(arr, 0, "", 0, tar);
    }

    // set is the subset
    // sos is sum of subset
    // tar is target
    public static void printTargetSumSubsets(int[] arr, int idx, String set, int sos, int tar) {
        if(idx==arr.length){
           if(sos==tar){
                System.out.println(set+".");
            }    
            return;
        }
        printTargetSumSubsets(arr, idx+1, set+arr[idx]+",", sos+arr[idx], tar);
        printTargetSumSubsets(arr, idx+1, set, sos, tar);
    }
}