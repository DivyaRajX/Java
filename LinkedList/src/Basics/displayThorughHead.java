package Basics;

public class displayThorughHead {
    public static void display(Node head){
        Node temp = head;
        while(temp.next != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void display_r(Node head){
        if(head == null) return;
//        display_r(head.next);
//        System.out.print(head.data+" ");   revers

        System.out.print(head.data+" ");
        display_r(head.next);
    }
    public static void main(String[] args) {
        Node a = new Node(51);
        Node b = new Node(52);
        Node c = new Node(54);
        Node d = new Node(59);
        Node e = new Node(58);
        Node f = new Node(56);
        Node g = new Node(53);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        //display(a);
        display_r(a);
    }
}
