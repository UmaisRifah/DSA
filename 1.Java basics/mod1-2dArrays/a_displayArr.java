import java.util.*;
// import java.io.*;

public class a_displayArr{
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int m = scr.nextInt();
        int[][] arr = new int[n][m];
        for(int i =0 ; i<arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                arr[i][j] = scr.nextInt();
            }
        }
        for(int i =0 ; i<arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        scr.close();
    }
}