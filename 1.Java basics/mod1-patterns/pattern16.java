/*
for n = 5
1                                                               1
1       2                                               2       1
1       2       3                               3       2       1
1       2       3       4               4       3       2       1
1       2       3       4       5       4       3       2       1
*/

import java.util.*;

public class pattern16  {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        scr.close();

        int space = 2*n-3;
        int star = 1;
        int var = 1;
        for(int i = 1; i<=n ; i++){
            for(int j = 1;j<=star;j++){
                System.out.print(var +"\t");
                var++;
            }
            
            for(int j = 1; j<=space;j++){
                System.out.print("\t");
            }if(i<n){
                for(int j=1;j<=star;j++){
                    var--;
                    System.out.print(var+"\t");
                    
                } 
            }else{
                var=var-1;
                for(int j=1;j<star;j++){
                    var--;
                    System.out.print(var+"\t");
                }
            }
            
            System.out.println();
            space -=2;
            star++;
        }
    }
}
