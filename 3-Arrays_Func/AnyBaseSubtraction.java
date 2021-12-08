import java.util.Scanner;

public class AnyBaseSubtraction {
    
    public static Scanner sc = new Scanner(System.in);
    
    public static int AnyBaseSubtractionFunc(int num1, int num2, int base) {
        int result = 0;
        int carry = 0;
        int pow = 1;
        int val1,val2,val; 
        while (num1 != 0 || num2 != 0) {
            val1 = num1 % 10;
            num1 /= 10;
            val2 = num2 % 10;
            num2 /= 10;
            val = (val2 + carry) - val1;

            if (val < 0) {
                val = val + base;
                carry = -1;
            } else {
                carry = 0;
            }
            result = result + val  * pow;
            pow*=10;

        }
        return result;
    }

    public static void main(String[] args) {

        int base = sc.nextInt();
                int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println(AnyBaseSubtractionFunc(num1,num2,base));
    
    
}
}