import java.util.*;

public class s_ceilAndFloor {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int[] a = new int[n];
        for(int i = 0; i<a.length;i++){
            a[i]=scr.nextInt();
        }
        int d = scr.nextInt();
        scr.close();

        int l = 0;
        int h = a.length - 1;
        int floor=0,ceil=0;
        while(l<=h){
            int m = ( h + l) / 2;
            if(d<a[m]){
                h = m - 1;
                ceil= a[m];
            }else if(d>a[m]){
                l = m + 1;
                floor = a[m];

            }else{
                ceil=floor=a[m];
                break;
            }
        }
        System.out.println(ceil);
        System.out.println(floor);

    }
}
