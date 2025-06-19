package Day11;

public class StackArray {
    static class Stack {
        int maxsize;
        int top;
        int arr[];

        Stack(int size){
            maxsize = size;
             arr = new int[maxsize];
           top = -1;
        }

        void push(int value){
            if (isFull()) {
                System.out.println("cannot push"+value);
            } else {
                arr[++top] = value;
                System.out.println(value+" pushed");
            }
        }
        int peek(){
            if (isEmpty()) {
                System.out.println("satct is empty");
                return -1;
            }else{
             return arr[top];
            }
        }

        int pop(){
            if (isEmpty()) {
                System.out.println("stack is empty");
                return -1;
            }else{
               int   value = arr[top--];
               System.out.println(value+" poped");
               return -1;
            }
            
        }
        boolean isFull(){
            return (top ==maxsize-1);
        }
        boolean isEmpty(){
            return (top ==-1);
        }

    }

        public static void main(String[] args) {
            Stack st = new Stack(5);
            st.push(10);
            st.push(20);
            st.push(30);
            st.push(40);
            st.push(50);
            st.push(100);

            st.pop();
           System.out.println(st.peek()+"top element");
            


        }

        
    
        
    
}
