import java.util.*;

public class d_mazePath {
    public static void main(String[] args) throws Exception {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int m = scr.nextInt();
        scr.close();
        ArrayList<String> ar = getMazePaths(1, 1, n, m);
        System.out.print(ar);
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr>dr||sc>dc){
            ArrayList<String> br = new ArrayList<>();
            return br;
        }else if(sr==dr&&sc==dc){
            ArrayList<String> br = new ArrayList<>();
            br.add("");
            return br;
        }
        ArrayList<String> res = new ArrayList<>();
        ArrayList<String> p1 = getMazePaths(sr, sc+1, dr, dc);
        ArrayList<String> p2 = getMazePaths(sr+1, sc, dr, dc);
        for(String v : p1){
            res.add('h'+v);
        }
        for(String v : p2){
            res.add('v'+v);
        }
        return res;    

    }
}