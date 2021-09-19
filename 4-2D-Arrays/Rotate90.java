import java.util.*;

public class Rotate90 {

    public static Scanner sc = new Scanner(System.in);

    public static void takeInput(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

    }

    public static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void transposeMatrix(int[][] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= i; j++) {
                temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    public static void rotateMatrix90(int[][] arr) {
        transposeMatrix(arr);
        int temp, left = 0, right = arr.length - 1;
        for (int r = 0; r < arr.length; r++) {
            left = 0;
            right = arr[r].length - 1;
            while (left < right) {
                temp = arr[r][left];
                arr[r][left] = arr[r][right];
                arr[r][right] = temp;
                left++;
                right--;
            }
        }

    }

    public static void main(String[] args) {
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] arr = new int[r][c];

        takeInput(arr);
        rotateMatrix90(arr);
        display(arr);

    }
}