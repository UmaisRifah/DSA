import java.util.*;
// import java.io.*;

public class c_waveTraversal {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n  = scr.nextInt();
        int m = scr.nextInt();
        int[][] a = new int[n][m];
        for(int i = 0; i < a.length; i++){
            for(int j = 0;j<a[i].length;j++){
                a[i][j] = scr.nextInt();
            }
        }
        scr.close();
        int x = 0;
        for(int i = 0;i<a[0].length;i++){
            if(x%2==0){
                for(int j=0;j<a.length;j++){
                    System.out.print(a[j][i]+" ");
                }
            }else{
                for(int j=a.length-1;j>=0;j--){
                    System.out.print(a[j][i]+" ");
                }
            }
            System.out.println();
            x++;
            }
        }
    }

