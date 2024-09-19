# 2D arrays

## creating 2d array

```java
public class className{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[][] matrix = new int[3][3];

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

    }
}
```

## Representing a 2D array

|     |     |     |
| --- | --- | --- |
|     |     |     |
| --- | --- | --- |
|     |     |     |
| --- | --- | --- |
|     |     |     |

## search

### code: [LinearSearch.java](../../../../src/Linear/Arrays/ND/LinearSearch.java)

## Spiral Matrix

input: matrix

|     |     |     |
| --- | --- | --- |
| 1   | 2   | 3   |
| 4   | 5   | 6   |
| 7   | 8   | 9   |

output: 1,2,3,6,9,8,7,4,5

### code: [PrintSpiral.java](../../../../src/Linear/Arrays/ND/PrintSpiral.java)

## Diagonal sum

### code: [DiagonalSum.java](../../../../src/Linear/Arrays/ND/DiagonalSum.java)

## Search in Sorted Matrix
### code: [BinarySearch.java](../../../../src/Linear/Arrays/ND/BinarySearch.java)