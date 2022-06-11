import java.util.*;

public class f_anyBaseSubtraction {
    public static int subBase(int b,int n1,int n2){
        int carry = 0,count=0 , res = 0;
        if(n2>n1){
            int temp = n1;
            n1 = n2;
            n2 = temp;
        }
        while(n1>0 || n2>0){
            int ld1 = n1 % 10;
            int ld2 = n2 % 10;
            ld1 = ld1 +carry;
            if(ld1 < ld2){
                res = res + (ld1+b-ld2 ) * (int)Math.pow(10, count);
                carry = -1;
            }else{
                res = res + (ld1-ld2 ) * (int)Math.pow(10, count);
                carry = 0;
            }
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
        int res = subBase(b, n1, n2);

        System.out.println(res);

    }
}