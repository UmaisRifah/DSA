import java.util.*;

public class l_primeFactors {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        scr.close();

        for(int div = 2; div * div <= n ; div++){
            while(n%div==0){
                n = n / div;
                System.out.print(div+" ");
            }
        }
        if(n!=1){
            System.out.print(n);
        }
    }
}
