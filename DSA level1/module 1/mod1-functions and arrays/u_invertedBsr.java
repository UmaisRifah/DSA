import java.util.*;

public class u_invertedBsr {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int[] a = new int[n];
        for(int i = 0;i<a.length;i++){
            a[i] = scr.nextInt();
        } 
        int max = a[0];
        for(int i = 1;i<a.length;i++){
            if(a[i]>max){
                max = a[i];
            }
        }
        for(int i = 1;i<=max;i++){
            for(int j = 0;j<a.length;j++){
                if(a[j]>=i){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
        scr.close();
    }
}
