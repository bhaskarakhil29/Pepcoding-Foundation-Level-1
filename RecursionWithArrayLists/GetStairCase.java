import java.util.ArrayList;
import java.util.Scanner;


public class GetStairCase {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        ArrayList<String> paths = GetStairCasePaths(n);
        System.out.println(paths);
    }
    
    public static ArrayList<String> GetStairCasePaths(int n) {
        if (n == 0) {
            ArrayList<String> baseList = new ArrayList<>();
            baseList.add("");
            return baseList;
        }
        if (n < 0) {
            ArrayList<String> baseList = new ArrayList<>();
            return baseList;
        }
        ArrayList<String> path1 = GetStairCasePaths(n - 1);
        ArrayList<String> path2 = GetStairCasePaths(n - 2);
        ArrayList<String> path3 = GetStairCasePaths(n - 3);
        ArrayList<String> paths = new ArrayList<>();

        for (String path : path1) {
            paths.add("1" + path);
        }
        
        for (String path : path2) {
            paths.add("2" + path);
        }
        
        for (String path : path3) {
            paths.add("3" + path);
        }

        return paths;
    }
    
}
