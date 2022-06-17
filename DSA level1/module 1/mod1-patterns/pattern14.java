/* table of x till 10*/
import java.util.*;

public class pattern14 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int x = scr.nextInt();
        scr.close();

        for(int i = 1;i<=10;i++){
            System.out.print(x+" * "+i+" = ");
            int res = x*i;
            System.out.print(res);
            System.out.println();
        }
    }
}
