package Day19;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Tree {
    static class Node {
      int data;
      Node left,right;
        
      public Node(int data){
        this.data = data;
        left = right = null;
      }
    }
   static Node root;
   public static Node insert(Node root,int value){
    if (root ==null) {
        return new Node(value);
    }
    if (value<root.data) {
        return insert(root.left, value);
    }else if (value>root.data) {
        return insert(root.right, value);
    }else{
        return root;
    }

   }
   public static Node buildtree(int arr[],int i){
    if (i>=arr.length ||i==-1) {
        return null;
    }
    Node node = new Node(arr[i]);
    node.left = buildtree(arr, 2*i+1);
    node.right = buildtree(arr, 2*i+2);
    return node;
   }
   public static void levelorderleftview(Node root){
    if ( root == null) {
        return;
    }
    
    Queue<Node> q = new LinkedList<>();
    q.add(root);
    while (!q.isEmpty()) {
        int levelsize = q.size();
    for(int i=0; i<levelsize; i++){
        Node node = q.poll();
        
        
        if (i==0) {
            System.out.print(node.data+" ");
        }
        if (node.left !=null) {
            q.add(node.left);
        }
        if (node.right!=null) {
            q.add(node.right);
        }
    }
}
   }
    public static void inorder(Node root){
        if (root ==null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data+"-");
        inorder(root.right);
    }
     public static void preorder(Node root){
        if (root ==null) {
            return;
        }
        System.out.print(root.data+"-");
        preorder(root.left);
        preorder(root.right);
    }

    public static void postorder(Node root){
        if (root ==null) {
            return;
        }

        postorder(root.left);
        postorder(root.right);
         System.out.print(root.data+"-");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter Nodes");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Node root = buildtree(arr, 0);
        // for(int val:arr){
        //     root = insert(root, val);
        // }
        //    levelorderleftview(root);
        levelorderleftview(root);
        System.out.println("inorder");
         inorder(root);
         System.out.println();
         System.out.println("preorder");
         preorder(root);
         System.out.println();
         System.out.println("postorder");
         postorder(root);
         System.out.println();

    }
}
