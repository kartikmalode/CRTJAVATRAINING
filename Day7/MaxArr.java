package Day7;

public class MaxArr {
    public static void main(String[] args) {
        int arr[] = {3,5,2,9,7};
        int max = -1;
        for(int i=0; i<arr.length; i++){
            if (arr[i]>max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum num in array "+max);
    }
}
