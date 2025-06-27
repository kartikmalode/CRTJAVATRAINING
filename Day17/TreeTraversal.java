package Day17;

public class TreeTraversal {
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data = data;
            left=right = null;
        }
    }
    Node root;

    void inorder(Node root){
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data+"->");
         inorder(root.right);

        
    }
    void preorder(Node root){
        if (root == null) {
            return;
        }
        System.out.print(root.data+"->");
        preorder(root.left);
        preorder(root.right);

    }
    void postorder(Node root){
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+"->");
    }

    public static void main(String[] args) {
        TreeTraversal tree = new TreeTraversal();
        // tree.root = new Node(15);
        // tree.root.left = new Node(14);
        // tree.root.right = new Node(26);
        // tree.root.left.left = new Node(12);
        // tree.root.left.left.left = new Node(10);
        // tree.root.left.left.right = new Node(13);
        // tree.root.right.left = new Node(20);
        // tree.root.right.left.left = new Node(18);
        // tree.root.right.right = new Node(27);
        tree.root = new Node(15);
        tree.root.left= new Node(26);
        tree.root.right= new Node(21);
        tree.root.right.right= new Node(32);
        tree.root.right.right.left= new Node(15);
        tree.root.right.right.left.right= new Node(21);
        tree.root.right.right.left.right.left= new Node(11);
        tree.root.right.right.left.right.right= new Node(19);
        tree.root.right.right.left.right.right.right= new Node(8);
        tree.root.left.right= new Node(11);
        tree.root.left.right.right= new Node(28);
        tree.root.left.left= new Node(29);
        tree.root.left.left.right= new Node(25);
        tree.root.left.left.right.left= new Node(30);


        System.out.println("preorder traversal");
        tree.preorder(tree.root);
        System.out.println();
        System.out.println("inorder traversal");
        tree.inorder(tree.root);
        System.out.println();
        System.out.println("postorder traversal");
        tree.postorder(tree.root);
        


    }
}
