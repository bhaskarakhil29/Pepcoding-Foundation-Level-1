import java.util.Scanner;

public class DecimalToAnyBase {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int base = sc.nextInt();
        String outputNum = "";
        int remainder;

        while (n > 0) {
            remainder = n % base;
            outputNum = remainder + outputNum;
            n /= base;
        }
        System.out.println(outputNum);
    }
}