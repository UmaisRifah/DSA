import java.util.*;

public class q_subArray  {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int[] a = new int[n];
        for(int i=0;i<a.length;i++){
            a[i]= scr.nextInt();
        }
        scr.close();

        for(int i = 0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                for(int k = i;k<= j;k++){
                    System.out.print(a[k]+" ");
                }
                System.out.println();
            }
        }
    }
}