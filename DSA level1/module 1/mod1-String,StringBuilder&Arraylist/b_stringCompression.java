import java.util.*;

public class b_stringCompression {
    public static String compression1(String str){
		// write your code here
        char temp = ' ';
        String s = str.charAt(0)+"";
        for(int i = 1;i<str.length();i++){
            temp = str.charAt(i-1);
            char x=str.charAt(i);
            if(x!=temp){
                // System.out.print(x);
                s=s+x;
            }
         
        }

		return s;
	}

	public static String compression2(String str){
		// write your code here
        char temp = ' ';
        int count = 1;
        String s = str.charAt(0)+"";
        for(int i=1;i<str.length();i++){
            temp = str.charAt(i-1);
            char x=str.charAt(i);
            if(x!=temp){
                if(count==1){
                    // System.out.print(x);
                    s=s+x;
                }else{
                    s=s+count;
                    s=s+x;
                    // System.out.print(count);
                    // System.out.print(x);
                }
                count = 1;
            }else{
                count++;
            } 
        }
        if(count>1){
            s=s+count;
        }

		return s;
	}
	public static void main(String[] args) {
		try (Scanner scr = new Scanner(System.in)) {
            String str = scr.next();
            System.out.println(compression1(str));
            System.out.println(compression2(str));
        }
	}
}
