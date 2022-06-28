import java.util.*;

public class k_sumOf2arrays  {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n1 = scr.nextInt();
        int[] arr1 = new int[n1];
        for(int i = 0 ; i < arr1.length ; i++){
            arr1[i]=scr.nextInt();
        }
        int n2 = scr.nextInt();
        int[] arr2 = new int[n2];
        for(int i = 0 ; i < arr2.length ; i++){
            arr2[i]=scr.nextInt();
        }
        scr.close();

        int[] sum = new int[n1>n2? n1:n2];

        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = sum.length - 1;
        int carry = 0;
        while(k>=0){
            int d = carry;

            if(i>=0){
                d += arr1[i];
            }

            if(j>=0){
                d += arr2[j];
            }

            carry = d/10;
            sum[k] = d%10;

            i--;
            j--;
            k--;
        }
        if(carry!=0){
            System.out.println(carry);
        }
        for(int val: sum){
            System.out.println(val);
        }

    }
}
