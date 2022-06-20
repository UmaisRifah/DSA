import java.util.*;

public class f_powerLogarithmic {
    
    public static void main(String[] args) throws Exception {
        Scanner scr = new Scanner(System.in);
        int x = scr.nextInt();
        int n = scr.nextInt();
        scr.close();
        int res = power(x, n);
        System.out.print(res);
    }
    
    public static int power(int x, int n){   
        if(n==0){
            return 1;
        } 
        int res =power(x, n/2)*power(x, n/2);
        if(n%2==0){
            return res;
        }else{
            return x*res;
        }
    }    
}    