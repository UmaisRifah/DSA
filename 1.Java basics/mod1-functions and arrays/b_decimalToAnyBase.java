import java.util.*;

public class b_decimalToAnyBase {

    public static int decimalBase(int n, int b){
        int count=0, num = 0;
        while(n!=0){
            int r = n % b;
            num = num + r * (int)Math.pow(10,count);
            n = n/b;
            count++;
        }
        return num;
    }
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int b = scr.nextInt();
        scr.close();
        int res = decimalBase(n, b);
        
        System.out.print(res);
    }
}
