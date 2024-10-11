package Linear.LinkedList;

/**
 * A simple implementation of a singly linked list.
 */
public class LinkList {
    public Node head;
    public Node tail;
    private int count = 0;

    /**
     * Adds a new node with the specified data at the beginning of the list.
     *
     * @param data the data to add
     */
    public void addFirst(int data) {
        Node newNode = new Node(data);
        count++;
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    /**
     * Adds a new node with the specified data at the end of the list.
     *
     * @param data the data to add
     */
    public void addLast(int data) {
        Node newNode = new Node(data);
        count++;
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    /**
     * Inserts a new node with the specified data at the given position in the list.
     *
     * @param data     the data to add
     * @param position the position to insert the new node at (0-based index)
     * @throws IndexOutOfBoundsException if the position is out of bounds
     */
    public void insert(int data, int position) {
        if (position < 0) {
            throw new IndexOutOfBoundsException("Position cannot be negative");
        }

        Node newNode = new Node(data);
        count++;

        if (position == 0) {
            newNode.next = head;
            head = newNode;
            if (tail == null) {
                tail = newNode;
            }
            return;
        }

        int idx = 0;
        Node temp = head;
        while (idx < position - 1 && temp != null) {
            idx++;
            temp = temp.next;
        }

        if (temp == null) {
            throw new IndexOutOfBoundsException("Position out of bounds");
        }

        newNode.next = temp.next;
        temp.next = newNode;

        if (newNode.next == null) {
            tail = newNode;
        }
    }

    /**
     * Returns a string representation of the list.
     *
     * @return a string representation of the list
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node temp = head;
        while (temp != null) {
            sb.append(temp.data).append("->");
            temp = temp.next;
        }
        sb.append("null");
        return sb.toString();
    }

    /**
     * Returns the size of the list.
     *
     * @return the size of the list
     */
    public int size() {
        return count;
    }

    /**
     * Removes the first node of the list.
     *
     * @return the data of the removed node
     * @throws IndexOutOfBoundsException if the list is empty
     */
    public int removeFirst() {
        if (head == null) {
            throw new IndexOutOfBoundsException("List is empty");
        }
        int data = head.data;
        head = head.next;
        count--;
        if (head == null) {
            tail = null;
        }
        return data;
    }

    /**
     * Removes the last node of the list.
     *
     * @return the data of the removed node
     * @throws IndexOutOfBoundsException if the list is empty
     */
    public int removeLast() {
        if (head == null) {
            throw new IndexOutOfBoundsException("List is empty");
        }
        if (head.next == null) {
            int data = head.data;
            head = null;
            tail = null;
            count--;
            return data;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        int data = temp.next.data;
        temp.next = null;
        tail = temp;
        count--;
        return data;
    }

    /**
     * Removes the node at the specified position in the list.
     *
     * @param position the position of the node to remove (0-based index)
     * @return the data of the removed node
     * @throws IndexOutOfBoundsException if the position is out of bounds
     */
    public int removeAt(int position) {
        if (position < 0 || position >= count) {
            throw new IndexOutOfBoundsException("Position out of bounds");
        }
        if (position == 0) {
            return removeFirst();
        }
        if (position == count - 1) {
            return removeLast();
        }
        int idx = 0;
        Node temp = head;
        while (idx < position - 1) {
            idx++;
            temp = temp.next;
        }
        int data = temp.next.data;
        temp.next = temp.next.next;
        count--;
        return data;
    }

    /**
     * Searches for the given key in the list.
     *
     * @param key the key to search for
     * @return the position of the key if found, -1 otherwise
     */
    public int search(int key) {
        Node temp = head;
        int position = 0;
        while (temp != null) {
            if (temp.data == key) {
                return position;
            }
            temp = temp.next;
            position++;
        }
        return -1; // Key not found
    }

    /**
     * Recursively searches for the given key in the list.
     *
     * @param hd  the head node to start the search from
     * @param key the key to search for
     * @return the position of the key if found, -1 otherwise
     */
    public int recursiveSearch(Node hd, int key) {
        if (hd == null) {
            return -1;
        }
        if (hd.data == key) {
            return 0;
        }
        int idx = recursiveSearch(hd.next, key);
        if (idx != -1) {
            return idx + 1;
        }
        return -1;
    }

    /**
     * Reverses the linked list.
     */
    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;
    }

    /**
     * Removes the nth node from the end of the list.
     *
     * @param n the position from the end (1-based index)
     * @return the data of the removed node
     */
    public int removeFromLast(int n) {
        int idxFromstart = this.size() - n;
        return removeAt(idxFromstart);
    }

    /**
     * A node in the linked list.
     */
    protected static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}
