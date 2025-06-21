public class LinkedListDeleteNode {
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
        
    }
    Node head;
    public void insertAtbegining(int data){
         Node newnNode = new Node(data);
         newnNode.next = head;
         head = newnNode;
    }

    public void insertAtEnd(int data){
         Node newnNode = new Node(data);
        if (head == null) {
            head = newnNode;
            return;
        }
        Node temp = head;
        while (temp.next!=null) {
            temp = temp.next;
        }
        temp.next = newnNode;
    }
    public void insertAtposition(int data, int Position){
        if (Position ==0) {
           insertAtbegining(data);
           return;
        }
        Node newnode = new Node(data);
        Node temp = head;
        for(int i=0; temp !=null && i<Position-1;i++){
            temp = temp.next;
        }
        if (temp ==null) {
            System.out.println("Position not found");
            return;
        }
        newnode.next = temp.next;
        temp.next = newnode;
    }

    public void display(){
        if (head == null) {
            System.out.println("empty");
        }
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println();
    }

    public void deleteAtBegin(){
        if (head == null) {
            System.out.println("null");
            return;
        }
        head = head.next;
    }
    public void deleteAtEnd(){
        if (head==null) {
            System.out.println("linked list is empty");
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next !=null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    public void deleteAtMiddle(int position){
      if (head == null) {
        System.out.println("empty");
        return;
      }
      if (position ==0) {
        deleteAtBegin();
        return;
      }
      Node temp = head;
      for(int i=0; temp!=null && i<position-1; i++){
        temp = temp.next;
      }
      temp.next = temp.next.next;
    }

    public static void main(String[] args) {
        LinkedListDeleteNode l = new LinkedListDeleteNode();
        l.insertAtbegining(10);
        l.insertAtbegining(20);
        l.insertAtEnd(35);
        l.insertAtbegining(40);
                l.display();

        l.insertAtposition(55, 3);
        l.display();
        l.deleteAtBegin();
        l.display();
        l.deleteAtEnd();
        l.display();
        l.deleteAtMiddle(1);
        l.display();

    }
}
