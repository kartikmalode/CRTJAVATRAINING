package Day6;
import java.util.*;
public class StudentArr {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char arr[] = new char[n];

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.next().charAt(0);
        }
    }
}
