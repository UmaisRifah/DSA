import java.util.*;

public class f2_rotate90 {
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

        for(int i = 0;i<a.length;i++){
            for(int j = i;j<a[0].length;j++){
                
                    int temp = a[i][j];
                    a[i][j] = a[j][i];
                    a[j][i] = temp;
                
            }
        }
        for(int i = 0;i<a.length;i++){
            for(int j = 0;j<a[0].length/2;j++){
                int temp = a[i][j];
                a[i][j] = a[i][a.length-1-j];
                a[i][a.length-1-j] = temp;
            }
        }
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[0].length; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
