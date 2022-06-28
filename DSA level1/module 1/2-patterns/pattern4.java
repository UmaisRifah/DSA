/* 
for n = 5;the output pattern is:
*       *       *       *       *
        *       *       *       *
                *       *       *
                        *       *
                                *
----------------------------------
*/
import java.util.*;

public class pattern4 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        scr.close();
        
        int str = n, space = 0;
        
        for(int i=n ; i>0 ; i--){
            for(int j = 1; j <=space; j++){
                System.out.print("\t");
            }
            for(int j = 1; j <=str ; j++){
                System.out.print("*\t");
            }
            System.out.println();
            str--;
            space++;
        }
    }
}