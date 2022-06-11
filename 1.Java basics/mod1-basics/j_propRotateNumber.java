import java.util.*;

public class j_propRotateNumber {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int k = scr.nextInt();
        scr.close();

        int temp = n, nod = 0;
        while(temp!=0){
            temp = temp / 10;
            nod++;
        }

        k = k % nod;
        if(k<0){
            k = k + nod;
        }

        int div = 1 ,mult = 1;
        for(int i = 1; i<=k;i++){
            if(i<=k){
                div = div * 10;
            }else{
                mult = mult * 10;
            }
        }

        int q = n / div;
        int r = n % div;
        int res = r * mult + q;
        System.out.println(res);
    }
}
