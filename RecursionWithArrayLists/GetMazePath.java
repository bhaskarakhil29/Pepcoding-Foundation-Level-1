import java.util.ArrayList;
import java.util.Scanner;

public class GetMazePath {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        ArrayList<String> paths = getMazePath(1, 1, n, m);
        System.out.println(paths);

    }

    public static ArrayList<String> getMazePath(int sr, int sc, int dr, int dc) {

        if (sr == dr && sc == dc) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        ArrayList<String> hmoves = new ArrayList<>();
        ArrayList<String> vmoves = new ArrayList<>();

        if (sc < dc) {
            hmoves = getMazePath(sr, sc + 1, dr, dc);
        }
        if (sr < dr) {
            vmoves = getMazePath(sr + 1, sc, dr, dc);
        }
        ArrayList<String> paths = new ArrayList<>();

        for (String str : hmoves) {
            paths.add('h' + str);
        }

        for (String str : vmoves) {
            paths.add('v' + str);
        }
        return paths;
    }
}