package Day5;

import java.util.Scanner;

public class Armstng {
    //print armstrong numbers in given range
    public static boolean isArmstrong(int num){
        int original = num;
        int sum = 0;
        int digit = String.valueOf(num).length();
        while (num>0) {
            int digit1 = num%10;
            sum += Math.pow(digit1, digit);
            num/=10;
        }
        return sum == original;
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int start = sc.nextInt();
       int end = sc.nextInt();
       for(int i=start; i<=end; i++){
        if (isArmstrong(i)) {
            System.out.println(i);
            
        }
       }

    }
}
