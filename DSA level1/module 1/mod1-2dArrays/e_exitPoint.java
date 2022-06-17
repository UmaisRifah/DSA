import java.util.*;

public class e_exitPoint {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int m = scr.nextInt();
        int[][] a = new int[n][m];
        for(int i = 0;i<a.length;i++){
            for(int j = 0;j<a[0].length;j++){
                a[i][j]=scr.nextInt();
            }
        }
        scr.close();
        int d = 0;
        int i = 0;
        int j = 0;
        while(true){
            d = (d + a[i][j]) % 4;
            if(d==0){
                j++;
            }else if(d==1){
                i++;
            }else if(d==2){
                j--;
            }else if(d==3){
                i--;
            }

            if(i<0){
                i++;
                break;
            }else if(j<0){
                j++;
                break;
            }else if(i==a.length){
                i--;            
                break;

            }else if(j==a[0].length){
                j--;
                break;
            }
        }
        System.out.println(i);
        System.out.println(j);
    }
}
