import java.util.*;

public class d_printMazePath {
    public static void main(String[] args) throws Exception {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int m = scr.nextInt();
        scr.close();
        printMazePaths(1, 1, n, m, "");
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
        if(sr>dr||sc>dc){
            return;
        }else if(sr==dr&&sc==dc){
            System.out.println(psf);
            return;
        }
        
        printMazePaths(sr, sc+1, dr, dc, psf+"h");
        printMazePaths(sr+1, sc, dr, dc, psf+"v");
    }
}