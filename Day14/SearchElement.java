package Day14;

import java.util.LinkedList;


    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next = null;
        }

    }
    public class SearchElement {
    Node head;
    public void insert(int data){
        Node newnNode = new Node(data);
        if (head ==null) {
            head = newnNode;
            return;
        }
        Node temp = head;
        while (temp.next!=null) {
            temp = temp.next;
            temp.next = newnNode;
        }
    }
    public int serach(int key){
        Node temp = head;
         int idx = 0;
         while (temp !=null) {
            if (temp.data ==key) {
                return idx;
            }
            temp = temp.next;
            idx++;
         }
         return -1;
         
    }
   
           
       public void display(){
                Node temp = head;
                while (temp != null) {
                    System.out.print(temp.data+"->");
                    temp = temp.next;
                }
                System.out.println("null");
            }
        

    public static void main(String[] args) {
          SearchElement se = new SearchElement();
          se.insert(5);
          se.insert(8);
          se.insert(4);
          se.insert(9);
          se.insert(7);
          se.insert(3);
          se.display();

        //  se.serach(3);
        

    }
}
