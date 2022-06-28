import java.util.*;

public class h_diagonalTraversal {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int[][] a = new int[n][n];
        for(int i = 0; i <a.length;i++){
            for(int j =0;j<a[0].length;j++ ){
                a[i][j] = scr.nextInt();
            }
        }
        scr.close();
        
        //using while loop:
        // int idx=0;
        // while(idx < a.length){
        //     for(int i =0;i<a.length;i++){
        //         for(int j =0;j<a[0].length;j++){
        //             if(i+idx==j){
        //                 System.out.println(a[i][j]);
        //             }
        //         }
        //     }
        //     idx++;
        // }

        //using for loop:

        for(int g = 0;g<a.length;g++){
            for(int i=0,j=g;j<a.length;i++,j++){
                System.out.println(a[i][j]);
            }
        }
        
        
    }
}