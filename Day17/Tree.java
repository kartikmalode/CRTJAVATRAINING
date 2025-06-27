package Day17;

public class Tree {
   static class Node{
        int data;
        Node left,right;
    
     Node(int data){
        this.data = data;
        right=left = null;

    }
}
Node root;
  public void preorder(Node root){
    if (root ==null) {
        return;
    }
    System.out.print(root.data+" ->");
    preorder(root.left);
    preorder(root.right);
  }
  public void inorder(Node root){
    if (root == null) {
        return;
    }
    inorder(root.left);
    System.out.print(root.data+"->");
    inorder(root.right);
  }

  public void postorder(Node root){
    if (root ==null) {
        return;
    }
    postorder(root.left);
    postorder(root.right);
    System.out.print(root.data+"->");
  }
public static void main(String[] args) {
     Tree tree = new Tree();
    tree.root = new Node(7);
    tree.root.left = new Node(5);
    tree.root.right = new Node(9);
    tree.root.left.left = new Node(10);
    tree.root.right.right = new Node(15);

    System.out.println("inorder traversal");
    tree.inorder(tree.root);
    System.out.println();
    System.out.println("preorder traversal");
    tree.preorder(tree.root);
    System.out.println();
    System.out.println("postorder traversal");
    tree.postorder(tree.root);
    
    
}
}
