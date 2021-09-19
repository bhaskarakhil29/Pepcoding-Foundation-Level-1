package Getting_Started_1;

import java.util.Scanner;

public class Benjamin_Bulbs {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=1;i<=n/2;i++){
            if(i*i<=n){
                System.out.println(i*i);
            }
        }
        sc.close();
    }
    
}
