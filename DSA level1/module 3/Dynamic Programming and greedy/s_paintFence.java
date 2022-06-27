import java.util.*;

public class s_paintFence {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt(); //n->fences
        int k = scr.nextInt(); //k->colors
        scr.close();
        int same = k;         //(ii)=> 2 same consicutive colors in end
        int diff = k * (k-1);  //(ij)=> 2 different colors in end 
        int total = same + diff;
        for(int i = 3;i<=n;i++){
            int nsame = diff;
            int ndiff = total * (k-1);
            total = nsame + ndiff;

            same = nsame;
            diff = ndiff;
        }
        System.out.print(total);
    }
}