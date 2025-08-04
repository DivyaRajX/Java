package SinglyLL;

public class del {
    static void print(Node head){
        if(head == null) return;
        System.out.print(head.data+" ");
        print(head.next);
    }
    static Node conversion(int[] arr){
        if(arr.length == 0) return null;
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    static Node delHead(Node head){
        if(head == null) return null;
        return head.next;
    }

    static Node delTail(Node head){
        if(head == null || head.next == null) return null;
        Node temp = head;
        while(temp != null){
            if(temp.next.next == null) break;
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    static Node delAtKth(Node head, int k){
        if(head == null) return null;
        if(head.next == null){
            if (k == 1) return null;
            return null;
        }
        Node temp = head;
        int count = 1;
        while(temp != null){
            if(count == k-1){
                temp.next = temp.next.next;
            }
            temp = temp.next;
            count++;
        }return head;
    }
    // Delete kth Node from last
    static Node delFromLast(Node head, int k){
        //if the head is null or rhe
        if(head == null || (head.next == null && k == 1)) return null;
        Node fast = head, slow = head;
        for (int i = 0; i < k; i++) fast = fast.next;
        if(fast == null) return head.next;
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,8,9,10};
        Node head = conversion(arr);
        // Actual
        System.out.print("Orignal LL : ");
        print(head);
        System.out.println();

        //Delting the head
        System.out.print("LL after removing the head : ");
        print(delHead(head));
        System.out.println();

        //Deleting the tail
        System.out.print("LL after removing the tail : ");
        print(delTail(head));
        System.out.println();

        //Deleting at kth
        System.out.print("Deleting the kth Node in LL : ");
        print(delAtKth(head, 3));
        System.out.println();

        //Deleting kth
        System.out.print("Deleting the Kth Element from last: ");
        print(delFromLast(head,6));
    }
}
