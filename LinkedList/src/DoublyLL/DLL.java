package DoublyLL;

public class DLL {
    static void print(Node head){
        if(head == null){
            System.out.println();
            return;
        }
        System.out.print(head.data+" ");
        print(head.next);
    }
    static Node conversion(int[] arr){
        Node head = new Node(arr[0]);
        Node prev = head;
        for (int i = 1; i < arr.length-1; i++) {
            Node temp = new Node(arr[i], null, prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }

    // Deletion prt

    static Node delHead(Node head){
        head.next = new Node(head.next.data, head.next.next, null);
        return head.next;
    }

    static Node delTail(Node head){
        Node tail = head;
        while(tail.next != null) tail = tail.next;
        Node newTail =  tail.prev;
        newTail.next = null;
        tail.prev = null;
        return head;
    }

    static Node delKth(Node head, int k){
        if(head == null || head.next == null) return null;

        // if k == 1 and pointing towards the head the kth element
        else if(k == 1) return delHead(head);
        Node temp = head;
        int count = 1;
        while(temp != null){
            // if the kth is not tail
            if(count == k && temp.next != null){
                Node temp1 = temp.next;
                temp1.prev = temp.prev;
                temp.prev.next = temp1;
            }
            // if kth is tail
            else if(temp.next == null && k == count) return delTail(head);
            temp = temp.next;
            count++;
        }return head;
    }
    //Delete kth elemem
    // Reverse DLL
    static Node reverse(Node head){
        if(head == null || head.next == null) return head;
        Node current = head;
        Node prev = null;

        while(current != null){
            prev = current.prev;
            current.prev = current.next;
            current.next = prev;
            current = current.prev;
        }
            return prev.prev;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,4,6,7,8,9};
        Node head = conversion(arr);
        System.out.print("Orignal : ");
        print(head);
//        print(delTail(head));
//        print(delKth(head,5));
        print(reverse(head));

    }
}
