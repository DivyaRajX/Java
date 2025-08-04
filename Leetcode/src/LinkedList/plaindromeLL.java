package LinkedList;

public class plaindromeLL {
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
    static Node revere(Node head){
        Node temp = head;
        Node prev = temp;
        Node curr = temp.next;
        while(curr != null){
            Node nextNode = curr.next;

            curr.next = prev;

            prev = curr;
            curr = nextNode;
        }
        temp.next = null;
        temp = prev;
        return temp;
    }

    static Node rvrseRec(Node head){
        if(head == null || head.next == null) return head;
        Node newHead = rvrseRec(head.next);

        head.next.next = head;
        head.next = null;
        return newHead;
    }

    static boolean ispal(Node head){
        Node fast = head;
        Node slow = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast =  fast.next.next;
        }
        Node newHead = rvrseRec(slow.next);
        Node sec = newHead;
        Node first = head;
        while(sec != null){
            if(first.data != sec.data){
                rvrseRec(sec);
                return false;
            }
            sec = sec.next;
            first = first.next;
        }
        rvrseRec(newHead);
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,1};
        Node head = conversion(arr);

        System.out.println(ispal(head));
    }
}
