# Arrays

## Introduction

### Defination

List of Elements of the `same` type placed in a `contiguous` memory location.

### creation

#### Operations in arrays

- create
- input
- output
- update

#### Creating an Array

```
dataType arrayName[] = new dataType[size];
```

```java
int marks[] = new int[50];
int[] numbers = {1,2,3};
String[] names = {"John", "Mary", "Tom"};
```

### Input

```java
public class className {
    public static void main(String[] args) {
        int marks[] = new int[5];

        Scanner sc = new Scanner(System.in);

       for(int i=0; i<marks.length; i++){
            marks[i] = sc.nextInt();
       }
       for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i]+" ");
       }
       System.out.println();
       sc.close();
    }
}
```

### Passing arrays as argument

pass by reference value

```java
public class className {
    public static void main(String[] args) {
        int[] marks = {1,2,3,4,5};
        display(marks);
        update(marks);
        display(marks);

    }

    static void update(int[] marks){
        for(int i=0; i<marks.length; i++){
            marks[i]+=1;
        }
    }

    static void display(int[] marks){
        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i]);
        }
        System.out.println();
    }
}
```

## Linear search

find the index of element in a given array

| 0   | 1   | 2   | 3   | 4   | 5   | 6   | 7   |
| --- | --- | --- | --- | --- | --- | --- | --- |
| 2   | 4   | 6   | 8   | 10  | 12  | 14  | 16  |

key = 10

```java
public class className {
    public static int linearSearch(int[] arr, int key){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] numbers = {2,4,6,8,10,12,14,16};
        int key = 10;
        System.out.println("key is at index: "+linearSearch(numbers, key));
    }

}
```

## Binary Search

prerequisite: array is sorted

| 0   | 1   | 2   | 3   | 4   | 5   | 6   | 7   |
| --- | --- | --- | --- | --- | --- | --- | --- |
| 2   | 4   | 6   | 8   | 10  | 12  | 14  | 16  |

key = 10

```java
public class className {
    // assuming array is sorted in ascending order
    public static int binarySearch(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = { 2, 4, 6, 8, 10, 12, 14, 16 };
        int key = 10;
        System.out.println("key is at index: " + binarySearch(numbers, key));
    }
}
```
