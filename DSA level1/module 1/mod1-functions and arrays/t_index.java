import java.util.*;

public class t_index {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int[] a = new int[n];
        for(int i = 0; i< a.length; i++){
            a[i] = scr.nextInt();
        }
        int d = scr.nextInt();
        scr.close();
        int l = 0, h = a.length-1,li=-1;
        while(l<=h){
            int m = (h + l)/2;
            if(d>a[m]){
                l=m+1;
            }else if(d<a[m]){
                h=m-1;
            }else{
                li = m;
                h = m-1;
            }
        }
        l = 0; h = a.length-1;
        int hi=-1;
        while(l<=h){
            int m = (h + l)/2;
            if(d>a[m]){
                l=m+1;
            }else if(d<a[m]){
                h=m-1;
            }else{
                hi = m;
                l = m+1;
            }
        }
        System.out.println(li);
        System.out.println(hi);

    }
}