import java.util.*;

public class g_printEncoding {
    public static void main(String[] args) throws Exception {
        Scanner scr = new Scanner(System.in);
        String s = scr.next();
        scr.close();
        printEncodings(s,"");
    }
    
    public static void printEncodings(String str,String ans) {
        if(str.length()==0){
            System.out.println(ans);
            return;
        }else if(str.length()==1){
            char ch = str.charAt(0);
            if(ch=='0'){
                return;
            }else{
                int chv = ch -'0';
                char code = (char)('a' + chv -1);
                System.out.println(ans+code);
            }
        }else {
            char ch = str.charAt(0);
            String ros = str.substring(1);

            if(ch=='0'){
                return;
            }else{
                int chv = ch -'0';
                char code = (char)('a' + chv -1);
                printEncodings(ros, ans+code);
            }

            String ch12 = str.substring(0,2);
            String roq = str.substring(2);
            int chv = Integer.parseInt(ch12);
            if(chv<=26){
                char code = (char)('a' + chv -1);
                printEncodings(roq, ans+code);
            }

        }

    }
}