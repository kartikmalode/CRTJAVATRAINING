package Day17;

import java.util.Scanner;

public class ArrayTreeTraversal {
   static class Node{
        int data;
        Node left,right;
        public Node(int data){
             this.data = data;
             left = right = null;
        }
    }
    Node root;
    public static Node buildtree(int arr[],int index){
        if (index>=arr.length ||arr[index]==-1) {
            return null;
        }
        Node node = new Node(arr[index]);
        node.left = buildtree(arr, 2*index+1);
        node.right = buildtree(arr, 2*index+2);

        return node;
    }
    public static void preorder(Node root){
        if (root == null) {
            return;
        }
        System.out.print(root.data+"->");
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(Node root){
        if (root == null) {
            return;
        }
        
        inorder(root.left);
        System.out.print(root.data+"->");
        inorder(root.right);
    }
    public static void postorder(Node root){
        if (root == null) {
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

        System.out.println("enter elements");
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
                Node root = buildtree(arr, 0);
     System.out.println("inorder");
        inorder(root);
        System.out.println();
         System.out.println("preorder");
        preorder(root);
        System.out.println();
        System.out.println("postorder");
        postorder(root);

    }
}
