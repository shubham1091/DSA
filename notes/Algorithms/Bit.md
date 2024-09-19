# Bit Manipulation

## Binary Number System

- **Decimal to Binary**: Convert decimal numbers to binary (e.g., 4)
- **Binary to Decimal**: Convert binary numbers to decimal (e.g., 100)

## Bit-wise Operators

- **Binary AND**: &
- **Binary OR**: |
- **Binary XOR**: ^
- **Binary One's Complement**: ~
- **Binary Left Shift**: <<
- **Binary Right Shift**: >>

### Binary AND &

**Rules**

| A   | B   | A & B |
| --- | --- | ----- |
| 0   | 0   | 0     |
| 0   | 1   | 0     |
| 1   | 0   | 0     |
| 1   | 1   | 1     |

**Example**

5 & 6

5 = 0101, 6 = 0110

Result = 0100 = 4

**Code**: [And.java](../../src/Algorithms/Bit/And.java)

### Binary OR |

**Rules**

| A   | B   | A \| B |
| --- | --- | ------ |
| 0   | 0   | 0      |
| 0   | 1   | 1      |
| 1   | 0   | 1      |
| 1   | 1   | 1      |

**Example**

5 | 6

5 = 0101, 6 = 0110

Result = 0111 = 7

**Code**: [Or.java](../../src/Algorithms/Bit/Or.java)

### Binary XOR ^

**Rules**

| A   | B   | A ^ B |
| --- | --- | ----- |
| 0   | 0   | 0     |
| 0   | 1   | 1     |
| 1   | 0   | 1     |
| 1   | 1   | 0     |

**Example**

5 ^ 6

5 = 0101, 6 = 0110

Result = 0011 = 3

**Code**: [Xor.java](../../src/Algorithms/Bit/Xor.java)

### Binary One's Complement ~

**Rules**

| A   | ~A  |
| --- | --- |
| 0   | 1   |
| 1   | 0   |

**Example**

~5

5 = 00000101 (in 8-bit representation)

~5 = 11111010 (in 8-bit representation)

Result = -6 (in 2's complement form)

**Explanation**:

- To find the 2's complement of a number, first find the 1's complement and then add 1.
- For 5 (00000101), the 1's complement is 11111010.
- Adding 1 to 11111010 gives 11111011, which is -6 in 2's complement form.

**Code**: [Complement.java](../../src/Algorithms/Bit/Complement.java)

### Binary Left Shift <<

**Rules**

5 << 2

5 = 00000101 -> 00010100 = 20

> Formula: a << b = a \* (2^b)

**Code**: [Left.java](../../src/Algorithms/Bit/Left.java)

### Binary Right Shift >>

**Rules**

6 >> 1

6 = 00000110 -> 00000011 = 3

> Formula: a >> b = a / (2^b)

**Code**: [Right.java](../../src/Algorithms/Bit/Right.java)

## Questions

### Question 1

Check if a number is odd or even

**Solution**: [OddEven.java](../../src/Algorithms/Bit/OddEven.java)

> **Operations**: Get ith bit, Set ith bit, Clear ith bit
>
> **Code**: [Operations.java](../../src/Algorithms/Bit/Operations.java)

### Question 2

Update ith bit to 0 or 1

**Solution**: [Update.java](../../src/Algorithms/Bit/Update.java)

### Question 3

Clear last i bits

**Example**: n = 1111, i = 2 => 1100

**Solution**: [Clear.java](../../src/Algorithms/Bit/Clear.java)

### Question 4

Clear range of bits

**Example**: n = 100111010011 (2515), i = 2, j = 7 => 100100000011 (2307)

**Solution**: [RangeClear.java](../../src/Algorithms/Bit/RangeClear.java)

### Question 5

Check if a number is a power of 2 or not

**Solution**: [PowerOfTwo.java](../../src/Algorithms/Bit/PowerOfTwo.java)

### Question 6

Count set bits in a number

**Solution**: [CountBits.java](../../src/Algorithms/Bit/CountBits.java)
