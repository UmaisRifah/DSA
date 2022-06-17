import java.util.*;

public class i_saddlePoint {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int[][] a = new int[n][n];
        for(int i =0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                a[i][j] = scr.nextInt();
            }
        }
        scr.close();

        for(int  i = 0;i<a.length;i++){
            int svj = 0;
            for(int j=0;j<a[0].length;j++){
                if(a[i][j]<a[i][svj]){
                    svj=j;
                }
            }
            boolean flag = true;
            for(int k = 0;k<a.length;k++){
                if(a[k][svj]>a[i][svj]){
                    flag = false;
                    break;
                }
            }
            if(flag==true){
                System.out.print(a[i][svj]);
                return;
            }
        }
        System.out.print("Invalid input");
    }
}
