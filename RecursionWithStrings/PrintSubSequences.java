import java.util.Scanner;

public class PrintSubSequences {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String ques = sc.nextLine();

        printSubSequences(ques, "");
        sc.close();

    }

    public static void printSubSequences(String ques, String ans) {
        
        if (ques.length() == 0) {
            System.out.println(ans);
            return;
        }

        char first = ques.charAt(0);
        String rest = ques.substring(1);

        printSubSequences(rest, ans + first);
        printSubSequences(rest, ans+"");
    }
    
    
}
