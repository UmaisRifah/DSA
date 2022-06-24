import java.util.*;

public class b_keyPadString {
    public static void main(String[] args) throws Exception {
        Scanner scr = new Scanner(System.in);
        String s = scr.next();
        scr.close();
        ArrayList<String> res = getKPC(s);
        System.out.print(res);
         
    }
    static String[] a = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static ArrayList<String> getKPC(String str) {
        if(str.length()==0){
            ArrayList<String> bre= new ArrayList<>();
            bre.add("");
            return bre; 
        }
        
        char ch = str.charAt(0);        
        String ros = str.substring(1);

        ArrayList<String> ress = getKPC(ros);
        ArrayList<String> mres = new ArrayList<>();
        
        String s0 = a[ch - '0'];
        for(int i = 0;i<s0.length();i++){
            char ch1 = s0.charAt(i);
            for(String rst:ress){
                mres.add(ch1 +rst);
            }
        }
        return mres;
        
    }
}