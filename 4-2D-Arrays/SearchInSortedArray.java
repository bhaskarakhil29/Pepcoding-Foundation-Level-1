import java.util.Scanner;

public class SearchInSortedArray {
    public static Scanner sc = new Scanner(System.in);

    public static void takeInput(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

    }

    public static void searchSortedArray(int[][] arr, int searchItem) {
        int lastIndex = arr[0].length - 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][0] == searchItem) {
                System.out.println(i + "\n" + 0);
            } else if (arr[i][lastIndex] == searchItem) {
                System.out.println(i + "\n" + lastIndex);
            }
            if (searchItem > arr[i][0] && searchItem < arr[i][lastIndex]) {
                for (int j = 1; j < arr[0].length - 1; j++) {
                    if (arr[i][j] == searchItem) {
                        System.out.println(i + "\n" + j);
                        return;
                    } else {
                        continue;
                    }
                }
                System.out.println("Not Found");
            }
        }
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        takeInput(arr);
        int searchItem = sc.nextInt();
        searchSortedArray(arr, searchItem);

    }

}
