# Recursion

**Combination of:**

- Iteration
- Function

Used in:

- Trees
- Graphs
- Dynamic Programming (DP)

**What is Recursion:**

Using mathematical functions:

f(x) = x^2

Applying the function recursively:

f(f(x)) = (x^2)^2

Example with ( x = 2 ):

1. Calculate f(x):
   f(2) = 2^2 = 4

2. Apply f again:
   f(f(2)) = f(4) = 4^2 = 16

Recursion is a method of solving a computational problem where the solution depends on solutions to `smaller instances of the same problem`.

**Problem** Print numbers from n to 1 (Decreasing order)

code: [Decreasing.java](../../src/Algorithms/Recursion/Decreasing.java)

**call stack**

**Problem** Print numbers from n to 1 (increasing order)
code: [Increasing.java](../../src/Algorithms/Recursion/Increasing.java)

**Problem** Print `factorial` of a number

> formula: n! = n \* (n -1)!

code: [Factorial.java](../../src/Algorithms/Recursion/Factorial.java)

**Problem** Print `sum` of first n natural numbers

code: [NaturalSum.java](../../src/Algorithms/Recursion/NaturalSum.java)

**Problem** print Nth `fibonacci` number.

> 0,1,1,2,3,5,8...
>
> first fibonacci number = 0 second fibonacci number=1

code: [Fibonacci.java](../../src/Algorithms/Recursion/Fibonacci.java)

**problem** check if a given array is `sorted` or not

code: [CheckSorted.java](../../src/Algorithms/Recursion/CheckSorted.java)

**Problem** WAF to find the `first occurence` of an element in an array

example: [8,3,6,9,5,10,2,5,3] key = 5 => idx= 4

code: [Occurance.java](../../src/Algorithms/Recursion/Occurence.java)

**Problem** print x^n

code: [Power.java](../../src/Algorithms/Recursion/Power.java)

**Problem** Tilling Problem: Given a `2 x n` board and tiles of size `2x1`, count the number of ways to tile the given board using the `2x1` tiles.
(A tile can either be placed horizonatlly or vertically)

code: [Tilling.java](../../src/Algorithms/Recursion/Tilling.java)

**Problem** Remove `Duplicates` in a string

> string only contains lower case characters

code: [Duplicates.java](../../src/Algorithms/Recursion/Duplicates.java)

**Problem** `Friends` pairing problem:
Given n friends, each one can remain single or can be baired up with some other friend. Each friend can be paired only once. Find out the total number of ways in which friends can remain single or can be paired up.

code: [Pair.java](../../src/Algorithms/Recursion/Pair.java)

**Problem** `Binary` strings problem:
print all binary strings of size N without consecutinve ones.

code: [BinaryString.java](../../src/Algorithms/Recursion/BinaryString.java)

**Problem** For a given integer array of size N. You have to find all the occurrences (indices) of a given element (key) and print them. use a recursive function to solve this

input: arr[] = {3,2,4,5,6,2,7,2,2} key=2

output: 1 5 7 8

code: [Occurence.java](../../src/Algorithms/Recursion/Occurence.java)

**Problem** your are given a number (eg 2019), convert it into a string of english like "two zero one nine" use a recursive function to solve this problem.

> the digits of the number will only be in the range 0-9 and the last digit of a number can't be 0.

code: [Spell.java](../../src/Algorithms/Recursion/Spell.java)

**Problem** you are given a string S, we need to find the count of all contiguous substrings starting and ending with the same character.

input: S="abcab" output: 7

> There are 15 substrings of "abcab" a, ab, abc, abca, abcab, b, bc, bca, bcab, c, ca, cab, a, ab, b out of the abouve substrings, there are 7 substrings : a, abca, bcab, c, a, and b. So only 7 contiguous substrings start and end wiht the same character

code: []()

**Problem** you have 3 towers and N disks of different sizes which can slide onto any tower. The puzzle starts with disks sorted in ascending order of size from top to bottom (i.e., each disk sits on top of an even larger one).

you have the following constraints:

1. only one disk can be moved at a time
2. A disk is slid off the top of on tower onto another tower.
3. A disk cannot be placed on top of a smaller disk.

write a program to move the disks from the first tower to the last using stacks.
