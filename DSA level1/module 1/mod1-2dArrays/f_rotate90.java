import java.util.*;

public class f_rotate90 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int[][] a = new int[n][n];
        for(int i= 0;i<a.length;i++){
            for(int j = 0;j<a[0].length;j++){
                a[i][j] = scr.nextInt();
            }
        }
        scr.close();
        

        for(int j = 0;j<a.length;j++){
            for(int i = a[0].length-1;i>=0;i--){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
