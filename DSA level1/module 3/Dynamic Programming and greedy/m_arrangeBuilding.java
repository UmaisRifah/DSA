import java.util.*;

public class m_arrangeBuilding {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        scr.close();

        long oendb = 1;
        long oends = 1;

        for(int i = 2;i<=n;i++){
            long nendb = oends;
            long nends = oendb + oends;
            
            oends = nends;
            oendb = nendb;
        }

        long total = oends + oendb;
        long tBothSides = total * total;

        System.out.print(tBothSides);
    }
}