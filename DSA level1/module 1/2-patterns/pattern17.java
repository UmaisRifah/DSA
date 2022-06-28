/*
for n = 5
                *
                *       *
*       *       *       *       *
                *       *
                *
*/
import java.util.*;

public class pattern17 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        scr.close();
        int star = 1;
        int space = n/2;
        for(int i = 1;i<=n;i++){
            
            for(int j = 1; j<=space;j++){
                if(i==n/2+1){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            for(int j = 1; j<=star;j++){
                System.out.print("*\t");
            }
            System.out.println();
            if(i<=n/2){
                star++;
            }else{
                star--;
            }
        }
    }
}
