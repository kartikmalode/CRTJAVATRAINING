package Day17;

public class LinkedList {
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static Node head;

    public static void insertatBegin(int data){
        Node newnode = new Node(data);
        newnode.next = head;
        head = newnode;
    }
    public static void insertatEnd(int data){
        if (head ==null) {
            return;
        }
        Node newnode = new Node(data);
        Node temp = head;
        while (temp.next !=null) {
            temp = temp.next;
        }
        temp.next = newnode;
    }
}
