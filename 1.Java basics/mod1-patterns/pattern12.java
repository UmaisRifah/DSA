/*
n=5,
0
1       1
2       3       5
8       13      21      34
55      89      144     233     377
*/

import java.util.*;

public class pattern12 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        scr.close();
        int a = 0, b= 1,c=a+b;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(a+"\t");
               
                c= a+b;
                a=b;
                b=c;
            }
            System.out.println();
        }
    }
}