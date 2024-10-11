package Linear.LinkedList;

/**
 * A simple implementation of a doubly linked list.
 */
public class DoublyLinkedList {
    public DNode head;
    public DNode tail;
    private int count = 0;

    /**
     * Adds a new node with the specified data at the beginning of the list.
     *
     * @param data the data to add
     */
    public void addFirst(int data) {
        DNode newNode = new DNode(data);
        this.count++;
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    /**
     * Adds a new node with the specified data at the end of the list.
     *
     * @param data the data to add
     */
    public void addLast(int data) {
        DNode newNode = new DNode(data);
        this.count++;
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
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
        if (position < 0 || position > this.count) {
            throw new IndexOutOfBoundsException("Position out of bounds");
        }

        DNode newNode = new DNode(data);
        this.count++;

        if (position == 0) {
            addFirst(data);
            return;
        }

        if (position == this.count - 1) {
            addLast(data);
            return;
        }

        int idx = 0;
        DNode temp = head;
        while (idx < position - 1) {
            idx++;
            temp = temp.next;
        }

        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next = newNode;
    }

    /**
     * Returns a string representation of the list.
     *
     * @return a string representation of the list
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("null");
        DNode temp = head;
        while (temp != null) {
            sb.append(temp.data).append("<->");
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
        return this.count;
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
        if (head != null) {
            head.prev = null;
        } else {
            tail = null;
        }
        this.count--;
        return data;
    }

    /**
     * Removes the last node of the list.
     *
     * @return the data of the removed node
     * @throws IndexOutOfBoundsException if the list is empty
     */
    public int removeLast() {
        if (tail == null) {
            throw new IndexOutOfBoundsException("List is empty");
        }
        int data = tail.data;
        tail = tail.prev;
        if (tail != null) {
            tail.next = null;
        } else {
            head = null;
        }
        this.count--;
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
        if (position < 0 || position >= this.count) {
            throw new IndexOutOfBoundsException("Position out of bounds");
        }
        if (position == 0) {
            return removeFirst();
        }
        if (position == this.count - 1) {
            return removeLast();
        }
        int idx = 0;
        DNode temp = head;
        while (idx < position) {
            idx++;
            temp = temp.next;
        }
        int data = temp.data;
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
        this.count--;
        return data;
    }

    /**
     * Searches for the given key in the list.
     *
     * @param key the key to search for
     * @return the position of the key if found, -1 otherwise
     */
    public int search(int key) {
        DNode temp = head;
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
    public int recursiveSearch(DNode hd, int key) {
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
        DNode temp = null;
        DNode current = head;

        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }

        if (temp != null) {
            head = temp.prev;
        }
    }

    /**
     * Removes the nth node from the end of the list.
     *
     * @param n the position from the end (1-based index)
     * @return the data of the removed node
     */
    public int removeFromLast(int n) {
        int idxFromStart = this.size() - n;
        return removeAt(idxFromStart);
    }

    /**
     * A node in the doubly linked list.
     */
    protected class DNode {
        int data;
        DNode next;
        DNode prev;

        public DNode(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
}
