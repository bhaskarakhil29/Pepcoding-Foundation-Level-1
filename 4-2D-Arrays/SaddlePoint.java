import java.util.Scanner;

public class SaddlePoint {

    public static Scanner sc = new Scanner(System.in);

    public static void takeInput(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }

    public static void findSaddlePoint(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minInRow = 0;

            for (int j = 1; j < arr[i].length; j++) {
                if (arr[i][j] < arr[i][minInRow]) {
                    minInRow = j;
                }
            }
            boolean flag = true;
            for (int k = 0; k < arr.length; k++) {
                if (arr[k][minInRow] > arr[i][minInRow]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(arr[i][minInRow]);
                return;
            }
        }
        System.out.println("Invalid Input");
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        takeInput(arr);
        findSaddlePoint(arr);
    }

}
