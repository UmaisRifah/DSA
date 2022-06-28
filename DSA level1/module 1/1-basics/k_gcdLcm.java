import java.util.*;

public class k_gcdLcm {
    static int Gcd(int x,int y){
        if(y==0){
            return x;
        }else{
            return Gcd(y,x%y);
        }
    }
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int a = scr.nextInt();
        int b = scr.nextInt();
        scr.close();
        int gcd = Gcd(a,b);
        int lcm = ( a * b)/ gcd;
        System.out.println(gcd);
        System.out.println(lcm);
    }
}
