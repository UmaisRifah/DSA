import java.util.*;

public class j_searchSorted2darray {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int[][] a = new int[n][n];
        for(int i =0;i<a.length;i++){
            for(int j = 0;j<a[0].length;j++){
                a[i][j]=scr.nextInt();
            }
        }
        int d = scr.nextInt();
        scr.close();
        int i=0;
        int j=a[0].length-1;
        while(i<a.length&&j>=0){
            if(a[i][j]==d){
                System.out.println(i);
                System.out.println(j);
                return;
            }else if(a[i][j]>d){
                j--;
            }else{
                i++;
            }
        }
        System.out.print("Not Found");

    }
}
