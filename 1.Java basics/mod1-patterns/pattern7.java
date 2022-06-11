/*
for input n = 5, output pattern:
*
        *
                *
                        *
                                *

-------------------------------------
*/

import java.util.*;

public class pattern7 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        scr.close();
        // int space = 0;
        // for(int i = 0; i<n;i++){
        //     for(int j = 1;j<= space;j++){
        //         System.out.print("\t");
        //     }
        //     System.out.print("*\t");
        //     System.out.println();
        //     space++;
        // }
        for(int i = 0;i<n;i++){
            for(int j = 0; j<n;j++){
                if(i==j){
                    System.out.print("*");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
