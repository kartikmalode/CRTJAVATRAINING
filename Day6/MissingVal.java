package Day6;

import java.util.Arrays;

public class MissingVal {
    public static void main(String[] args) {
        // int arr[] = {1,2,3,5,6,7};
        // int arrsum = 0;
        // int n = arr.length;
        // for(int i = 0; i<arr.length; i++){
        //     arrsum += arr[i];
        // }
        // int sum = n*(n+1)/2;
        // int m = sum-arrsum;
        // System.out.println(m);
//insert zero at the end of array
        int arr []= {1,0,4,5,6,0};
        for(int i =0; i<arr.length; i++){
            if (arr[i]!=0) {
               
                System.out.print(arr[i]+" ");

            }
        }
        for(int i =0; i<arr.length; i++){
            if(arr[i] ==0){
                 arr[arr.length-1] = arr[i];
                 System.out.print(arr[i]+" ");
            }
        }

        // int index = 0;
        // for(int num :arr){
        //     if (num !=0) {
        //         arr[index] =num;
        //     }

        // }
        // while (index<arr.length) {
        //     arr[index]=0;
        // }
        // System.out.println(Arrays.toString(arr));

    }

}
