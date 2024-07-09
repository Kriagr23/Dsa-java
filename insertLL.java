
class Node {
    int data;
    Node next;

    Node(int data1) {
        this.data = data1;
        this.next = null;
    }
}

public class insertLL {
    // Insert a new node on head position
    private static Node insertHead(Node head, int val) {

        Node temp = new Node(val);
        temp.next = head; // Link the new node to the current head
        return temp; // Return the new node as the new head

    }

    // Insert a new node on tail position
    private static Node insertTail(Node head, int val) {
        if (head == null) {
            return new Node(val);
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node newNode = new Node(val);
        temp.next = newNode;
        return head;
    }

    // k= position el = value
    private static Node insertPosition(Node head, int el, int k) {
        if (head == null) {
            if (k == 1) {
                return new Node(el);
            } else {
                return head;
            }
        }
        if (k == 1) {
            Node newNode = new Node(el);
            newNode.next = head;
            return newNode;
        }
        int cnt = 0;
        Node temp = head;
        while (temp != null) {
            cnt++;
            if (cnt == k - 1) {
                Node x = new Node(el);
                x.next = temp.next;
                temp.next = x;
                break;
            }
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
    private static void print(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 6, 2, 0, 9 };
        Node head = createLinkedList(arr);
        // head = insertHead(head, 100);
        // head = insertTail(head, 100);
        head = insertPosition(head, 100, 1);
        print(head);
    }
}
