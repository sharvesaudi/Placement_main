package Templates;
import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int x){
        data = x;
        left = null;
        right = null;
    }
}
class Tree{
    Node root = null;
    Node insert(int[] arr, int i){
        Node root = null;
        if(i<arr.length){
            root = new Node(arr[i]);
            root.left = insert(arr,2*i+1);
            root.right = insert(arr,2*i+2);
        }
        return root;
    }
    void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }
    void preorder(Node root){
        if(root!=null){
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
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
        Tree tree = new Tree();
        int arr[] = {1,2,3,4,5};
        tree.root = tree.insert(arr,0);
        System.out.println("Preorder traversal:");
        tree.preorder(tree.root);
        System.out.println();
        System.out.println("Inorder traversal:");
        tree.inorder(tree.root);
        System.out.println();
        System.out.println("Postorder traversal:");
        tree.postorder(tree.root);
    }
}