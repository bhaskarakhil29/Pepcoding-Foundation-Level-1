import java.util.Scanner;

public class AnyBaseToDecimal {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int base = sc.nextInt();
        int power = 0;
        int remainder;
        int output = 0;

        while (n > 0) {
            remainder = n % 10;
            output += remainder * (int) Math.pow(base, power);
            power++;
            n = n / 10;
        }
        System.out.println(output);
    }

}
