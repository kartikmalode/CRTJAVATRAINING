import java.util.Scanner;

public class Recersion {
    static int factorial(int n){
        if (n==0 || n==1) {
            return 1;
        }else{
            return n*factorial(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  number = sc.nextInt();
        int result = factorial(number);
        System.out.println(number+" factorial is "+result);
    }
}
