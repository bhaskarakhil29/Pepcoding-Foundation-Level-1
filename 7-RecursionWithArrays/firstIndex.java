import java.util.Scanner;

public class firstIndex {
    public static Scanner sc = new Scanner(System.in);

    public static int firstIndexEncounter(int[] arr, int index, int x) {

        if (index != arr.length) {

            if (arr[index] == x) {
                return index;
            } else {
                return firstIndexEncounter(arr, index + 1, x);
            }

        }
        
        

        return -1;
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();

        System.out.println(firstIndexEncounter(arr, 0, x));

    }

}
