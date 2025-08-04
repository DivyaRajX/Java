package Basics;

public class basix {
//    public static class Node{
//        int data;   // khud ka data
//        Node next; // agle ka address
//        Node(int data){
//            this.data = data;
//        }
//    }

    public static void main(String[] args) {
        Node a = new Node(51);
        Node b = new Node(52);
        Node c = new Node(54);
        Node d = new Node(59);
        Node e = new Node(58);
        Node f = new Node(56);
        Node g = new Node(53);

        // abhi data sare variables main chlin to gyin h  but connext nhin hain

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;

        //ab a->b->c->d->e->f->g->null
        System.out.println(a.next.data );
    }
}
