package Day5;

import java.util.Scanner;

public class Difficient {
    public static int difficient(int n){
        int sum = 1;
        for(int i=2; i<=n/2; i++){
            if (n%i ==0) {
                sum +=i;
            }

        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = difficient(n);
            if (sum<n) {
                System.out.println("difficient number"+i);
            }else{
                System.out.println("invalid");
            }
        }
    }
}
