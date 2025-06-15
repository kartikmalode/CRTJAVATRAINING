package Day3;

import java.util.Scanner;

public class PR4 {
    //digit game 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       int sum =0;
       int rem;
        while (n>0) {
             rem = n%10;
             sum = sum + rem;
             n = n/10;
        
        }
        while (sum>10) {
            n =sum;
            sum = 0;
            while (n>0) {
             rem = n%10;
             sum = sum + rem;
             n = n/10;
        
        }
        }
        if (sum%2==0) {
            System.out.println(sum);
        }else{
            System.out.println(Math.pow(sum,2));
            
        }
        
    }
}
