/*
for n = 5, pattern:
1
2       3
4       5       6
7       8       9       10
11      12      13      14      15
*/

import java.util.*;

public class pattern11 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        scr.close();
        int var = 1;
        for(int i = 1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(var +"\t");
                var++;
            }
            System.out.println();
            
        }
    }
}
