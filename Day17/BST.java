package Day17;

public class BST {
   static class Node{
        int data;
        Node left,right;

        public Node(int data){
            this.data = data;
            left = right = null;
        }
    }
     Node root;
    public static Node insert(Node root,int value){
        if (root ==null) {
            return new Node(value);
        }
        if (value<root.data) {
            root.left = insert(root.left, value);
        }else if (value > root.data) {
            root.right = insert(root.right, value);
        }
        return root;
    }

    public static void preorder(Node root){
        if (root ==null) {
            return;
        }
        System.out.print(root.data+"-");
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(Node root){
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data+"-");
        inorder(root.right);
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
        BST tree = new BST();
        tree.root = new Node(8);
        tree.root.left = new Node(20);
        tree.root.left.right = new Node(27);
        tree.root.left.right.right = new Node(18);
        tree.root.left.right.right.right = new Node(17);
        tree.root.left.right.right.right.left = new Node(16);
        tree.root.left.right.left = new Node(26);
        tree.root.right = new Node(11);
        tree.root.right.left = new Node(19);
        tree.root.right.right = new Node(21);
        tree.root.right.right.left = new Node(5);
        tree.root.right.right.right = new Node(30);
        tree.root.right.right.right.right = new Node(9);
        tree.root.right.right.right.right.left = new Node(11);
        tree.root.right.right.right.right.right = new Node(19);
        tree.root.right.right.right.left = new Node(12);
        tree.root.right.right.right.left.left = new Node(6);
         System.out.println("inorder");
        inorder(tree.root);
        System.out.println();
        System.out.println("preorder");
        preorder(tree.root);
        System.out.println();
        System.out.println("postorder");
        postorder(tree.root);
        System.out.println();
        
    }
}
