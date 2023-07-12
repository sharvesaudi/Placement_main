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
    Node insert(Node root, int x){
        if(root==null){
            root = new Node(x);
            return root;
        }
        if(x<root.data)
            root.left = insert(root.left, x);
        if(x>root.data)
            root.right = insert(root.right, x);
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
    public void postOrder(Node root) {
        if(root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
    }
}
class BSearch_Tree{
    public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4};
	    Tree t2 = new Tree();
        Node root = null;
        for(int i: arr)
            t2.insert(root, i);
        t2.postOrder(root);
    }
}