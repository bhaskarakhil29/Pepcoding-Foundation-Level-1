import java.util.Scanner;

public class ToggleCase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        String sin = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < sin.length(); i++) {
            char ch = sin.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                char upper = (char) (ch - 'a' + 'A');
                sb.append(upper);
            } else {
                char lower = (char) (ch - 'A' + 'a');
                sb.append(lower);
            }
        }
        System.out.println(sb.toString());
    }
    
}
