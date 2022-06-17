/*
if n = 5, output pattern:
                        *
                *               *
        *                               *
*                                               *
        *                               *
                *               *
                        *
---------------------------------------------------- 
*/

import java.util.*;

public class pattern10 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        scr.close();

        int space = n/2;
        int inspace = -1;
        for(int i = 1; i<= n ; i++){
            for(int j = 1; j<= space;j++){
                System.out.print("\t");
            }
            System.out.print("*\t");
            
            for(int j = 1; j<=inspace;j++){
                System.out.print("\t");
            }
            if(i>1 && i<n){
                System.out.print("*\t");
            }
            
            if(i<= n/2){
                inspace+=2;
                space--;
            }else{
                inspace-=2;
                space++;
            }
            
            System.out.println();
        }
    }
}
