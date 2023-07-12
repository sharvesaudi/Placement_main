package Templates;

class Node{
    int data;
    Node next;
    Node(){
        next = null;
    }
    Node(int x){
        data = x;
        next = null;
    }
}

public class LinkedList{
    void insert(Node head, int x){
        Node temp = head;
        Node newnode = new Node(x);
        while(temp.next!=null)
            temp = temp.next;
        temp.next = newnode;
    }
    void deleteLast(Node head, int x){
        if(head.next == null )
            head = null;
        else{
            Node curr = head, prev = null;
            while(curr.next!=null){
                prev = curr;
                curr = curr.next;
            }
            prev.next = null;
        }
    }
    void display(Node head){
        Node temp = head.next;
        while(temp.next!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println(temp.data);
    }
}
class Main{
    public static void main(String [] args) {
        
        Node head = new Node();
        LinkedList m = new LinkedList();

        m.insert(head, 10);
        m.insert(head, 20);
        m.insert(head, 30);
        m.display(head);
    }
}