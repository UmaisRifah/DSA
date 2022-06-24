import java.util.*;

public class e_mazeJumpPath {
    public static void main(String[] args) throws Exception {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int m = scr.nextInt();
        scr.close();
        ArrayList<String> res = getMazePaths(1, 1, n, m);
        System.out.print(res);
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
        
        
        
        for(int i = 1;i<=dc-sc;i++){
            ArrayList<String> p1 = getMazePaths(sr, sc+i, dr, dc);
            for(String v:p1){
                res.add("h"+i+v);
            }
        }
        for(int i = 1;i<=dr-sr;i++){
            ArrayList<String> p2 = getMazePaths(sr+i, sc, dr, dc);
            for(String v:p2){
                res.add("v"+i+v);
            }
        }
        for(int i = 1;i<=dr-sr;i++){
            ArrayList<String> p3 = getMazePaths(sr+i, sc+i, dr, dc);
            for(String v:p3){
                res.add("d"+i+v);
            }
        }
        return res;
    }
}