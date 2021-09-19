import java.util.*;

public class lastIndex {
        public static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) throws Exception {
        // write your code here
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();

        System.out.println(lastIndexs(arr, 0, x));
    }

    public static int lastIndexs(int[] arr, int index, int x){
        if (index == arr.length) {
            return -1;
        }
            int idx = lastIndexs(arr, index + 1, x);
            if (idx==-1) {
                if (arr[index] == x) {
                    return index;
                } else {
                    return -1;
                }
            } else {
                return idx;
            }
        
    }

}