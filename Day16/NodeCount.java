package Day16;

public class NodeCount {
    class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data =data;
            this.next = null;
            this.prev = null;

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
     void displayForward(){
        
        Node temp = head;
        int count = 0;
        while (temp!=null) {
            System.out.print(temp.data+" ->");
            count++;
            temp = temp.next;
        }
        System.out.println();
     System.out.println(count);


    }
    public void insertAtposition(int data,int target){
        if (target ==0) {
         insertAtEnd(data);        
           return;
        }

        Node newnNode = new Node(data);
        Node temp = head;
        while (temp !=null ||target==temp.data) {
            newnNode.next= temp.next;
        newnNode.prev = temp;
        if (temp.next !=null) {
            temp.next.prev = newnNode;
        }
        temp.next = newnNode;
        }
        
        


    }
    public static void main(String[] args) {
        NodeCount nc = new NodeCount();
        nc.insertAtEnd(12);
        nc.insertAtEnd(33);
        nc.insertAtEnd(45);
        nc.insertAtEnd(66);
        nc.displayForward();
        nc.insertAtposition(13, 12);
        nc.displayForward();
    }

}
