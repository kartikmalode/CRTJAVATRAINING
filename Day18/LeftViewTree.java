package Day18;

import java.util.LinkedList;
import java.util.Queue;

public class LeftViewTree {
    static class Node{
       int data;
       Node left,right;
       public Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
       }
    }
    static Node root;
    public static void leftview(Node root){
       if (root ==null) {
        return ;
       }
       Queue<Node> q = new LinkedList<>();
       q.add(root);

       while (!q.isEmpty()) {
        int levesixe = q.size();
        for(int i=0; i<levesixe; i++){
            Node node = q.poll();

            if (i==0) {
                System.out.print(node.data+"-");
            }
            if (node.left!=null) {
                q.add(node.left);
            }
            if (node.right!=null) {
                q.add(node.right);
            }

        }
       }

    }

    public static void rightview(Node root){
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int levelsize = q.size();
            for(int i=0; i<levelsize; i++){
                Node node = q.poll();

                if (i==levelsize-1) {
                    System.out.print(node.data+"-");
                }

                if (node.left !=null) {
                    q.add(node.left);
                }
                if (node.right != null) {
                    q.add(node.right);
                }
            }
            

        }
    }
    
    public static void main(String[] args) {
        Node root = new Node(20);
        root.left = new Node(9);
        root.right = new Node(30);
        root.left.left = new Node(8);
        root.left.right = new Node(12);
        root.left.right.left = new Node(10);
        root.right.right = new Node(31);
        root.right.right.right = new Node(40);

        leftview(root);
        System.out.println();
        rightview(root);
    }
}
