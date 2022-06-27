import java.util.*;

public class t_2crossN_tiles {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        scr.close();
        int res= tile(n, 0);
        System.out.print(res);
    }

    public static int tile(int n,int count){
        if(n<0){
            return 0;
        }else if(n==0){
            // count ++;
            return n; 
        }
        tile(n-1,count);
        tile(n-2,count);
        return count;
    }
}