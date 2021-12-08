import java.util.Scanner;

public class AnyBaseMultiplication {

    public static Scanner sc = new Scanner(System.in);

    public static int AnyBaseAdditionFunc(int base, int n1, int n2) {
        int carry = 0;
        int sum;
        int val1, val2;
        int result = 0;
        int pow = 1,val;
        while (n1 != 0 || n2 != 0||carry!=0) {
            val1 = n1 % 10;
            val2 = n2 % 10;
            sum = val1 + val2 + carry;
            val = sum % base;
            carry = sum / base;
            result += val * pow;
            pow *= 10;
            n1 /= 10;
            n2 /= 10;
        }
        return result;
        
    }

    public static void AnyBaseMultiplicationFunc(int base, int n1, int n2) {
        int carry = 0;
        int mul;
        int val;
        int result = 0,partialProduct=0;
        int innerPow = 1,outerPow = 1;
        int n2copy = n2;
        int ival, jval;
        while (n1 != 0) {
            ival = n1 % 10;
            n1 /= 10;
            n2copy = n2;
            partialProduct = 0;
            while (n2copy != 0 || carry != 0) {
                jval = n2copy % 10;
                n2copy /= 10;
                mul = (jval * ival) + carry;
                val = mul % base;
                carry = mul / base;
                partialProduct += val * innerPow;
                innerPow *= 10;
            }
            innerPow = 1;
            partialProduct *= outerPow;
            outerPow *= 10;
            result = AnyBaseAdditionFunc(base, result, partialProduct);
        }
        System.out.println(result);
        
    }

    public static void main(String[] args) {
        int base=sc.nextInt();
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        AnyBaseMultiplicationFunc(base, num1, num2);
    }
    
}
