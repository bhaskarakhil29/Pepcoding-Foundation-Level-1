import java.util.Scanner;

public class StringCompression {

    public static Scanner sc = new Scanner(System.in);

    public static void stringCompression1(String str) {
        String result = "";
        result = result + str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i - 1) != str.charAt(i)) {
                result = result + str.charAt(i);
            }
        }
        System.out.println(result);
    }

    public static void stringCompression2(String str) {
        int count = 1;
        String result = "";
        result = result+str.charAt(0);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i - 1) != str.charAt(i)) {
                if (count != 1) {
                    result = result + count;
                }
                result = result + str.charAt(i);
                count = 1;
            } else {
                count++;
            }
        }
        if (count != 1) {
                    result = result + count;
                }
        System.out.println(result);
    }

    public static void main(String[] args) {
        String str = sc.nextLine();
        stringCompression1(str);
        stringCompression2(str);
        
    }
    
}
