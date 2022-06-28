import java.util.*;

public class m_pythagorousTriplets {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int a = scr.nextInt();
        int b = scr.nextInt();
        int c = scr.nextInt();
        scr.close();

        if(a>b&&a>c){
            if(a*a==(b*b+c*c)){
                System.out.print("true");
            }else{
                System.out.print("false");
            }
        }

        if(b>a&&b>c){
            if(b*b==(a*a+c*c)){
                System.out.print("true");
            }else{
                System.out.print("false");
            }
        }

        if(c>b&&c>a){
            if(c*c==(b*b+a*a)){
                System.out.print("true");
            }else{
                System.out.print("false");
            }
        }
    }
}