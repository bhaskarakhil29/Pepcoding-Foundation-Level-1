import java.util.Scanner;

public class PrintMazePaths {

    /*
    Sample Input:-
                    2
                    2
    Sample Output:-
                    hv
                    vh
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dr = sc.nextInt();
        int dc = sc.nextInt();

        printMazePaths(1, 1, dr, dc, "");
        sc.close();
    }

    public static void printMazePaths(int sr, int sc, int dr, int dc, String paths) {

        if (sc == dc && sr == dr) {
            System.out.println(paths);
            return;
        }

        if(sc<=dc)
            printMazePaths(sr, sc + 1, dr, dc, paths + "h");
        if(sr<=dr)
            printMazePaths(sr + 1, sc, dr, dc, paths + "v");
        
        
    }
    
}
