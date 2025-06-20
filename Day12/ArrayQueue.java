public class ArrayQueue{
    int size;
    int front, rear;
    int queue[];

    public ArrayQueue(int size){
        this.size = size;
        queue = new int[size];
        front = -1;
        rear = -1;
    }

    void enqueue(int value){
           if (rear ==size-1) {
            System.out.println("Queue is empty");
           }else{
            if(front==-1){
                front=0;
            }
            queue[++rear] = value;
            System.out.println(value+" enqueue");
           }
         
    }

    void dequeue(){
        if (front == -1 || front>rear) {
             System.out.println("queue is empty");
        }else{
            System.out.println(queue[front]+" dequeue");
            front++;
        }
        if (front> rear) {
            front = -1;
            rear = -1;
        }
    }

    void peek(){
       if (front ==-1|| front>rear) {
        System.out.println("queue is empty");
       } else {
        System.out.println(queue[front]);
       }  
    }

    boolean isEmpty(){
        return front ==-1 || front>rear;
    }
    void display(){
        if (isEmpty()) {
            System.out.println("Queue is empyt");
        }else{
            System.out.println("QUEUE");
            for(int i=front; i<=rear;i++){
                System.out.print(queue[i]+" ");
            }
            System.out.println();
         }
    }

    public static void main(String[] args) {
        ArrayQueue aq = new ArrayQueue(5);
        aq.enqueue(10);
        aq.enqueue(20);
        aq.enqueue(30);
        aq.enqueue(40);
        aq.display();
        aq.dequeue();
        aq.peek();
        aq.display();
        aq.enqueue(60);
        aq.display();

    }
}