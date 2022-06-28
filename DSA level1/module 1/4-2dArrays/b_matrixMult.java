import java.util.*;

public class b_matrixMult {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n1 = scr.nextInt();
        int m1 = scr.nextInt();
        int[][] a1 = new int[n1][m1];
        for(int i = 0;i<a1.length;i++){
            for(int j=0;j<a1[i].length;j++){
                a1[i][j] = scr.nextInt();
            }
        }
        int n2 = scr.nextInt();
        int m2 = scr.nextInt();
        int[][] a2 = new int[n2][m2];
        for(int i = 0;i<a2.length;i++){
            for(int j=0;j<a2[i].length;j++){
                a2[i][j] = scr.nextInt();
            }
        }
        scr.close();
        int[][] p = new int[n1][m2];
        if(m1==n2){
            for(int i = 0;i<p.length;i++){
                for(int j = 0;j<p[i].length;j++){
                    for(int k = 0;k<a2.length;k++){
                       p[i][j] += a1[i][k]*a2[k][j];
                    }
                }             
            }
            for(int i = 0;i<p.length;i++){
                for(int j = 0;j<p[i].length;j++){
                    System.out.print(p[i][j]+" ");
                }  
                System.out.println();           
            }
        }else{
            System.out.print("Invalid input");
        }

    }
}