package Day7;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int curr=1, prev =0, sum = 0;
        for(int i=0; i<n; i++){
            sum = curr+prev;
       System.out.print(prev+" ");
        prev = curr;
        curr = sum;
        }
    }
}
