package Day9;

public class ArrayReference {
    public void doublearr(int arr[]){
     for(int i=0; i<arr.length; i++){
        arr[i] =arr[i]*2;
     }
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,40};
        ArrayReference ar = new ArrayReference();
        ar.doublearr(arr);
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
