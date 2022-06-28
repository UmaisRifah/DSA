import java.util.*;

public class p_subsetArray {
    public static void subset(int[] a){
        int limit = (int)Math.pow(2, a.length);
        for(int i = 0;i<limit;i++){
            int temp = i;
            String set = "";
            for(int j = a.length-1;j>=0;j--){
                int r = temp % 2;
                temp = temp / 2;
                if(r==0){
                    set = "-\t" + set;
                }else{
                    set = a[j] + "\t" + set;
                }
            }
            System.out.println(set);
        }
        
    }
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int[] a = new int[n];
        for(int i = 0;i<a.length;i++){
            a[i] = scr.nextInt();
        }
        scr.close();
        subset(a);
    }
}
