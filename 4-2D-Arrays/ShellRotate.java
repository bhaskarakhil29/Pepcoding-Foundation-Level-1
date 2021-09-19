import java.util.Scanner;

public class ShellRotate {
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

    public static void reverse(int[] arr, int left, int right) {
        int temp;
        while (left < right) {
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void rotateKtimes(int[] arr, int k) {
        k = k % arr.length;
        if (k < 0) {
            k = k + arr.length;
        }
        reverse(arr, 0, arr.length - k - 1);
        reverse(arr, arr.length - k, arr.length - 1);
        reverse(arr, 0, arr.length - 1);

    }

    public static int[] get1DArray(int[][] arr, int s) {
        int r = arr.length;
        int c = arr[0].length;
        int rmax = r - s;
        int rmin = s - 1;
        int cmax = c - s;
        int cmin = s - 1;

        int sizeOfSthArray = 2 * ((rmax - rmin) + (cmax - cmin));

        int[] sthArray = new int[sizeOfSthArray];
        int j = 0;

        // Fill the 1D Array by Traversing.

        // Left wall.
        for (int i = rmin; i <= rmax && j < sizeOfSthArray; i++) {
            sthArray[j] = arr[i][cmin];
            j++;
        }
        cmin++;

        // Bottom wall
        for (int i = cmin; i <= cmax && j < sizeOfSthArray; i++) {
            sthArray[j] = arr[rmax][i];
            j++;
        }
        rmax--;

        // Right wall
        for (int i = rmax; i >= rmin && j < sizeOfSthArray; i--) {
            sthArray[j] = arr[i][cmax];
            j++;
        }
        cmax--;

        // Top wall
        for (int i = cmax; i >= cmin && j < sizeOfSthArray; i--) {
            sthArray[j] = arr[rmin][i];
            j++;
        }
        rmin++;

        return sthArray;
    }

    public static void set1DArray(int[][] arr, int s, int[] sthArray) {
        int r = arr.length;
        int c = arr[0].length;
        int rmax = r - s;
        int rmin = s - 1;
        int cmax = c - s;
        int cmin = s - 1;
        int sizeOfSthArray = sthArray.length;
        int j = 0;

        // Fill the 1D Array by Traversing.

        // Left wall.
        for (int i = rmin; i <= rmax && j < sizeOfSthArray; i++) {
            arr[i][cmin] = sthArray[j];
            j++;
        }
        cmin++;

        // Bottom wall
        for (int i = cmin; i <= cmax && j < sizeOfSthArray; i++) {
            arr[rmax][i] = sthArray[j];
            j++;
        }
        rmax--;

        // Right wall
        for (int i = rmax; i >= rmin && j < sizeOfSthArray; i--) {
            arr[i][cmax] = sthArray[j];
            j++;
        }
        cmax--;

        // Top wall
        for (int i = cmax; i >= cmin && j < sizeOfSthArray; i--) {
            arr[rmin][i] = sthArray[j];
            j++;
        }
        rmin++;

    }

    public static void rotateShell(int[][] arr, int s, int k) {
        int[] sthArr = get1DArray(arr, s);
        rotateKtimes(sthArr, k);
        set1DArray(arr, s, sthArr);

    }

    public static void main(String[] args) {
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        takeInput(arr);
        int s = sc.nextInt();
        int k = sc.nextInt();

        rotateShell(arr, s, k);
        display(arr);
    }
}
