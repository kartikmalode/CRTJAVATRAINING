package Day12;

import java.util.Stack;

public class StackKthElement {
    public static void main(String[] args) {
        int arr[] = {4,2,5,6,7,8,9};

        int k = 3;
        Stack<Integer> s = new Stack<>();
        for(int i=0; i<arr.length; i++){
            s.push(arr[i]);
        }
        Stack<Integer> temp= new Stack<>();
        int count = 1;
        while (!s.isEmpty()) {
            int val = s.pop();
            if (count == k) {
                temp.push(12); 
            } else {
                temp.push(val);
            }
            count++;
        }

        // while (!temp.isEmpty()) {
        //     s.push(temp.pop());
        // }

        
        // while (!s.isEmpty()) {
        //     temp.push(s.pop());
        // }
        while (!temp.isEmpty()) {
            System.out.print(temp.pop()+" ");
        }
    }
}
