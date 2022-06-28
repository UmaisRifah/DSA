import java.util.*;

public class h_printReverseDigit {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        scr.close();
        while(n != 0){
            int res = n % 10;
            System.out.println(res);
            n = n / 10;
        }
    }
}