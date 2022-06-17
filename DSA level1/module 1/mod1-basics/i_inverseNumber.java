import java.util.*;

public class i_inverseNumber {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        scr.close();
        int res = 0, count = 0;
        while(n!=0){
            int last_digit = n % 10;
            count++;
            res = res + count * (int)Math.pow(10,last_digit-1);
            n = n / 10;
        }
        System.out.println(res);

    }
}