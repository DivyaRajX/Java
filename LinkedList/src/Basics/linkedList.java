package Basics;

public class linkedList {
    private static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class Linklist{
        private int size = 0;
        Node head = null;
        Node tail = null;

        void insertAtEnd(int val){
            Node temp = new Node(val);
            if(head == null) head = temp;
            else tail.next = temp;
            tail = temp;
            size++;
        }

        void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data+"->");
                temp = temp.next;
            }
            System.out.println("null");
            System.out.println();
        }
        void insertAtBeginning(int val){
            Node temp = new Node(val);
            if(head == null){
                head = temp;
                tail = temp;
            }
            else{
//                Node temp2 = head;
//                head = temp;
//                head.next = temp2;

                temp.next = head;
                head = temp;
            }
            size++;
        }

        void insertAt(int idx, int val){
            Node t = new Node(val);
            Node temp = head;
            if(idx == size){
                insertAtEnd(val);
                return;
            }
            if(idx == 0 && head == null) System.out.println("Make the ll first");
            for(int i=0; i< idx-1; i++) temp = temp.next;
            t.next = temp.next;
            temp.next = t; // abhi tail pe data purana hi rhega tail = 5 na ki 90
            size++;
        }

        Node getAt(int idx){
            Node temp = head;
            for(int i=1; i<=idx; i++) temp = temp.next;
            return temp;
        }

        void delAt(int idx){
            if(head == null){
                System.out.println("no element to be able to delete bcz no element is added in list");
                return;
            }
            Node temp = head;
            if(idx == 0){
                temp = temp.next;
                head = temp;
            }
            for(int i=1; i<=idx-1; i++) temp = temp.next;
            temp.next = temp.next.next;
            size--;
        }

        void reverseIterate(){
            if(head == null || head.next == null) return;

            Node prev = head;
            Node curr = head.next;
            while(curr != null){
                Node nextNode = curr.next;
                curr.next = prev;

                //update
                prev = curr;
                curr = nextNode;
            }
            head.next = null;
            head = prev;
        }

        Node reverseRecursively(Node head){
            //Base Case
            if(head == null || head.next == null) return head;
            //Recursive Case
            Node newHead = reverseRecursively(head.next);

            //Self Work
            head.next.next = head;
            head.next = null;

            return newHead;
        }
    }
    public static void main(String[] args) {
        Linklist ll = new Linklist();
        ll.insertAtBeginning(1);

        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.display();

        System.out.println("size of the ll : "+ ll.size);

        ll.insertAtBeginning(7);
        ll.display();

        ll.insertAt(4, 90);
        ll.display();

        System.out.println(ll.size);
        System.out.println(ll.tail.data);



        System.out.println("the data at idx 4 : "+ll.getAt(4));

        ll.delAt(3);
        ll.display();

        ll.reverseIterate();
        ll.display();

        Node head1 = ll.reverseRecursively(ll.head);
        System.out.println(head1.data);
        ll.display();

    }
}
