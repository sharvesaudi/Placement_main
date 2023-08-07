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
    Node insert(Node head, int x){
        Node temp = head;
        Node newnode = new Node(x);
        if(head==null)
            head = newnode;
        else{
            while(temp.next!=null)
                temp = temp.next;
            temp.next = newnode;
        }
        return head;
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
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    Node reverse(Node head){
        Node newhead = null;
        head = head.next;
        while(head!=null){
            Node next = head.next;
            head.next = newhead;
            newhead = head;
            head = next;
        }
        return newhead;
    }
    int printMiddle(Node head){
        Node slow= head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
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

        // m.display(m.reverse(head));
        // System.out.print(m.printMiddle(head));
    }
}