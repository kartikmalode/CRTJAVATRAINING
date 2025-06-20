package Day12;

public class Queue {
    int size;
    int front,rear;
    int queue[];

    public Queue(int size){
        this.size = size;
        queue = new int[size];
        front  = -1;
        rear= -1;
    }

    void enqueue(int val){
       if (rear == size-1) {
        System.out.println("Queue is empty");
       }else{
        if(front == -1){
            front = 0;
        }
        queue[++rear] = val;
        System.out.println(val+" enqueue");
       }
    }

    void dequeue(){
        if (front ==-1 || front> rear) {
            System.out.println("queue is empty");
        }else{
            System.out.println(queue[front]);
            front++;
        }
        if (front> rear) {
            front = -1;
            rear = -1;
        }
    }

    void peek(){
         if (front ==-1 || front> rear) {
            System.out.println("queue is empty");
        }else{
            System.out.println(queue[front]);
        }
    }

    boolean isEmpty(){
        return front ==-1 || front> rear;
    }

    void display(){
        int count =0;
        if (front ==-1 || front> rear) {
            System.out.println("queue is empty");
        }else{
            for(int i=front; i<=rear; i++){
                System.out.print(queue[i]+" ");
                count++;
            }
            System.out.println();
            System.out.print("size is "+count);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Queue q= new Queue(5);
        q.enqueue(5);
        q.enqueue(6);
        q.enqueue(7);
        q.enqueue(9);
        q.enqueue(3);
        q.enqueue(5);
        q.enqueue(45);
        q.display();
        q.dequeue();
        q.dequeue();
        q.display();
        q.peek();
    }
}
