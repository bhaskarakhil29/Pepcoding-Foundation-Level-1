package Patterns;

import java.util.Scanner;
/*
    n=5

    *   *   *   *   *   
        *   *   *   *   
            *   *   *   
                *   *   
                    *

*/

public class Pattern4{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int j=0,k;
        for(int i=1;i<=n;i++){
            for(k=1;k<=j;k++){
                System.out.print("\t");
            }
            for(k=n-j;k>=1;k--){
                System.out.print("*\t");
            }
            j++;
            System.out.println();
        }
        sc.close();
    }
}