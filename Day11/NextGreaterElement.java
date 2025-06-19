package Day11;

import java.util.Stack;

public class NextGreaterElement {

    public static void main(String[] args) {
        int arr[] = {4,5,2,25};
    int n = arr.length;
    int result[] = new int[n];
    Stack<Integer> st = new Stack<>();

    for(int i=n-1; i>=0; i--){
            if (st.isEmpty()) {
                result[i] =-1;
            }else if(st.peek()>arr[i]){
                result[i] = st.peek();
            }else{
                
            }
    }
    }
    

    // static class Stack {
    //   int maxsize;
    //   int top;
    //   int arr[];
    //   int i;

    //   Stack(int size){
    //        maxsize = size;
    //        arr = new int[maxsize];
    //        top = -1;
    //   }

    //   void push(int value){
    //     if (isFull()) {
    //         System.out.println("cannot push");
            
    //     }else {
    //         arr[++top] =value;
    //         arr[i] = value;
            
    //     }

        
    //   }

    //   boolean isFull(){
    //     return (top ==maxsize-1);
    //   }
        
    // }
    // public static void main(String[] args) {
    //     Stack st = new Stack(4);
    //     st.push(4);
    //     st.push(5);
    //     st.push(2);
    //     st.push(25);
    // }
}
