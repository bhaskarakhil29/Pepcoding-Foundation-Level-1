import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KeyboardMappingCombinations {

    static Scanner sc = new Scanner(System.in);
    static String keysToChars[] = {
        ".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"
    };

    public static void main(String[] args) {
        String str = sc.next();
        ArrayList<String> result = keyboardMapping(str);
        System.out.println(result);
    }
    
    public static ArrayList<String> keyboardMapping(String str) {
        if (str.length() == 0) {
            ArrayList<String> baseList = new ArrayList<>();
            baseList.add("");
            return baseList;
        }
        char ch = str.charAt(0);
        String restString = str.substring(1);
        ArrayList<String> partialRes = keyboardMapping(restString);
        ArrayList<String> actualRes = new ArrayList<>();
    
        String keyAtNow = keysToChars[ch-'0'];
        for (int i = 0; i < keyAtNow.length(); i++) {
            char chNow = keyAtNow.charAt(i);
            for (String cStr : partialRes) {
                actualRes.add(chNow + cStr);
            }
        }
        return actualRes;
        
    }
    
}
