package Day18;

public class SearchingNode {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data= data;
            left = right= null;
        }
    }

    public static Node insert(Node root,int val){
        if (root ==null) {
            return new Node(val);
        }
        if (val<root.data) {
            root.left = insert(root.left, val);
        }else if (val>root.data) {
            root.right = insert(root.right, val);
        }
       return root;
        }

        public static boolean search(Node root, int key){
            if (root==null) {
                return false;
            }
            if (root.data ==key) {
                return true;
            }else if (key<root.data) {
               return search(root.left, key);
            }else{
               return search(root.right, key);
            }
            
        }

        public static void main(String[] args) {
            int arr[] = {4,5,7,8,50,9,10,80};
            Node root = null;
            for(int i=0; i<arr.length; i++){
                root = insert(root, arr[i]);
            }

            if (search(root, 100)) {
                System.out.println("found");
            }else{
                System.out.println("not found");
            }
        }

    }
