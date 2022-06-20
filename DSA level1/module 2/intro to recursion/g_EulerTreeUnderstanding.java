import java.util.*;

public class g_EulerTreeUnderstanding {
    public static void main(String[] args) throws Exception {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        scr.close();
        pzz(n);
        
    }

    public static void pzz(int n){
        if(n==0){
            return ;
        }
        System.out.print(n);
        pzz(n-1);
        System.out.print(n);
        pzz(n-1);
        System.out.print(n);
    }
} 
