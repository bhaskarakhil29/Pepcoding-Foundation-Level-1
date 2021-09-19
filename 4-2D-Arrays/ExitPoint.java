import java.util.Scanner;

public class ExitPoint {

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

    public static void exitPoint(int[][] arr) {
        int dir = 0;
        int i = 0, j = 0;
        while (i >= 0 && j >= 0 && i < arr.length && j < arr[0].length) {
            dir = (dir + arr[i][j]) % 4;
            if (dir == 0) {
                j++;
            } else if (dir == 1) {
                i++;
            } else if (dir == 2) {
                j--;
            } else if (dir == 3) {
                i--;
            }
        }
        if (dir == 0) {
            j--;
        } else if (dir == 1) {
            i--;
        } else if (dir == 2) {
            j++;
        } else if (dir == 3) {
            i++;
        }
        System.out.println(i + " " + j);

    }

    public static void main(String[] args) {
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] mat = new int[row][col];
        takeInput(mat);
        exitPoint(mat);
    }

}
