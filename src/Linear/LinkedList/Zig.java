package Linear.LinkedList;

import Linear.LinkedList.LinkList.Node;

public class Zig {
    private static LinkList ll = new LinkList();

    public static void main(String[] args) {
        createList();
        System.out.println(ll);
        zigZag();
        System.out.println(ll);
    }

    private static void createList() {
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
    }

    private static void zigZag() {
        // find mid
        Node slow = ll.head;
        Node fast = ll.head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node mid = slow;

        // reverse second half
        Node curr = mid.next;
        mid.next = null;

        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // zig-zag merge
        Node left = ll.head;
        Node right = prev;
        Node nextL, nextR;
        while (left != null && right != null) {
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }
    }
}
