import java.util.*;

public class f_printPermutations {
    public static void main(String[] args) throws Exception {
        Scanner scr = new Scanner(System.in);
        String s = scr.next();
        scr.close();
        printPermutations(s, "");
    }

    public static void printPermutations(String str, String asf) {
        if(str.length()==0){
            System.out.println(asf);
            return;
        }
        
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            String r = str.substring(0, i);
            String l = str.substring(i+1);
            String ros = r+l;
            printPermutations(ros, asf+ch);
        }
    }
}