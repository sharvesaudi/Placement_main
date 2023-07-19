
class Node{
    int data;
    Node left,right;
    Node(){
        left = null;
        right = null;
        
    }
    Node(int d){
        data = d;
        left = null;
        right =null;
    }
}

class Binarytree{
    Node insert(Node root,int d){
        
        if(root == null){
            Node newnode = new Node(d);
            root = newnode;
        }
        else{
            Node temp = root;
            if(temp.left!= null && temp.right!=null)
                temp.left = insert(temp.left,d);
            
            else if(temp.left!=null)
                temp.right = insert(temp.right,d);
            
            else
                temp.left =  insert(temp.left,d);
        }
        return root;
    }
    
    void preorder(Node root){
        if(root!=null){
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
        
    }
    void inorder(Node root){
        if(root != null){
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
        
    }
    void postorder(Node root){
        if(root!=null){
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }
    }
}

class BTree{
    
    public static void main(String[] args){
        Binarytree bt = new Binarytree(); 
        Node root = null;
        int[] arr = {27,5,6,0,2,9};
        for(int i: arr){
            if(root==null){
                root = new Node(i);
            }
            else{
              bt.insert(root,i);
            }
        }
        System.out.println("Preorder traversal:");
        bt.preorder(root);
        System.out.println();
        System.out.println("Inorder traversal:");
        bt.inorder(root);
        System.out.println();
        System.out.println("Postorder traversal:");
        bt.postorder(root);
    }
    
}