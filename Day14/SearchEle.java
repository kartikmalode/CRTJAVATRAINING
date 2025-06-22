package Day14;


    class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class SearchEle {
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

    public int search(int target) {
        Node current = head;
        int index = 0;
        while (current != null) {
            if (current.data == target)
                return index;
            current = current.next;
            index++;
        }
        return -1;  
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }



    public static void main(String[] args) {
        SearchEle list = new SearchEle();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        list.display();  
        int searchValue = 30;
        int position = list.search(searchValue);

        if (position != -1)
            System.out.println("Element " + searchValue + " found at index " + position);
        else
            System.out.println("Element " + searchValue + " not found.");
    }
}
