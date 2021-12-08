package Getting_Started_1;
import java.util.Scanner;


/*
    inverse of 2134 = 1243

    ==> 1==> 1*10^4-1= 1000
    ==> 2==> 2*10^3-1=  200
    ==> 3==> 3*10^1-1=    3
    ==> 4==> 4*10^2-1=   40
                    -------------
                       1243
                    -------------

*/

public class InverseOfANumber{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=0;
        int temp=n;
        while(temp>0){
            d++;
            temp/=10;
        }
        int count=1;
        int newnum=0;
        while(count<=d){
            int rem=n%10;
            newnum=newnum+(count*(int)Math.pow(10,rem-1));
            count++;
            n=n/10;
        }
        System.out.println(newnum);
        sc.close();

        
    }
}