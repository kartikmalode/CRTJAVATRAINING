package Day18;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class LevelorderTraversal {
    static class Node {
       int data;
       Node left,right;

       public Node(int data){
        this.data = data;
        left = right = null;
       }
        
    }
    static Node root;
    public static void leveorder(Node root){
        if (root ==null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node node = q.poll();
            System.out.print(node.data+"-");
            if (node.left!=null) {
                q.add(node.left);
            }
            if (node.right!=null) {
                q.add(node.right);
            }
        }
    }

    
    public static void main(String[] args) {
        LevelorderTraversal  node = new LevelorderTraversal();
        node.root = new Node(11);
        root.left = new Node(21);
        root.right = new Node(9);
        root.left.left = new Node(15);
        root.left.right = new Node(17);
        root.left.right.left = new Node(15);
        root.left.left.left = new Node(14);
        root.right.left = new Node(32);
        root.right.left.left = new Node(36);
        root.right.left.right = new Node(12);
        root.right.right = new Node(35);
        root.right.right.left = new Node(19);
        root.right.right.right = new Node(21);


        System.out.println("levelorder");
        leveorder(root);


        

    }
}
