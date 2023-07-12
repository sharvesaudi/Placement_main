// You are using Java
import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node (int x){
        this.data=x;
        this.left=null;
        this.right=null;
    }
}
class Tree{
    Node root=null;
    Node insert(int[] arr,int i){
        Node root=null;
        if(i<arr.length){
            root=new Node(arr[i]);
            root.left=insert(arr,2*i+1);
            root.right=insert(arr,2*i+2);
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
    void preOrder(Node root){
        if(root!=null){
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    void postOrder(Node root){
        if(root!=null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
        }
    }
}
class BTree{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Node root=null;
        int arr[]=new int[5];
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
            // System.out.print(arr[i]);
        }
        Tree t2=new Tree();
        System.out.println("Preorder traversal:");
        t2.root=t2.insert(arr,0);
        t2.preOrder(t2.root);
        System.out.println();
        System.out.println("Inorder traversal:");
        t2.inOrder(t2.root);
        System.out.println();
        System.out.println("Postorder traversal:");
        t2.postOrder(t2.root);
    }
}
