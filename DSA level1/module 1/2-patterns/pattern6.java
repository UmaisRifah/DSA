/*
for n = 5; the output pattern is:
*       *       *               *       *       *
*       *                               *       *
*                                               *
*       *                               *       *
*       *       *               *       *       *
--------------------------------------------------
*/

import java.util.*;

public class pattern6 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        scr.close();
        
        int space = 1, star = n/2+1;
        for(int i = 0; i < n ; i++){
            for(int j = 1;j<=star;j++){
                System.out.print("*\t");
            }
            for(int j = 1;j<=space;j++){
                System.out.print("\t");
            }
            for(int j = 1;j<=star;j++){
                System.out.print("*\t");
            }
            System.out.println();
            if(i< n/2){
                space +=2;
                star--;
            }else{
                space -=2;
                star++;
            }
            

        }
    }
}
