import java.util.*;

public class c_getStairPath{
    public static void main(String[] args) throws Exception {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        scr.close();
        ArrayList<String> res = getStairPaths(n);
        System.out.print(res);
    }

    public static ArrayList<String> getStairPaths(int n) {
        if(n==0){
            ArrayList<String> br = new ArrayList<>();
            br.add("");
            return br;
        }else if(n<0){
            ArrayList<String> br = new ArrayList<>();
            return br; 
        }

        ArrayList<String> p1 = getStairPaths(n-1);
        ArrayList<String> p2 = getStairPaths(n-2);
        ArrayList<String> p3 = getStairPaths(n-3);
        ArrayList<String> res = new ArrayList<>();
        for(String path:p1){
            res.add('1'+path);
        }
        for(String path:p2){
            res.add('2'+path);
        }
        for(String path:p3){
            res.add('3'+path);
        }

        return res;
    }
}


