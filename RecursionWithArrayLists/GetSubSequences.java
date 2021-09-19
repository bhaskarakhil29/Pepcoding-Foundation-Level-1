import java.util.ArrayList;
import java.util.Scanner;

public class GetSubSequences {
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        String str = sc.next();
        ArrayList<String> result = gss(str);
        System.out.println(result);
    }

    public static ArrayList<String> gss(String str) {
        if (str.length() == 0) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> resultros = gss(ros);

        ArrayList<String> actualres = new ArrayList<>();
        for (String rstr : resultros) {
            actualres.add("" + rstr);
            
        }
        for (String rstr : resultros) {
            actualres.add(ch + rstr);
            
        }
        return actualres;

    }
    
}
