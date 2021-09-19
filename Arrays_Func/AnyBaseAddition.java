import java.util.Scanner;

public class AnyBaseAddition {

    public static Scanner sc = new Scanner(System.in);

    public static void AnyBaseAdditionFunc(int base, int n1, int n2) {
        int carry = 0;
        int sum;
        int val1, val2;
        String val="";
        while (n1 != 0 || n2 != 0||carry!=0) {
            val1 = n1 % 10;
            val2 = n2 % 10;
            sum = val1 + val2 + carry;
            val = (sum % base) + val;
            carry = sum / base;
            n1 /= 10;
            n2 /= 10;
        }
        System.out.println(val);
        
    }

    public static void main(String[] args) {
        int base=sc.nextInt();
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        
        AnyBaseAdditionFunc(base, num1, num2);
    }
    
}
