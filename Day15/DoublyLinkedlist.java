package Day15;

public class DoublyLinkedlist {
    class Node{
        int data;
        Node prev;
        Node next;

        public Node(int data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }
    Node head;
    public void insertAtbegining(int data){
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        newnode.next = head;
        head.prev = newnode;
        head = newnode;
    }

    public void insertAtEnd(int data){
        Node newnode  = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;
        newnode.prev = temp;

    }


public void insertAtposition(int data,int position){
        if (position ==0) {
         insertAtbegining(data);
                   
           return;
        }

        Node newnNode = new Node(data);
        Node temp = head;
        
        for(int i=0; i<position-1 && temp!=null;i++){
           temp = temp.next;
        }
        if (temp == null) {
            System.out.println("position not found");
            return;
        }
        newnNode.next= temp.next;
        newnNode.prev = temp;
        if (temp.next !=null) {
            temp.next.prev = newnNode;
        }
        temp.next = newnNode;


    }
    void displayForward(){
        
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data+" ->");
            temp = temp.next;
        }
        System.out.println();

    }

    void deleteAtBegin(){
        if (head == null) {
            System.out.println("empty");
            return;
        }
        head = head.next;
        if (head!=null) {
            head.prev = null;
        }
    }
    void deleteFromend(){
       if (head == null) {
            System.out.println("empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        } 
        Node temp = head;
        while (temp.next!=null) {
            temp = temp.next;
        }
        temp.prev.next = null;
    }
    void deleteAtposition(int position){
        if (head ==null) {
            System.out.println("empty");
            return;
        }
        if (position ==0) {
            deleteAtBegin();
            return;
        }
        Node temp = head;
        for(int i=0; i<position-1 && temp!=null; i++){
            temp = temp.next;
        }
        if (temp == null || temp.next ==null) {
            return;
        }
        temp.next = temp.next.next;
        if (temp.next!=null) {
            temp.next.prev = temp;
        }
        
    }
    void displayBackward() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        while (temp.next != null)
            temp = temp.next;

        System.out.print("Reverse List: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        DoublyLinkedlist dl = new DoublyLinkedlist();
        dl.insertAtbegining(14);
        dl.insertAtbegining(9);
        dl.insertAtbegining(6);
        dl.insertAtbegining(5);
        dl.insertAtEnd(28);
        dl.insertAtEnd(40);
        dl.displayForward();
       dl.insertAtbegining(20);
       dl.insertAtbegining(19);
       dl.insertAtEnd(21);
       dl.insertAtEnd(43);

        dl.displayForward();
        dl.insertAtposition(56, 4);
        dl.displayForward();
    }
}
