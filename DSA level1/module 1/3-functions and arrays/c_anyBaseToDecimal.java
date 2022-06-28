import java.util.*;

public class c_anyBaseToDecimal {
    public static int decimal(int n , int b){
        int res = 0, count = 0;
        while(n!=0){
            int r = n % 10;
            res = res + r * (int)Math.pow(b,count);
            count++;
            n = n /10;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int b = scr.nextInt();
        scr.close();

        int res = decimal(n, b);
        System.out.print(res);

    }
}
