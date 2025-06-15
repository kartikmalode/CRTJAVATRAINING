package Day6;

import java.util.Scanner;

public class TwoDarr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num.of rows and colums");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int sum =0;
        int arr[][] = new int[r][c];
        for(int i=0; i<arr.length; i++){
            System.out.println("enter number of rows"+(i+1));
            for(int j = 0; j<arr[0].length;j++){
                arr[i][j] = sc.nextInt();
                sum = sum+arr[i][j];
            }
        }
        for(int i=0; i<arr.length; i++){
            for(int j = 0; j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("\n");
        }
              System.out.println("\n\n sum of all num is " + sum + "\n Average is " + (float)sum / (float)(r * c));

    }
}
