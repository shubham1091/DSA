# Backtracking

- dicision
- optimization
- Enumeration

### Bcktracking - arrays

```java
import java.util.Arrays;
public class className{
    public static void main(String[] args){
        int[] arr = new int[5];
        backtrack(arr,0);
        System.out.println(Arrays.toString(arr));

    }

    private static void backtrack(int[]arr, int i){
        // base case
        if(i==arr.length){
            return;
        }
        arr[i]=i+1;// work
        backtrack(arr,i+1); // recursion
        arr[i]-=2;// backtrack
    }
}
```

**Problem** Find & print all `subsets` of a given string

code: [Subsets.java](../../src/Algorithms/Backtracking/Subsets.java)

**Problem** Find & print all `permutations` of a string

code: [Permutations.java](../../src/Algorithms/Backtracking/Permutations.java)

**Problem** place N queens on an NxN chessboard such that no 2 queens can attack each other

code: [Queen.java](../../src/Algorithms/Backtracking/Queen.java)

**Problem** Fing number of ways to reach from (0,0) to (N-1,N-1) in a NxM Grid. Allowed moves=>right or down

**Problem** Write a function to complete a `sudoku`

|     |     |     |     |     |     |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- |
| -   | -   | 8   | -   | -   | -   | -   | -   | -   |
| 4   | 9   | -   | 1   | 5   | 7   | -   | -   | 2   |
| -   | -   | 3   | -   | -   | 4   | 1   | 9   | -   |
| 1   | 8   | 5   | -   | 6   | -   | -   | 2   | -   |
| -   | -   | -   | -   | 2   | -   | -   | 6   | -   |
| 9   | 6   | -   | 4   | -   | 5   | 3   | -   | -   |
| -   | 3   | -   | -   | 7   | 2   | -   | -   | 4   |
| -   | 4   | 9   | -   | 3   | -   | -   | 5   | 7   |
| 8   | 2   | 7   | -   | -   | 9   | -   | 1   | 3   |

code: [Sudoku.java](../../src/Algorithms/Backtracking/Sudoku.java)

**Problem**
you are given a starting position for a rat which is stuck in a maze at an initial point (0,0)(the maze can be thought of as a 2d plane). The maze would be given in the form of a square matrix of order N\*N where the cells with value 0 represent the maze's blocked locaktion while value 1 is the open/available path that tht rat can take to reach its destination the rat's destinations is at (N-1,N-1).

Your task is to find all the possible paths that the rat can take to rach from source to destination in the maze.

The possible directions that it can take to move in the maze are 'U'(up) i.e. (x,y-1),'D' (down) i.e. (x,y+1), 'L' (left)i.e.(x-1,y),'R'(right)i.e. (x+1,y).

code: [Maze.java](../../src/Algorithms/Backtracking/Maze.java)

**Problem**Given a string containing difits from 2-9 inclusive, print all possible letter combinations that the number could represent. You can print the answer in any order.

A mapping of digits to letters (just like on the telephone button ) is given below. Note that 1 does not map to any letters.

code:[Combinations.java](../../src/Algorithms/Backtracking/Combinations.java)

**Problem** Given a N\*N board with knight placed on the first block of an empty board. Moving according to the rules of chess, knights must visit each square exactly once. print the order of each cell in which they are visited.

code: [Knights.java](../../src/Algorithms/Backtracking/Knights.java)
