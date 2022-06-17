import java.util.*;

public class d_toglerCase {
    public static String toggleCase(String s){
        StringBuilder sb = new StringBuilder(s);
        for(int i = 0;i<sb.length();i++){
            char ch=sb.charAt(i);
            if(ch>='a'&&ch<='z'){
                char upc = (char)('A'+ch-'a');
                sb.setCharAt(i, upc);
            }else{
                char lc = (char)('a'+ch-'A');
                sb.setCharAt(i, lc);
            }
        }
        return sb.toString();

    }
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String s = scr.next();
        scr.close();
        
        System.out.print(toggleCase(s));
    }
}
