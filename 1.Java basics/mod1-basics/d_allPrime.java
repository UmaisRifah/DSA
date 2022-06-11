import java.util.*;

public class d_allPrime {
    static boolean isPrime(int n){
        int res = 1;
        if(n==1){
            res = 0;
        }else{
            for(int i=2;i*i<=n;i++){
                if(n%i==0){
                    res = 0;
                }
            }
        }if(res==0){
            return false;
        }else{
            return true;
        }
    }
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int low = scr.nextInt();
        int high = scr.nextInt();
        scr.close();
        for(int i = low;i<=high;i++){
            if (isPrime(i)){
                System.out.println(i);
            }
        }
        
        
    }
}