# Linked list

what is a linked list?

A linked list is a data structure that consists of a sequence of nodes where each node contains a data field and a reference(link) to the next node in the sequence.

```java
class Node {
    dataType data;
    Node next;

    public Node(dataType data) {
        this.data = data;
        this.next = null;
    }
}
```

## Operations

### add in linked list

- [add first](../../../src/Linear/LinkedList/LinkList.java)
- [add last](../../../src/Linear/LinkedList/LinkList.java)
- [add at position](../../../src/Linear/LinkedList/LinkList.java)

### Remove in linked list

- [remove first](../../../src/Linear/LinkedList/LinkList.java)
- [remove last](../../../src/Linear/LinkedList/LinkList.java)
- [remove at position](../../../src/Linear/LinkedList/LinkList.java)

code: [LinkeList.java](../../../src/Linear/LinkedList/LinkList.java)

**Problem**
Search for a key in a linked list. Return the position where it is found. if not found, return -1.

code: [search](../../../src/Linear/LinkedList/LinkList.java)

code: [recursiveSearch](../../../src/Linear/LinkedList/LinkList.java)

**Problem**
Reverse a linked list.

code: [](../../../src/Linear/LinkedList/LinkList.java)

**Problem**
Find and remove nth node from end

code: [](../../../src/Linear/LinkedList/LinkList.java)

**Problem**
check if linkedlist is palindrome

**Problem** detect cycle in linkedlist

**Problem** remove cycle in linkedlist

**Problem** for a linked list fo the form :L(1)->L(2)->L(3)->L(4)...L(n-1)->L(n) convert it into a `zig-zag` form i.e: L(1)->L(n)->L(2)->L(n-1)->L(3)->L(n-2)...L(4)->L(n-3)


# Doubly linked list

what is a doubly linked list?

A doubly linked list is a data structure that consists of a sequence of nodes where each node contains a data field and a reference(link) to the next node in the sequence.

```java
class Node {
    dataType data;
    Node next;
    Node prev;
    public Node(dataType data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
```
