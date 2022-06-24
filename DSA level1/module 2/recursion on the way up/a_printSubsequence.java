import java.util.*;
// import java.io.*;

public class a_printSubsequence {
    public static void main(String[] args) throws Exception {
        Scanner scr = new Scanner(System.in);
        String s = scr.next();
        scr.close();
        printSS(s, "");
    }

    public static void printSS(String str, String ans) {
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);

        String ros = str.substring(1);
        printSS(ros, ans+ch);
        printSS(ros, ans+ "");

    }
}