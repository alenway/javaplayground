class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class SinglyLinkedList {
    private ListNode head;

    // constructor
    public SinglyLinkedList() {
        this.head = null;
    }

    public void add(int val) {
        ListNode newNode = new ListNode(val);
        if (head == null) {
            head = newNode;
        } else {
            ListNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + "-->");
            current = current.next;
        }
        System.out.println("null");
    }

    public void remove(int val) {
        if (head == null)
            return;

        if (head.val == val) {
            head = head.next;
            return;
        }

        ListNode current = head;
        while (current.next != null && current.next.val != val) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.display();
        list.remove(2);
        list.display();
    }
}
