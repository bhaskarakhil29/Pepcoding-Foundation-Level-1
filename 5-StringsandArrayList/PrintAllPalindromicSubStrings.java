import java.util.Scanner;

/**
 * PrintAllPalindromicSubStrings
 */
public class PrintAllPalindromicSubStrings {
    public static Scanner sc = new Scanner(System.in);

    public static boolean isPalindrome(String str) {
        int i = 0, j = str.length()-1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;

    }

    public static void printPalindromeSubStrings(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String temp = str.substring(i, j);
                if (isPalindrome(temp)) {
                    System.out.println(temp);
                }
            }
        }
    }
     

    public static void main(String[] args) {
        String str = sc.nextLine();

        printPalindromeSubStrings(str);
        
    }

    
}