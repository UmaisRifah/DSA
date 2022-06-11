import java.util.*;

public class e_addAnyBase {
    public static int addAnyBase(int b, int n1, int n2){
        int carry = 0, res = 0, count = 0,x;
        while(n1>0 || n2 >0||carry>0){
            int ld1 = n1 % 10;
            int ld2 = n2 % 10;
            int sum = ld1 + ld2 + carry;
            if(sum>=b){
                x = sum - b;
                carry = 1;
            }else{
                x = sum;
                carry = 0;
            }
            res = res + x * (int)Math.pow(10, count);
            count++;
            n1 = n1/10;
            n2 = n2/10;

        }
        return res;
    }
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int b = scr.nextInt();
        int n1 = scr.nextInt();
        int n2 = scr.nextInt();
        scr.close();

        int res = addAnyBase(b,n1,n2);
        System.out.print(res); 
    }
}