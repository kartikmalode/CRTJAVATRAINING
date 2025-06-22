package Day14;

public class MiddleEle {
    class Node {
    int data;
    Node next;

    Node(int data) {
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

    public void middle(){
        Node slow=head;
        Node fast=head;
        while (fast !=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast.next ==null || fast.next.next==null) {
                System.out.println(slow.data);
            }
        }
    }
    // public void loop(){
    //       Node slow=head;
    //     Node fast=head;
    //     while (fast !=null) {
    //         slow = slow.next;
    //         fast = fast.next.next;
    //         if (fast==slow) {
    //             System.out.println("loop detect");
    //         }else{
    //             System.out.println("not loop");
    //         }
    //     }
    // }


    public static void main(String[] args) {
        MiddleEle m = new MiddleEle();
        m.insert(50);
        m.insert(20);
        m.insert(40);
        m.insert(7);
        m.insert(45);
        m.insert(6);

        m.display();
        m.middle();
        // m.loop();
        
    }
}
