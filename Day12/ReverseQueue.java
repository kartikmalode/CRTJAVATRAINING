package Day12;

import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
    int size;
    int front, rear;
    static int arr[];
    
    public ReverseQueue(int size){
      this.size = size;
      arr = new int[size];
      front = -1;
      rear= -1;
    }
    void enqueue(int val){
      if (rear == size-1) {
        System.out.println("queue is full");
      }else{
        if(front ==-1){
            front = 0;
        }
        arr[++rear] = val;
      }
    }
    int dequeue(){
        if (front ==-1|| front>rear) {
          return -1;
        }else{
            
            return arr[front ++];

        } 

    }
     void display(){
            if (front ==-1 || front > rear) {
                System.out.println("empty");
            }else{
                for(int i=front; i<=rear; i++){
                  System.out.print(arr[i]+" ");
                }
                System.out.println();
            }

        } 

        void reverse(){
          Stack<Integer> s = new Stack<>();
          while (front !=-1 && front<= rear) {
            s.push(dequeue());
          }
          front =0;
          rear = -1;
          while (!s.isEmpty()) {
            enqueue(s.pop());
          }
        }
    public static void main(String[] args) {
            
        ReverseQueue rq = new ReverseQueue(5);
        rq.enqueue(4);
        rq.enqueue(2);
        rq.enqueue(3);
        rq.enqueue(8);
        rq.enqueue(1);
       
         System.out.println("Original Queue:");
        rq.display();

        rq.reverse();

        System.out.println("Reversed Queue:");
        rq.display();
        }
        
    
}
