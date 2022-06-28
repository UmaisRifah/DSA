import java.util.*;

public class d_anyBaseToAnyBase {
    public static int baseDecimal(int n , int b){
        int res = 0, count = 0;
        while(n!=0){
            int r = n % 10;
            res = res + r * (int)Math.pow(b,count);
            count++;
            n = n /10;
        }
        return res;
    }
    public static int decimalBase(int n, int b){
        int count=0, res = 0;
        while(n!=0){
            int r = n % b;
            res = res + r * (int)Math.pow(10,count);
            n = n/b;
            count++;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int b1 = scr.nextInt();
        int b2 = scr.nextInt();
        scr.close();
        int b = baseDecimal(n, b1);
        int res = decimalBase(b, b2);
        System.out.print(res);
    }
}
