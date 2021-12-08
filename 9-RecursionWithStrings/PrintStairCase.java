import java.util.Scanner;

public class PrintStairCase {

    /*
    Sample Input: 3
    Sample Output: 111
                    12
                    21
                    3 
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printStairCases(n, "");
        sc.close();
    }

    public static void printStairCases(int n, String paths) {

        if (n < 0) {
            return;
        }
        if (n == 0) {
            System.out.println(paths);
            return;
        }
        
        printStairCases(n - 1, paths + "1");
        printStairCases(n - 2, paths + "2");
        printStairCases(n - 3, paths + "3");
        
    }
    
}
