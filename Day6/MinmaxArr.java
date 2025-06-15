package Day6;

import java.util.Scanner;

public class MinmaxArr {
    public static void largestsecondelement(int arr1[],int l,int seocnd){

        for(int i=0; i<arr1.length; i++){
            if (arr1[i]>l) {
                   l=arr1[i]  ;
            }
        }
          for(int i=0; i<arr1.length; i++){
               if (arr1[i]>seocnd && arr1[i]<l) {
                seocnd = arr1[i];
               } 
          }
          System.out.println(seocnd);   
           
    }
    public static void main(String[] args) {
        int arr1[] = {5,3,9,1,9};
        int l = Integer.MIN_VALUE;
        int second = -1;
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]= new int[n];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
       
        for(int i=0; i<n;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<arr.length; i++){
            if (arr[i]>max) {
                   max=arr[i]  ;
            }
            if (arr[i]<min) {
                min = arr[i];
            }
        }

        System.out.println(max);
        System.out.println(min);

        largestsecondelement(arr1, l, second);
    }
}
