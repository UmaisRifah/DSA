import java.util.*;

public class o_AplussBplussCplussSubsequences{
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String str = scr.next();
        scr.close();

        int a =  0;
        int ab = 0;
        int abc = 0;

        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == 'a'){
                a = 2 * a + 1;
            }else if(ch == 'b'){
                ab = 2 * ab + a;
            }else{
                abc = 2 * abc + ab;
            }
        }
        System.out.print(abc);
    }
}