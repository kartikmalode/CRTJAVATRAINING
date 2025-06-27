package Day18;

import java.util.ArrayList;
import java.util.List;

public class IsBst {
    static class Node{
        int data;
        Node left,right;

        public Node(int data){
            this.data = data;
            left = right = null;
        }
    }


  static void inorder(Node root,List<Integer> list){
    if (root == null) {
        return;
    }
    inorder(root.left,list);
    list.add(root.data);
    inorder(root.right,list);
  }

  public static boolean issorted(List<Integer> list){
    for(int i=1; i<list.size();i++){
        if (list.get(i)<=list.get(i-1)) {
            return false;
        }
    }
    return true;
  }

  public static boolean isbst(Node root){
    List<Integer> inorderlist = new ArrayList<Integer>();
    inorder(root, inorderlist);
    return issorted(inorderlist);
  }
  static int count = 0;
  public static void preorder(Node root){
    
    if (root ==null) {
        return;
    }
    System.out.print(root.data+"-");
    count++;
    preorder(root.left);
    preorder(root.right);

  }
   public static void inorder(Node root){
    
    if (root ==null) {
        return;
    }
    inorder(root.left);
     System.out.print(root.data+"-");
    inorder(root.right);

  }
    public static void main(String[] args) {
        
        Node root = new Node(1);
        root.left = new Node(3);
        root.right = new Node(76);
        root.left.left = new Node(4);
        root.left.right = new Node(7);
        root.left.right.left = new Node(8);
        root.left.right.left.right = new Node(9);
        root.left.right.right = new Node(11);
        root.right.left = new Node(15);
        root.right.right = new Node(13);
        root.right.right.right = new Node(28);
        root.right.right.right.left = new Node(21);
        root.right.right.right.left.left = new Node(20);
        root.right.right.right.left.right = new Node(25);
        root.right.right.right.right = new Node(30);


        if (isbst(root)) {
            System.out.println("it is valid bst");
        }else{
            System.out.println("not valid bst");

      
        
    }
    preorder(root);
    System.out.println();
    System.out.println(count);
    System.out.println();
    inorder(root);
}
}
