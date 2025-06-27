package Day17;

public class TreeTraversalUsingArray {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
          this.data = data;
          left = right = null;
        }

    }
     Node root;
    public static Node buildtree(int arr[],int i){
        if (i>=arr.length ||i==-1) {
            return null;
        }
        Node node = new Node(arr[i]);
        node.left=buildtree(arr, 2*i+1);
        node.right= buildtree(arr, 2*i+2);
        return node;
    }

    static void inorder(Node root){
        if (root ==null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data+"-");
        inorder(root.right);
    }
    static void preorder(Node root){
        if (root ==null) {
            return;
        }
        System.out.print(root.data+"-");
        preorder(root.left);
        preorder(root.right);
    }
    static void postorder(Node root){
        if (root ==null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+"-");
    }

    public static void main(String[] args) {
        int arr[]= {6,9,12,15,23,56,41,22};
        int index = 0;
        for( int i=0; i<arr.length; i++){
            index = arr[i];
        //     if (index == 56) {
        //  System.out.println("56 is at index "+i);

        // }
        }
        
        Node root = buildtree(arr, 0);
        
        System.out.println("preorder");
        preorder(root);
        if (root.data == 56) {
            System.out.println(index);
        }
        System.out.println();
        System.out.println("inorder");
        inorder(root);
        System.out.println();
        System.out.println("postorder");
        postorder(root);
        System.out.println();
    }
}
