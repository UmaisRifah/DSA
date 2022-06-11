/*
if n = 5
*                               *
*                               *
*               *               *
*       *               *       *
*                               *
--------------------------------------
*/

import java.util.*;

public class pattern20 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        scr.close();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if(i<=n/2){
                    if(j==1||j==n){
                        System.out.print("*\t");
                    }else {
                        System.out.print("\t");
                    }
                }
                if(i>=n/2+1){
                    if(j==1||j==n||j==i || i+j==n+1){
                        System.out.print("*\t");
                    }else{
                        System.out.print("\t");
                    }
                }
            }
            System.out.println();
        }
    }
}
