import java.util.*;

public class a_getSubsequence {
    public static void main(String[] args) throws Exception {
        Scanner scr = new Scanner(System.in);
        String s = scr.next();
        scr.close();
        ArrayList<String> res = gss(s);
        System.out.print(res);
    }

    public static ArrayList<String> gss(String str) {
        if(str.length()==0){
            ArrayList<String> br = new ArrayList<>();
            br.add("");
            return br;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> rres = gss(ros);
        ArrayList<String> mres = new ArrayList<>();
        for(String rstr : rres){
            mres.add(""+rstr);
        }
        for(String rstr : rres){
            mres.add(ch+rstr);
        }
        return mres;
                
    }
}