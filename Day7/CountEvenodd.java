package Day7;

public class CountEvenodd {
    public static void main(String[] args) {
        int arr[] = {4,2,7,9,6};
        int even=0,odd = 0;

        for(int i=0; i<arr.length; i++){
            if (arr[i]%2==0) {
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("Even: "+even+" Odd: "+odd);
    }
}
