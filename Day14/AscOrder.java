package Day14;

public class AscOrder {
    class Node{
        int data;
        Node next;

        Node(int data){
        this.data = data;
        this.next = null;
        }
    }
    Node head;

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newNode;
    }
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    
    public void ascorder(){
        Node temp = head;
        if (head ==null|| head.next==null) {
            return ;
        }

        while (temp.next!=null) {
             if (temp.data>temp.next.data) {
            int curr = temp.data;
            temp.data = temp.next.data;
            temp.next.data = curr;
              }

        
        temp = temp.next;
        }

        
    }
   


    public static void main(String[] args) {
        AscOrder asc = new AscOrder();
        asc.insert(4);
        asc.insert(6);
        asc.insert(80);
        asc.insert(9);
        asc.insert(12);
        asc.display();

        asc.ascorder();
        asc.display();
    }


}
