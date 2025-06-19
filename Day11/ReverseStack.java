package Day11;

import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<arr.length; i++){
            st.push(arr[i]);
        }

         while (!st.isEmpty()) {
            System.err.print(st.pop());
         }
          
        

    }
}
