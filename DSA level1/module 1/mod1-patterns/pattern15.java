/*
for n =5
                1
        2       3       2
3       4       5       4       3
        2       3       2
                1
*/

import java.util.*;

public class pattern15 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        scr.close();

        int space=n/2;
        int star = 1;
        int res = 1;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=space;j++){
                System.out.print("\t");  
            }
            int var = res;
            for(int j = 1;j<=star;j++){
                System.out.print(var +"\t");
                if(j<=star/2){
                    var++;
                }else{
                    var--;
                }
            }
            System.out.println();
            if(i<=n/2){
                space--;
                star +=2;
                res++;
            }else{
                space++;
                star -=2;
                res--;
            }
        }
    }
}
