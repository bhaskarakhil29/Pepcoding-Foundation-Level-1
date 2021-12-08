
import java.util.Scanner;

public class SearchArr {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                System.out.println(i);
            }
        }
        System.out.println("-1");
        sc.close();

    }

}
