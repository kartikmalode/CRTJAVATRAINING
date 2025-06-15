package Day6;

public class RotationaArr {
  public static void main(String[] args) {
        int arr[] = {6,8,7,6,5,4};
        int k =3;
        int n = arr.length;
        for(int i=3;i<n; i++){
            
            System.out.print(arr[i]+" ");
        }
        for(int i=0; i<k;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
