/* 
if n = 5; output pattern is:
                *
        *       *       *
*       *       *       *       *
        *       *       *
                *

*/

import java.util.*;

public class pattern5 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        scr.close();

        int spc=n/2, str=1;
        for(int i = 0;i<n;i++){
            for(int j = 1; j<=spc;j++){
                System.out.print("\t");
            }
            for(int j = 1;j <= str;j++){
                System.out.print("*\t");
            }
            System.out.println();
            if(i<n/2){
                spc--;
                str += 2;
            }else{
                spc++;
                str -= 2;
            }
        }
    }
}
