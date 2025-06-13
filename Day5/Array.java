package Day5;
import java.util.*;
public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        System.out.println("Enter the size of array");
        for(int i =0; i<n; i++){
          arr[i] = sc.nextInt();
          sum = sum+arr[i];
        }
        System.out.println("sum is "+sum);
        System.out.println("average value is "+(float)sum/n);
        


    }
}
