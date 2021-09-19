import java.util.Scanner;

public class StringWithConsecutiveAsciiDifference {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String sin = sc.nextLine();
        StringBuilder sb = new StringBuilder();

        int count;
        sb.append(sin.charAt(0));
        for (int i = 1; i < sin.length(); i++) {
            char ch = sin.charAt(i);
            count = ch - sin.charAt(i - 1);
            sb.append(count);
            sb.append(ch);
        }
        System.out.println(sb.toString());
        
    }
    
}
