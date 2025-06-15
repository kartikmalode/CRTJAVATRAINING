package Day7;

public class SecondLargeele {
    public static void main(String[] args) {
        int arr[]= {10,20,40,30,60};
        int max = -1;
        int second = -1;

        for(int i=0; i<arr.length; i++){
         if (arr[i]>max) {
            max = arr[i];
         }
        }
        for(int i =0; i<arr.length; i++){
            if (arr[i]>second &&arr[i]<max) {
                second= arr[i];
            }
        }
        System.out.println(second);
    }
}
