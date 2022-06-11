/*
for n = 7
*       *       *       *       *       *       *
        *                               *
                *               *
                        *
                *       *       *
        *       *       *       *       *
*       *       *       *       *       *       *
--------------------------------------------------
*/
import java.util.*;

public class pattern18 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        scr.close();

        int space = 0;
        int star = n;

        for(int i = 1; i<=n;i++){
            for(int j = 1;j<=space;j++){
                System.out.print("\t");
            }
            for(int j = 1; j<=star;j++){
                if(i>1&&i<=n/2&& j>1 &&j<star){
                    System.out.print("\t");
                }else{
                    System.out.print("*\t");
                }
            }
            System.out.println();
            if(i <= n/2){
                star-=2;
                space++;
            }else{
                star+=2;
                space--;
            }
        }
    }
}
