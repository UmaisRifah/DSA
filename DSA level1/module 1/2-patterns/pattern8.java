/*
for n = 5, the output pattern is:
                                *
                        *
                *
        *
*
-----------------------------------
*/
import java.util.*;

public class pattern8 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        scr.close();

        // int space=n-1;
        // for(int i = 0;i<n;i++){
        //     for(int j = 1; j<= space;j++){
        //         System.out.print("\t");
        //     }
        //     System.out.print("*");
        //     System.out.println();
        //     space--;
        // }

        for(int i = 1;i<=n;i++){
            for(int j = 1; j<=n;j++){
                if(i+j==n+1){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
