package Day9;

import java.util.Scanner;

public class ArrayPractice {
    //assuming that number occur maximum 5 times
    public void search(int arr[],int n){
        for(int i=0; i<arr.length; i++){
            if (arr[i]==n) {
                System.out.println("the element present at index at "+i);
            }
            
            
             
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        for(int i=0;i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        ArrayPractice ar = new ArrayPractice();
            int n = sc.nextInt();
        ar.search(arr,n);
    }
}
