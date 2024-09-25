# Arraylist

## introduction to arraylist

| Array                              | ArrayList                                     |
| ---------------------------------- | --------------------------------------------- |
| fixed size                         | dynamic size                                  |
| primitive data types can be stored | primitive data types can't be stored directly |

```java
import java.util.ArrayList;
public class className {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
    }
}
```

## Operations

- Add Element O(1)
  ```java
  list.add(data);
  list.add(idx,data); // O(n)
  ```
- Get Element O(1)
  ```java
  list.get(idx);
  ```
- Remove Element O(n)
  ```java
  list.remove(idx);
  ```
- Set Element at index O(n)
  ```java
  list.set(idx,data);
  ```
- contains Element O(n)
  ```java
  list.contains(data);
  ```
- size
  ```java
  list.size();
  ```

**Problem** print reverse of an arraylist

list: 1,2,3,4,5

code: [ReverseList.java](../../../src/Linear/ArrayList/ReverseList.java)

**Problem** find maximum in an arraylist

list: 2,5,9,3,6

code: [MaxList.java](../../../src/Linear/ArrayList/MaxList.java)

**Problem** swap 2 numbers

list: 2,5,9,3,6 index: 1,3

code: [SwapListElement.java](../../../src/Linear/ArrayList/SwapListElement.java)

Sorting an arraylist

```java …
import java.util.ArrayList;
import java.util.Collections;

public class className {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);
        System.out.println(list);
        Collections.sort(list);// ascending
        // Collections.sort(list,Collections.reverseOrder());// descending
        System.out.println(list);
    }
}
```

**Problem** for given n lines on x-axis, use 2 lines to form a container such that it holds maximum water.

height: [1,8,6,2,5,4,8,3,7]

code: [WaterContainer.java](../../../src/Linear/ArrayList/WaterContainer.java)

**problem** Find if any pair in a sorted arraylist has a target sum

list: [1,2,3,4,5,6] target: 5

code: [FindPairSum.java](../../../src/Linear/ArrayList/FindPairSum.java)

**Problem** Find if any pair in a sorted & rotated arraylist has a target sum

list: [11,15,6,8,9,10] tartet=16

code: [FindPairSumRotated.java](../../../src/Linear/ArrayList/FindPairSumRotated.java)