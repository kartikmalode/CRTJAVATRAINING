package Day18;

import java.util.Scanner;

public class BSTUsingArray {
  static  class Node{
        int data;
        Node left,right;
    
    public Node(int data){
        this.data = data;
        left = right = null;
    }
}
static Node root;
  public static Node buildbst(Node root,int value){
    if (root == null) {
        return new Node(value);
    }
    if (value <root.data) {
        root.left = buildbst(root.left, value);
    }else if (value>root.data) {
        root.right = buildbst(root.right, value);
    }
    return root;
  }

  static void preorder(Node root){
    if (root==null) {
        return;
    }
    System.out.print(root.data+"->");
    preorder(root.left);
    preorder(root.right);
  }
  static void inorder(Node root){
    if (root==null) {
        return;
    }
    inorder(root.left);
    System.out.print(root.data+"->");
    inorder(root.right);
  }

  static void postorder(Node root){
    if (root==null) {
        return;
    }
    postorder(root.left);
    postorder(root.right);
    System.out.print(root.data+"->");
  }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println("enter array element");
    int arr[] = new int[n];
    
    for(int i=0; i<n; i++){
        arr[i] = sc.nextInt();
    }
       Node root  = null;
    for(int value:arr){
        root = buildbst(root, value);
    }

    System.out.println("preorder");
    preorder(root);
    System.out.println();
    System.out.println("inorder");
    inorder(root);
    System.out.println();
    System.out.println("postorder");
    postorder(root);

}

}
