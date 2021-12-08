import java.util.ArrayList;
import java.util.Scanner;

public class GetMazePathsJumps {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        ArrayList<String> paths = getMazePathsJumps(1, 1, n, m);
        System.out.println(paths);
        sc.close();
    }

    public static ArrayList<String> getMazePathsJumps(int sr, int sc, int dr, int dc) {

        if (sr == dr && sc == dc) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        ArrayList<String> paths = new ArrayList<>();

        for (int i = 1; i <= dc - sc; i++) {
            ArrayList<String> hmoves = getMazePathsJumps(sr, sc + i, dr, dc);
            for (String str : hmoves) {
                paths.add("h" + i + str);
            }
        }
        for (int i = 1; i <= dr - sr; i++) {
            ArrayList<String> vmoves = getMazePathsJumps(sr+i, sc, dr, dc);
            for (String str : vmoves) {
                paths.add("v"+i+ str);
            }
        }
        for (int i = 1; i <= dc - sc && i <=dr-sr; i++) {
            ArrayList<String> dmoves = getMazePathsJumps(sr+i, sc+i, dr, dc);
            for (String str : dmoves) {
                paths.add("d"+i+ str);
            }
        }
        return paths;
    }
    
}
