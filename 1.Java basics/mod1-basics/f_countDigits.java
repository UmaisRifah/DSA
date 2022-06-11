import java.util.*;

public class f_countDigits {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        scr.close();
        int count = 0;
        while(n !=0){
            n = n / 10;
            count++;
        }
        System.out.println(count);
    }
}
