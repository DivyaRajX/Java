package SinglyLL;

public class insert {
    static void display(Node head){
        while(head == null) {
            System.out.println();
            return;
        }
        System.out.print(head.data+" ");
        display(head.next);
    }
    static Node conversion(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    static Node insertAtHead(Node head, int data){
        return new Node(data, head);
    }

    static Node insertAtTail(Node head, int data){
        Node temp = head;
        while(temp.next != null) temp = temp.next;
        temp.next = new Node(data, null);
        return head;
    }
    public static void main(String[] args) {
        int[] arr = {2,63,6,7,3};
        Node head = conversion(arr);
        display(head);

        display(insertAtHead(head, 90));
        display(insertAtTail(head, 89));
    }
}
