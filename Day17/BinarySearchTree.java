package Day17;

import java.util.Scanner;

public class BinarySearchTree {
    static class Node{
        int data;
        Node left,right;

        Node(int data){
            this.data = data;
            left = right = null;
        }
    }

    public static Node insert(Node root,int value){
        if (root == null) {
            return new Node(value);
        }
        if (value< root.data) {
            root.left = insert(root.left, value);
        }else if (value> root.data) {
            root.right = insert(root.right, value);
        }
        return root;
    }

    public static void inorder(Node root){
        if ( root ==null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data+"->");
        inorder(root.right);
    }
    public static void preorder(Node root){
        if ( root ==null) {
            return;
        }
        System.out.print(root.data+"->");
        preorder(root.left);
        preorder(root.right);
    }
    public static void postorder(Node root){
        if ( root ==null) {
            return;
        }
        
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+"->");
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter nodes");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        Node root = null;
        for(int value:arr){
            root = insert(root, value);
        }

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
