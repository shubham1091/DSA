package Linear.LinkedList;

import Linear.LinkedList.LinkList.Node;

public class Cycle {
    private static LinkList ll = new LinkList();

    public static void main(String[] args) {
        createCycle();
        if (detectCycle()) {
            System.out.println("Cycle detected");
            removeCycle();
        }
        System.out.println("cycle removed");
        System.out.println(ll);
    }

    private static void createCycle() {
        ll.head = new Node(1);
        Node temp = new Node(2);
        ll.head.next = temp;
        ll.head.next.next = new Node(3);
        ll.head.next.next.next = new Node(4);
        ll.head.next.next.next.next = new Node(5);
        ll.head.next.next.next.next.next = temp;
    }

    /**
     * Detects if there is a cycle in the linked list.
     *
     * @return true if there is a cycle, false otherwise
     */
    private static boolean detectCycle() {
        Node slow = ll.head;
        Node fast = ll.head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    /**
     * Removes the cycle in the linked list if it exists.
     */
    private static void removeCycle() {
        Node slow = ll.head;
        Node fast = ll.head;
        boolean cycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                cycle = true;
                break;
            }
        }
        if (!cycle) {
            return;
        }
        slow = ll.head;
        Node prev = null;
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        prev.next = null;
    }

}
