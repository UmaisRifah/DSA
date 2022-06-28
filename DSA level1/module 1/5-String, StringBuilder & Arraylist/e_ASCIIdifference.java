import java.util.*;

public class e_ASCIIdifference {
    public static String stringDifference(String s){
        StringBuilder sb = new StringBuilder();
        char prev = s.charAt(0);
        sb.append(prev);

        for(int i = 1;i<s.length();i++){
            char ch = s.charAt(i);
            int val = ch-prev;
            sb.append(val);
            sb.append(ch);
            prev = ch;
            
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String s = scr.next();
        String r = stringDifference(s);
        System.out.print(r); 
        scr.close();
    }
}
