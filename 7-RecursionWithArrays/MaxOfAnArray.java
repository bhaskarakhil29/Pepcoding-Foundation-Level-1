import java.util.Scanner;

public class MaxOfAnArray {
    public static Scanner sc = new Scanner(System.in);

    public static int MaxinArray(int[] arr, int index) {

        // 1, 2, 3, 4, 5
        if (index != arr.length) {
            return Integer.max(arr[index], MaxinArray(arr, index + 1));
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(MaxinArray(arr,0));

    }
}