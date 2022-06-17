import java.util.*;

public class  a_digitFrequency {
    public static int digitFrequency(int n,int d){
        int count = 0;
        while(n!=0){
            int digit = n%10;
            if(digit==d){
                count++;
            }
            n = n/10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int d = scr.nextInt();
        scr.close();
        int res = digitFrequency(n,d);
        System.out.print(res);
    }
}