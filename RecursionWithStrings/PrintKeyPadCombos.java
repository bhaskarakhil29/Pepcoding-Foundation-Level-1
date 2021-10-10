import java.util.Scanner;

public class PrintKeyPadCombos {

    static String keysToChars[] = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ques = sc.nextLine();
        printKeyPadCombos(ques, "");
        sc.close();

    }

    public static void printKeyPadCombos(String ques, String ans) {

        if (ques.length() == 0) {
            System.out.println(ans);
            return;
        }

        char ch = ques.charAt(0);
        String rest = ques.substring(1);

        String keysNow = keysToChars[ch - '0'];
        for (int i = 0; i < keysNow.length(); i++) {
            printKeyPadCombos(rest, ans + keysNow.charAt(i));
        }

    }

}
