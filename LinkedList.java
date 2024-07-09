
class Node {
    int data;
    Node next;

    Node(int data1) {
        this.data = data1;
        this.next = null;
    }

};

public class LinkedList {
    public static Node convertArr2LL(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    // length of LL 0(N)
    private static int lengthofLL(Node head) {
        int cnt = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[] arr = { 12, 5, 6, 9 };
        Node head = convertArr2LL(arr);
        System.out.println(head.data);
        // traversal 0(N)
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;

        }
        System.out.println(lengthofLL(head));
    }
}