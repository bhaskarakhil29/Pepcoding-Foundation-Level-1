import java.util.Scanner;

public class PrintEncodings {

    /*
    
        Sample Input: 123
        Sample Output: abc
                        aw
                        lc
    
                                                                                                                                                                                                                                                    
                        `   
    
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        printEncodings(str, "");

        sc.close();

    }

    public static void printEncodings(String str, String asf) {
        if (str.length() == 0) {
            System.out.println(asf);
            return;
        }
        
        char ch1 = str.charAt(0);
        int n1 = ch1 - '0';

        if (n1 == 0) {
            return;
        }

        String rest1 = str.substring(1);
        char ans1 = (char) (n1 + 'a' - 1);
        printEncodings(rest1, asf + ans1);
        
        if (str.length() > 1) {
            char ch2 = str.charAt(1);
            int n2 = ch2 - '0';
            int actualn2 = n1 * 10 + n2;
            String rest2 = str.substring(2);
            if (actualn2 <= 26) {
                char ans2 = (char) (actualn2 + 'a' - 1);
                printEncodings(rest2, asf+ans2);
            }
        }

    }

    
}
