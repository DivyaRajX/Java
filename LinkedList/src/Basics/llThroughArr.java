package Basics;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}

public class llThroughArr {
    static void display(Node head){
        if(head == null) return;
        System.out.println(head.data);
        display(head.next);
    }
    static void conversion(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        System.out.println(head.next.next.data);
        display(head);

    }
    public static void main(String[] args) {
        int[] arr = {2,4,5,1,3};
        conversion(arr);

    }
}
