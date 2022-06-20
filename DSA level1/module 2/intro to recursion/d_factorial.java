import java.util.*;

public class d_factorial {
    public static void main(String[] args) throws Exception {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        scr.close();
        int f =factorial(n);
        System.out.print(f);
        
    }

    public static int factorial(int n){
        if(n==1){
            return 1;
        }
        int res = n * factorial(n-1);
        return res;
    }
}