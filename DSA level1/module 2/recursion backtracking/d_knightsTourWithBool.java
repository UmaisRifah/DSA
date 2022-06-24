import java.util.*;

public class d_knightsTourWithBool {
    public static void main(String[] args) throws Exception {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int r = scr.nextInt();
        int c = scr.nextInt();
        scr.close();
        int[][] chess = new int[n][n];
        boolean[][] visited = new boolean[n][n];
        printKnightsTour(chess, r, c, 1, visited);
    }

    public static void printKnightsTour(int[][] chess, int r, int c, int upcomingMove,boolean[][] mark) {
        if(r<0||c<0||r>=chess.length||c>=chess.length||mark[r][c]==true){
            return;
        }
        if(upcomingMove==chess.length*chess.length){
            chess[r][c] = upcomingMove;
            displayBoard(chess);
            chess[r][c] = 0;
            return;
        }
        
        chess[r][c] = upcomingMove;
        mark[r][c] = true;
        printKnightsTour(chess, r-2, c+1, upcomingMove+1, mark);
        printKnightsTour(chess, r-1, c+2, upcomingMove+1, mark);
        printKnightsTour(chess, r+1, c+2, upcomingMove+1, mark);
        printKnightsTour(chess, r+2, c+1, upcomingMove+1, mark);
        printKnightsTour(chess, r+2, c-1, upcomingMove+1, mark);
        printKnightsTour(chess, r+1, c-2, upcomingMove+1, mark);
        printKnightsTour(chess, r-1, c-2, upcomingMove+1, mark);
        printKnightsTour(chess, r-2, c-1, upcomingMove+1, mark);
        chess[r][c] = upcomingMove;
        mark[r][c] = false;

    }

    public static void displayBoard(int[][] chess){
        for(int i = 0; i < chess.length; i++){
            for(int j = 0; j < chess[0].length; j++){
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }
}