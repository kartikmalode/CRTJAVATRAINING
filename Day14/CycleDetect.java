package Day14;

    class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CycleDetect {

    Node head;

    // Insert at end
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

    // Create a loop for testing (connect last node to the node at given position)
    public void createLoop(int position) {
        if (position < 0) return;

        Node loopNode = head;
        for (int i = 0; i < position && loopNode != null; i++)
            loopNode = loopNode.next;

        Node temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = loopNode;
    }

    // Floyd’s Cycle Detection Algorithm
    public void detectLoop() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;          // 1 step
            fast = fast.next.next;     // 2 steps

            if (slow == fast) {
                System.out.println("Loop Found");
                return;
            }
        }

        System.out.println("No Loop Found");
    }



    public static void main(String[] args) {
        CycleDetect list = new CycleDetect();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);

        // Uncomment this to create a loop (e.g., last node points to node at index 2)
        list.createLoop(2);

        list.detectLoop();
    }
}

