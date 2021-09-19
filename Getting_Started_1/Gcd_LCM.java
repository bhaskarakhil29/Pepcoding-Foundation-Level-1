package Getting_Started_1;

import java.util.Scanner;
// lcm*gcd=a*b;

public class Gcd_LCM {

    public static int gcd(int a,int b){
        if(b==0) return a;
        else return gcd(b,a%b);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int res;
        if(Integer.max(a, b)==a){
            res=gcd(a,b);
            System.out.println(res);    
        }else{
            res=gcd(b,a);
            System.out.println(res);
        }
        System.out.println(a*b/res);
        sc.close();

    }
    
}
