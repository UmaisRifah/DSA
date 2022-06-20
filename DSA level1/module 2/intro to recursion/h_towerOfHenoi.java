import java.util.*;

public class h_towerOfHenoi {
    public static void main(String[] args) throws Exception {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int a = scr.nextInt();
        int b = scr.nextInt();
        int c = scr.nextInt();
        scr.close();
        toh(n, a, b, c);
    }

    public static void toh(int n, int t1id, int t2id, int t3id){
        if(n==0){
            return;
        }
        toh(n-1, t1id, t3id, t2id);
        System.out.println(n+"["+t1id+" -> "+t2id+"]");
        toh(n-1, t3id, t2id, t1id);

    }
}