package Templates;

import java.util.Scanner;

public class Queue{
    int front;
    int rear;
    int arr[];

    Queue(int size){
        front = -1;
        rear = -1;
        arr = new int[size];
    }
    
    void enqueue(int data){
        if(rear == -1)
            front++;
        // else if(rear == size-1 || front > rear)
        //      System.out.println("Queue full");
        else
            arr[rear++] = data;
    }

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        Queue que = new Queue(size);
        for (int i=0; i<size; i++)
            que.enqueue(sc.nextInt());
        sc.close();
    }
}