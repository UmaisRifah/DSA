import java.util.*;

public class l_countBinaryStringsNoConsecutive0 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        scr.close();

        int oend0 = 1;
        int oend1 = 1;

        for(int i = 2;i<=n;i++){
            int nend0 = oend1;
            int nend1 = oend0 + oend1;

            oend0 = nend0;
            oend1 = nend1;
        }

        int total = oend0 + oend1;
        System.out.print(total);
    }
}