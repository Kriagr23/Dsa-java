class Node {
    int data;
    Node next;

    Node(int data1) {
        this.data = data1;
        this.next = null;
    }
}

public class deletionLL {

    // Method to remove the head of the linked list
    private static Node removesHead(Node head) {
        if (head == null) {
            return head;
        }
        head = head.next;
        return head;
    }

    // Method to remove the tail of the linked list
    public static Node removesTail(Node head) {
        if (head == null || head.next == null)
            return null;
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    // Method to remove kth position element
    public static Node removeK(Node head, int k) {
        if (head == null)
            return head;
        if (k == 1) {
            Node temp = head;
            head = head.next;
            return head;
        }
        int cnt = 0;
        Node temp = head;
        Node prev = null;
        while (temp != null) {
            cnt++;
            if (cnt == k) {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    // Method to remove el
    public static Node removeEl(Node head, int el) {
        if (head == null)
            return head;
        if (head.data == el) {
            Node temp = head;
            head = head.next;
            return head;
        }

        Node temp = head;
        Node prev = null;
        while (temp != null) {

            if (temp.data == el) {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    // Method to create a linked list from an array
    private static Node createLinkedList(int[] arr) {
        if (arr.length == 0) {
            return null;
        }
        Node head = new Node(arr[0]);
        Node current = head;
        for (int i = 1; i < arr.length; i++) {
            current.next = new Node(arr[i]);
            current = current.next;
        }
        return head;
    }

    // Method to print the linked list
    private static void printLinkedList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 3, 6, 2, 9, 0, 1 };
        Node head = createLinkedList(arr);
        // head = removesHead(head);
        // head = removesTail(head);
        // head = removeK(head, 3);
        // head = removeEl(head, 3);

        printLinkedList(head);
    }
}
