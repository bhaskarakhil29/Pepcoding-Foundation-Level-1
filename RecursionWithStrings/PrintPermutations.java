import java.util.Scanner;

public class PrintPermutations {

    /*
        Sample Input: abc
        Sample Output:
                        abc,
                        acb,
                        bac,
                        bca,
                        cab,
                        cba
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        printPermutations(str, "");
        sc.close();
    }

    public static void printPermutations(String str, String perm) {
        if (str.length() == 0) {
            System.out.println(perm);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String leftRest = str.substring(0, i);
            String rightRest = str.substring(i + 1);
            String rest = leftRest + rightRest;
            printPermutations(rest, perm+ch);
        }
    }
    
}
