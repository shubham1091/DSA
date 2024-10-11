package Linear.LinkedList;

import Linear.LinkedList.LinkList.Node;

public class Palindrome {
    private static LinkList ll = new LinkList();

    public static void main(String[] args) {
        createPalindrome();
        System.out.println(checkPalindrome());
        createNonPalindrome();
        System.out.println(checkPalindrome());
    }

    private static void createPalindrome() {
        clearList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(2);
        ll.addLast(1);
    }

    private static void createNonPalindrome() {
        clearList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
    }

    private static void clearList() {
        ll.head = null;
    }

    /**
     * Checks if the linked list is a palindrome.
     *
     * @return true if the list is a palindrome, false otherwise
     */
    private static boolean checkPalindrome() {
        if (ll.head == null || ll.head.next == null) {
            return true;
        }
        // find middle
        Node mid = findMid(ll.head);
        // reverse second half

        Node prev = null;
        Node curr = mid;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = ll.head;

        // check if first half and second half are same
        while (right != null) {
            if (right.data != left.data) {
                return false;
            }
            right = right.next;
            left = left.next;
        }
        return true;
    }

    /**
     * Finds the middle node of the linked list.
     *
     * @param head the head node of the list
     * @return the middle node
     */
    private static Node findMid(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

}
