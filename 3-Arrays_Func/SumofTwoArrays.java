
import java.util.Scanner;

/* 
    sum>9(12)==> sumarr[i]=sum%10;
                 carry=sum/10;=>
    1,2,3,4
    4,5,6,8
    -----------
    5 8 0 2  
    1 2 3 4
    9 8 7 6
   1 1  1  1  0  
*/

public class SumofTwoArrays {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n1, n2;
        n1 = sc.nextInt();
        int arr1[] = new int[n1];
        for (int i = 0; i < n1; i++)
            arr1[i] = sc.nextInt();
        n2 = sc.nextInt();
        int arr2[] = new int[n2];
        for (int i = 0; i < n2; i++)
            arr2[i] = sc.nextInt();
        int sumarr[] = new int[Integer.max(n1, n2) + 1];
        int carry = 0, i = n1 - 1, j = n2 - 1, k = sumarr.length - 1;
        while (i >= 0 || j >= 0 || k >= 0) {
            sumarr[k] = carry + arr1[i] + arr2[j];
            if (sumarr[k] > 9) {
                carry = sumarr[k] / 10;
                sumarr[k] %= 10;
            } else {
                carry = 0;
            }
            i--;
            j--;
            k--;
        }
        if (sumarr[0] == 0) {
            for (int l = 1; l < sumarr.length; l++) {
                System.out.println(sumarr[l]);
            }
        } else {
            for (int l = 0; l < sumarr.length; l++) {
                System.out.println(sumarr[l]);
            }
        }

    }

}
