import java.util.*;

public class j_rotateNumber {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int k = scr.nextInt();
        scr.close();
        int nod = 0, temp=n, res = 0;
        while(temp!=0){
            temp = temp /10;
            nod++;
        }
        if(Math.abs(k)==nod || k==0){
            res = n;
        }else{
            if(k<0){
                k = k + nod;
            }
            if(k>nod){
                int x = k/nod;
                k = k - x*nod;
                
            }if(k==nod){
                res = n;
            }else{
                int last = n % (int)Math.pow(10,k);
                n = n / (int)Math.pow(10,k);
                res = last * (int)Math.pow(10,nod-k) + n;
            }
        }
        System.out.println(res);
        
    }
}