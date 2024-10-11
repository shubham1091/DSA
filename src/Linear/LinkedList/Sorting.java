package Linear.LinkedList;

import Linear.LinkedList.LinkList.Node;

public class Sorting {
    private static LinkList ll = new LinkList();

    public static void main(String[] args) {
        createList();
        System.out.println("Original List: " + ll);
        sort();
        System.out.println("Sorted List: " + ll);
    }

    private static void createList() {
        ll.addLast(8);
        ll.addLast(3);
        ll.addLast(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(9);
        ll.addLast(2);
        ll.addLast(6);
        ll.addLast(7);
    }

    private static void sort() {
        ll.head = mergeSort(ll.head); // Update the head of the list with the sorted list
    }

    /**
     * Sorts the linked list using the Merge Sort algorithm.
     *
     * @param head the head node of the linked list
     * @return the head node of the sorted linked list
     */
    private static Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        // find mid
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow.next;
        slow.next = null;

        Node left = mergeSort(head);
        Node right = mergeSort(mid);

        return merge(left, right);
    }

    /**
     * Merges two sorted linked lists into one sorted linked list.
     *
     * @param left  the head node of the first sorted linked list
     * @param right the head node of the second sorted linked list
     * @return the head node of the merged sorted linked list
     */
    private static Node merge(Node left, Node right) {
        Node newHead = new Node(-1);
        Node temp = newHead;
        while (left != null && right != null) {
            if (left.data <= right.data) {
                temp.next = left;
                left = left.next;
                temp = temp.next;
            } else {
                temp.next = right;
                right = right.next;
                temp = temp.next;
            }
        }

        while (left != null) {
            temp.next = left;
            left = left.next;
            temp = temp.next;
        }

        while (right != null) {
            temp.next = right;
            right = right.next;
            temp = temp.next;
        }

        return newHead.next;
    }
}
