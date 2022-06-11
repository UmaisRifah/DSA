import java.util.*;

public class g_printEachDigit  {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        scr.close();
        int temp = n, nod = 0;
        while(temp != 0){
            temp = temp / 10;
            nod++;
        }
        int div = (int)Math.pow(10,nod-1);
        while(div != 0){
            int res = n / div;
            System.out.println(res);
            n = n % div;
            div = div / 10;
        }
    }
}