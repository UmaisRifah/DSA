import java.util.*;

public class a_palindromicString {

    public static boolean isPalindrome(String s){
        int i=0;
        int j = s.length()-1;
        while( i<=j){
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(j);
            if(ch1==ch2){
                i++;
                j--;
            }else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String s = scr.next();
        for(int i = 0;i<s.length();i++){
            for(int j= i+1;j<=s.length();j++){
                String ss = s.substring(i, j);
                if(isPalindrome(ss)==true){
                    System.out.println(ss);
                }
            }
        }
        scr.close();
    }
}
