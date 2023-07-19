class Node{
    int data;
    Node left;
    Node right;
    Node(){
        left = null;
        right = null;
    }
    Node(int d){
        data = d;
        left = null;
        right = null;
    }
}
class Tree{
    Node insert(Node root, int d){
        if(root==null){
            Node n = new Node(d);
            return n;
        }
        if(d<root.data){
            root.left = insert(root, d);
        }
        else{
            root.right = insert(root, d);
        }
        return root;
    }
    void inOrder(Node root){
        if(root!=null){
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }
    }
}
public class BSearcb {
    public static void main(String[] args){
        int[] arr = {8,5,3,1,5,10,12,11};
        Tree t = new Tree();
        Node root = null;
        for(int i: arr){
            if(root == null)
                root = t.insert(root, i);
            else    
                t.insert(root, i);
        }
        t.inOrder(root);
    }
}
