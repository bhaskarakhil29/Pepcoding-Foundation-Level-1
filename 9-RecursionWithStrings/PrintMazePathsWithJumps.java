import java.util.Scanner;

public class PrintMazePathsWithJumps {

    /*
        Sample Input:
                        2
                        2
        Sample Output:
                        h1v1
                        v1h1
                        d1
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dr = sc.nextInt();
        int dc = sc.nextInt();
        printMazePathsWithJumps(1, 1, dr, dc, "");
        sc.close();
    }

    public static void printMazePathsWithJumps(int sr, int sc, int dr, int dc, String paths) {

        if (sr == dr && sc == dc) {
            System.out.println(paths);
            return;
        }
        
        for (int i = 1; i <= dc-sc; i++) {
            printMazePathsWithJumps(sr, sc+i, dr, dc, paths+"h"+i);
        }
        for (int i = 1; i <= dr-sr; i++) {
            printMazePathsWithJumps(sr + i, sc, dr, dc, paths + "v" + i);
        }
        for (int i = 1; i <= dc-sc && i <= dr-sr; i++) {
            printMazePathsWithJumps(sr + i, sc + i, dr, dc, paths + "d" + i);
        }
    }
}
