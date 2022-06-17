import java.util.*;

public class f_printCombinations {
    public static void printPermutation(String s){
        int n = s.length();
        int l = factorial(n);
        for(int i = 0;i<l;i++){
            StringBuilder sb = new StringBuilder(s);
            int temp = i;
            for(int j=n;j>0;j--){
                int q = temp/j;
                int r = temp%j;
                System.out.print(sb.charAt(r));
                sb.deleteCharAt(r);
                temp = q;
            }
            System.out.println();
        }
    }
    public static int factorial(int n){
        int res = 1;
        for(int i = 2;i<=n;i++){
            res = res*i;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String s = scr.next();
        scr.close();
        printPermutation(s);
    }
}
