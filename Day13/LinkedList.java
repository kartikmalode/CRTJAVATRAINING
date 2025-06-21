 
     class Node {
        int data;
        Node next;

        Node(int data){
          this.data = data;
          this.next = null;
        }
    }
     class LinkedLists {
        // public static Node head;
        //  public static Node tail;
       Node head;
        
       public void insertAtbegining(int data){
            Node newnode = new Node(data);
            newnode.next = head;
            head = newnode;
        }

        public void insertAtEnd(int data){
            Node newNode = new Node(data);
            if (head ==null) {
                head =newNode;
                return;
            }
            // tail.next = newNode;
            // tail = newNode;
            Node temp = head;
            while (temp.next !=null) 
                temp = temp.next;
            
            temp.next = newNode;
            
            
        }
      public  void insertAtposition(int data,int position){
            if (position==0) {
                insertAtbegining(data);
                return;
            }
            Node newnNode = new Node(data);
            Node temp = head;
            for(int i=0; temp !=null &&i<position-1;i++){
                 temp = temp.next;
            }

            if (temp == null) {
                System.out.println("position not found");
                return;
            }
            newnNode.next = temp.next;
            temp.next = newnNode;
        }

       public void display(){
            if (head ==null) {
                System.out.println("Empty");
                return;
            }else{
                Node temp = head;
                while (temp != null) {
                    System.out.print(temp.data+"->");
                    temp = temp.next;
                }
                System.out.println("null");
            }
        }

        public void reverse(){
            Node curr = head;
            Node prev = null;
            Node next;
            while (curr !=null) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            head = prev;
        }
    }
    
        
    public class LinkedList {
    
    public static void main(String[] args) {
        LinkedLists l = new LinkedLists();
        l.insertAtbegining(10);
         l.insertAtEnd(6);
        l.insertAtbegining(20);
        l.insertAtEnd(7);
        l.insertAtposition(25, 3);
        l.insertAtbegining(30);
         l.display();
         l.reverse();
         l.display();
        
                
    }
}

