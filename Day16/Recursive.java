package Day16;

import java.util.Scanner;

public class Recursive {
    static int naturalsum(int n){
        if (n==1) {
            return 1;
        }
        
            int sum = n+ naturalsum(n-1);
        return sum;

    }

    static int power(int x,int n){
             if (n==0) {
               return 1;
           }
           int pow = power(x, n-1);
           int xn = x*pow;
           return xn;
    }
    static int factorial(int n){
        if (n==0) {
            return 1;
        }
        return n*factorial(n-1);
    }
    static int fibonnaci(int n){
        if ( n==0 ||n==1) {
            return n;
        }
        int fn1 = fibonnaci(n-1);
        int fn2 = fibonnaci(n-2);
        int fn = fn1+fn2;
        return fn;
    }
    // String reverse(String str){

    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = naturalsum(n);
        System.out.println(sum);
        System.out.println(power(2, n));
        System.out.println(factorial(n));
        System.out.println(fibonnaci(n));
    }
}
