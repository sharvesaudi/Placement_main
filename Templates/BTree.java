package Templates;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class Tree{
    Node root = null;
    Node insert(int arr[], int i){
        Node root = null;
        if(i < arr.length){
            root = new Node(arr[i]);
            root.left = insert(arr, 2*1+1);
            root.right = insert(arr, 2*1+2);
        }
        return root;
    }

    public void preorder(Node root){
        if(root!=null){
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
    }
    public void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }
    void postOrder(Node root) {
        if(root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
    }
    public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4};
	    Tree t2 = new Tree();
        t2.root = t2.insert(arr, 0);
        t2.inOrder(t2.root);
        System.out.printf("\n");
        t2.inOrder(t2.root);
	}
}