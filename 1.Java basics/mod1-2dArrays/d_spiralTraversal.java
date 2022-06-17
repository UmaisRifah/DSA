import java.util.*;

public class d_spiralTraversal {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int m = scr.nextInt();
        int[][] a = new int[n][m];
        for(int i = 0;i<a.length;i++){
            for(int j = 0;j<a[0].length;j++){
                a[i][j] = scr.nextInt();
            }
        }
        int minr = 0,minc=0,maxr=a.length-1,maxc=a[0].length-1;
        scr.close();
        int count =0,total=m*n;
        while(count<total){
            for(int i=minr,j=minc;i<=maxr && count<total;i++){
                System.out.println(a[i][j]);
                count++;
            }
            minc++;
            for(int i=maxr,j = minc;j<=maxc && count<total;j++){
                System.out.println(a[i][j]);
                count++;
            }
            maxr--;
            for(int i = maxr,j=maxc;i>=minr && count<total;i--){
                System.out.println(a[i][j]);
                count++;
            }
            maxc--;
            for(int i =minr,j = maxc;j>=minc && count<total;j--){
                System.out.println(a[i][j]);
                count++;
            }
            minr++;
        }
    }
}
