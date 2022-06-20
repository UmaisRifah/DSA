import java.util.*;

public class e_powerLinear {
    public static void main(String[] args) throws Exception {
        Scanner scr = new Scanner(System.in);
        int x = scr.nextInt();
        int n = scr.nextInt();
        scr.close();
        int res =power(x, n);
        System.out.print(res);
    }

    public static int power(int x, int n){
        if(n==0){
            return 1;
        }
        int res = x * power(x, n-1);
        return res;
    }
}