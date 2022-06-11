/*
if n = 5 then output:
*       *       *       *       *
*       *       *       *
*       *       *
*       *
*
-----------------------------------
*/



import java.util.*;

public class pattern2 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        scr.close();
        
        for(int i = n; i > 0; i--){
            for(int j = 1; j <= i ; j++ ){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
