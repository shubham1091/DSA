# Notes

## Sorting

Arrange in an order

### Bubble sort

larger elements come to the end of array by swapping with adjacent elements

```java
import java.util.Arrays;

public class ClassName {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 1, 3, 2 };
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void bubbleSort(int[] arr) {
        boolean swapped;
        for (int i = 1; i < arr.length; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }

        }
    }

    private static void swap(int[] arr, int i, int j) {
        arr[i] = arr[i] + arr[j];
        arr[j] = arr[i] - arr[j];
        arr[i] = arr[i] - arr[j];
    }
}
```

### Selection sort

pick the smallest from unsorted array and place it at the beginning

```java
import java.util.Arrays;

public class className {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 1, 3, 2, 2 };
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            swapped = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                    swapped = true;
                }
            }
            if (swapped) {
                swap(arr, i, min);
            } else {
                break;
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
```

### Insertion sort

Pick an element from unsorted array and place in the right position in sorted array

```java
import java.util.Arrays;

public class className {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 1, 3, 2, 2 };
        System.out.println(Arrays.toString(arr));
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int prev = i - 1;
            while (prev >= 0 && arr[prev] > current) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = current;
        }
    }

}

```

### Counting sort

- onely positive numbers
- range is small

```java
import java.util.Arrays;

public class className {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 1, 3, 2, 4, 3, 7 };
        countSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void countSort(int[] arr) {
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        int[] countArray = new int[maxValue + 1];
        for (int i = 0; i < arr.length; i++) {
            countArray[arr[i]]++;
        }
        int index = 0;
        for (int i = 0; i < countArray.length; i++) {
            while(countArray[i]-- > 0) {
                arr[index++] = i;
            }
        }
    }
}
```
