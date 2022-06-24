import java.util.*;

public class b_printKeypadCombination {
    public static void main(String[] args) throws Exception {
        Scanner scr = new Scanner(System.in);
        String s = scr.next();
        scr.close();
        printKPC(s, "");
    }
    static String[] a = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};    
    public static void printKPC(String str, String asf) {
        if(str.length()==0){
            System.out.println(asf);
            return;
        }
        
        char c = str.charAt(0);
        String x = a[c-'0'];
        String ros = str.substring(1);

        for(int i = 0;i<x.length();i++){
            char ch = x.charAt(i);
            // printKPC(ros, asf+"");
            printKPC(ros, asf+ch);

        }
    }
}