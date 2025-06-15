package Day7;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ReverseArr {

    //another method
    public static void reverse(Integer[]a){
        Collections.reverse(Arrays.asList(a));
          System.out.println(Arrays.asList(a));

    }
    public static void main(String[] args) {
        Integer arr1[] = {1,2,3,4,5};
        reverse(arr1);
        int arr[] = {4,2,3,7};

        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
    }
}
