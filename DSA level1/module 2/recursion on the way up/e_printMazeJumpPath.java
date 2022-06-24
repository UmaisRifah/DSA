import java.util.*;

public class e_printMazeJumpPath {
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
        
         if(sc==dc&&sr==dr){
            System.out.println(psf);
            return;
        }
        

        for(int i = 1;i<=dc-sc;i++){
            printMazePaths(sr, sc+i, dr, dc, psf+"h"+i);
        }
        for(int i = 1;i<=dr-sr;i++){
            printMazePaths(sr+i, sc, dr, dc, psf+"v"+i);
        }
        for(int i = 1;i<=dc-sc&&i<=dr-sr;i++){
            printMazePaths(sr+i, sc+i, dr, dc, psf+"d"+i);
        }
    }
}