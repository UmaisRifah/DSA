import java.util.*;

public class c_removePrime {
    public static boolean isPrime(int n){
        for(int i = 2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        ArrayList<Integer> al= new ArrayList<>();
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        for(int i = 0;i<n;i++){
            al.add(scr.nextInt());
        }
        scr.close();  
        for(int i=al.size()-1;i>=0;i--){
            int val = al.get(i);
            if(isPrime(val)==true){
                al.remove(i);
            }
        }
        System.out.print(al);
    }
}
