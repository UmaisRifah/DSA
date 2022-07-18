import java.util.*;

public class x_stock1transaction {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();

        int[] a = new int[n];
        for(int i = 0;i<a.length;i++){
            a[i] = scr.nextInt();
        }
        scr.close();

        int least = a[0];
        int maxP = 0;
        int p = 0;

        for(int i =0;i<a.length;i++){
            if(a[i]<least){
                least = a[i];
            }
            p = a[i] - least;
            if(p>maxP){
                maxP = p;
            }
        }
        System.out.print(maxP);
    }
}