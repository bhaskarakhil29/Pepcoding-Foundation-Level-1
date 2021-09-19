import java.util.*;

public class Recursion{
public static Scanner sc = new Scanner(System.in);

    public static void printDecreasing(int n) {
if (n == 0) {
    return;
} else {
    System.out.println(n + " ");
    n--;
    printDecreasing(n);

}
}

    public static void printIncreasing(int n) {
if (n == 0) {
    return;
} else {
    printIncreasing(n - 1);
    System.out.println(n);
}
}

    public static void pdi(int n) {
printDecreasing(n);
printIncreasing(n);
}

    public static int factorial(int n) {
if (n == 0) {
    return 1;
}
int factnm1 = factorial(n - 1);
int factn = n * factnm1;
return factn;
}

    public static int powerLinear(int x, int n) {
if (n == 0) {
    return 1;
}
int pLm1 = powerLinear(x, n - 1);
int pLn = x * pLm1;

return pLn;
}

    public static int powerLog(int x, int n) {
if (n == 0)
    return 1;
int firstHalfxn = powerLog(x, n / 2);
int ans = firstHalfxn * firstHalfxn;
if (n % 2 == 1) {
    ans *= x;
}
return ans;
}

        public static void pzz(int n) {
    if (n == 0) {
        return;
    }
    System.out.print(n + " ");
    pzz(n - 1);
    System.out.print(n + " ");
    pzz(n - 1);
    System.out.print(n + " ");
}


public static void toh(int n, int src, int destination, int helper) {
    if (n == 0)
        return;
    toh(n - 1, src, helper, destination);
    System.out.println(n+"["+ src+"->"+destination+"]");
    toh(n - 1, helper, destination, src);
    }


    public static void ques() {
        // int n = 6;
    // printDecreasing(n);
    // printIncreasing(n);
    // pdi(n);
    // System.out.println(factorial(n));
    // System.out.println(powerLinear(2, n));
    // System.out.println(powerLog(2, 1)); 
    // pzz(3);   
    toh(3, 10,11,12);

}
    public static void main(String[] args) {
        ques();
    }
}