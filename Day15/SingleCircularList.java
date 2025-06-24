package Day15;

public class SingleCircularList {
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }

    }
    Node head;

    void insertAtEnd(int data){
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
          Node temp = head;
          while (temp.next != null) {
            temp = temp.next;
          }
          temp.next = newnode;
    }

    void display(){
        if (head == null) {
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println();
    }
    void makecircular(){
        if (head == null) {
            return;
        }
        Node temp = head;
        while (temp.next!= null &&temp.next!= head) {
            temp = temp.next;
        }
        temp.next = head;
        temp = head;
    }
    void displaycircular(int count){
        if (head == null) {
            return;
        }
        Node temp = head;
        int i = 0;
        while (temp != null &&i<count) {
            System.out.print(temp.data+"->");
            temp = temp.next;
            i++;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        SingleCircularList sl = new SingleCircularList();
        sl.insertAtEnd(4);
        sl.insertAtEnd(8);
        sl.insertAtEnd(9);
        sl.insertAtEnd(7);
        sl.insertAtEnd(1);
        sl.display();
        sl.makecircular();
        sl.displaycircular(22);
    }
}
