import java.util.*;

public class e_fibonacci {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        scr.close();
        int a = 0, b = 1;
        System.out.println(a+"\n"+b);
        for(int i = 3;i<= n;i++){
            int c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }
}