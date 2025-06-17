package Day9;

import java.util.Scanner;

public class Arrayoperation {

    public void Doubling(int arr[]){
        for(int i=0; i<arr.length; i++){
            arr[i] = 2*arr[i];
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
    }
    public void initializearr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();

        int arr[] = new int[size];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        Arrayoperation ar = new Arrayoperation();
        ar.Doubling(arr);
        ar.initializearr(arr);
    }
}
