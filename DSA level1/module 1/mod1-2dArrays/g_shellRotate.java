// import java.io.*;
import java.util.*;;

public class g_shellRotate {

    public static void main(String[] args) throws Exception {
       Scanner scr = new Scanner(System.in);
       int n = scr.nextInt();
       int m = scr.nextInt();
       int[][] a = new int[n][m];
       for(int i = 0; i<a.length;i++){
        for(int j = 0;j<a[0].length;j++){
            a[i][j]= scr.nextInt();
        }
       }
       int s = scr.nextInt();
       int r = scr.nextInt();

       rotateShell(a,s,r);
       display(a);
       
       scr.close();
        
    }
    public static void rotateShell(int[][] a,int s,int r){
        int[] oned = ShellToOned(a,s);
        rotate(oned,r);
        onedToShell(a,s,oned);
    }

    public static int[] ShellToOned(int[][] a,int s){
        int minr = s-1;
        int maxr = a.length - s;
        int minc = s-1;
        int maxc = a[0].length - s;
        int size = 2 *(maxr - minr +1) + 2 *(maxc - minc +1) -4;
        //left wall + right wall + top wall +bottom wall - 4(repeated corner elements) => 2lw + 2bw -4
        int[] oned = new int[size];

        int index = 0;
        //lw
        for(int i = minr, j = minc;i<=maxr;i++){
            oned[index] = a[i][j];
            index++;
        }
        //bw
        for(int i = maxr,j=minc+1;j<=maxc;j++){
            oned[index] = a[i][j];
            index++;
        }
        //rw
        for(int i = maxr - 1,j=maxc;i>=minr;i--){
            oned[index] = a[i][j];
            index++;
        }
        //tw
        for(int i = minr,j = maxc-1;j>=minc+1;j--){
            oned[index] = a[i][j];
            index++;
        }
        return oned;
    }

    public static void onedToShell(int[][] a,int s,int[] oned){
        int minr = s-1;
        int maxr = a.length - s;
        int minc = s-1;
        int maxc = a[0].length - s;
        

        int index = 0;
        //lw
        for(int i = minr, j = minc;i<=maxr;i++){
            a[i][j] =oned[index];
            index++;
        }
        //bw
        for(int i = maxr,j=minc+1;j<=maxc;j++){
            a[i][j] =oned[index];
            index++;
        }
        //rw
        for(int i = maxr - 1,j=maxc;i>=minr;i--){
            a[i][j] =oned[index];
            index++;
        }
        //tw
        for(int i = minr,j = maxc-1;j>=minc+1;j--){
            a[i][j] =oned[index];
            index++;
        }
        
    }

    public static void rotate(int[] arr,int r){
        r = r % arr.length;
        if(r<0){
            r = r + arr.length;
        }
        reverse(arr, 0, arr.length-r-1);
        reverse(arr, arr.length-r, arr.length-1);
        reverse(arr, 0, arr.length-1);
    }

    public static void reverse(int[] a, int i,int j){
        while(i<j){
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;

            i++;
            j--;
        }
    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
