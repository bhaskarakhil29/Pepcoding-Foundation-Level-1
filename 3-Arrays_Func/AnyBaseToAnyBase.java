import java.util.Scanner;

public class AnyBaseToAnyBase {

    public static Scanner sc = new Scanner(System.in);

    public static int AnyBaseToDecimal(int n, int base) {
        int power = 0;
        int remainder;
        int output = 0;

        while (n > 0) {
            remainder = n % 10;
            output += remainder * (int) Math.pow(base, power);
            power++;
            n = n / 10;
        }
        return output;

    }

    public static int DecimalToAnyBase(int n, int b) {
        int remainder;
        int output = 0;
        int power = 0;

        while (n > 0) {
            remainder = n % b;
            output += remainder * (int) Math.pow(10, power);
            n = n / b;
            power++;
        }
        return output;
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        int base1 = sc.nextInt();
        int base2 = sc.nextInt();
        System.out.println(DecimalToAnyBase(AnyBaseToDecimal(n, base1), base2));

    }

}
