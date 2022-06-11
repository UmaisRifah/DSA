import java.util.*;

public class e_anyBaseAddition  {
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
        int b = scr.nextInt();
        int n1 = scr.nextInt();
        int n2 = scr.nextInt();
        scr.close();
        int n_1 = baseDecimal(n1, b);
        int n_2 = baseDecimal(n2, b);

        int res_ = n_1 + n_2;
        int res = decimalBase(res_, b);

        System.out.print(res);
    }
}
