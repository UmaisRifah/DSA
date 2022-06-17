/* 
for n = 5;
output pattern:
                                *
                        *       *
                *       *       *
        *       *       *       *
*       *       *       *       *
----------------------------------
*/

import java.util.*;

public class pattern3 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        scr.close();
        
        int star = 1, space = n-1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= space ; j++){
                System.out.print("\t");
            }
            for(int j = 1; j<= star; j++){
                System.out.print("*\t");
            }
            space--;
            star++;
            System.out.println();
        }
    }
}
