package Day15;

public class CircularLinkedList {
    class Node{
        int data;
        Node prev;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    Node head;
    void insertAtEnd(int data){
        Node newNode = new Node(data);
        if (head ==null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next!= null &&temp.next!=head) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;

    }
    void display(){
        if (head==null) {
            return;
        }
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data+" ->");
            temp = temp.next;
        }
        System.out.println();
    }
    void makecircular(){
        if (head ==null) {
            System.out.println("empty");
            return;
        }
        Node temp = head;
        while (temp.next !=null && temp.next !=head) {
            temp = temp.next;
        }
        temp.next = head;
        head.prev = temp;
    }
    void displaycircular(int count){
        if (head ==null) {
            return;
        }
        Node temp = head;
        System.out.println("cicular forward"+count);
        int i=0;
        while (temp !=null && i<count) {
            System.out.print(temp.data+"->");
            temp = temp.next;
            i++;
        }
        System.out.println();

    }

    public static void main(String[] args) {
        CircularLinkedList cl = new CircularLinkedList();
        cl.insertAtEnd(5);
        cl.insertAtEnd(4);
        cl.insertAtEnd(9);
        cl.insertAtEnd(45);
        cl.insertAtEnd(55);
        cl.display();
        cl.makecircular();
        cl.displaycircular(15);
    }
}
