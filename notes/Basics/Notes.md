# Java Basics

## boilerplate code

```java
// the className should be same as the file name
// public is a keyword that makes the class accessible from other classes
// class is a keyword that defines a class
public class className {
    // this statememt will always going to be same no matter what you write in the main method
    // this is the first method that gets executed when you run the program

    // static is a keyword that makes the method accessible from other classes without creating an object

    // void is a keyword that defines a method that does not return anything

    // main is a keyword that defines the main method

    // args is a keyword that holds the command line arguments
    public static void main(String[] args) {
        // body of the main method
    }
}
```

## Output in Java

```java
System.out.print("Hello World");
System.out.println("Hello World"); // with new line
```
[App.java](../../src/App.java)

## Variables in Java

```java
dataType variableName = value;
```

### Data Types in Java

1 bytes = 8 bits
1 bit = 0 or 1

- Primitive Data Types
  - int (4 bytes)
  - double (8 bytes )
  - char (2 bytes )
  - boolean (1 byte )
  - float (4 bytes )
  - long (8 bytes )
  - short (2 bytes )
  - byte (1 byte {-128 to 127})
  - void (nothing)
- Non-Primitive Data Types
  - String
  - Array
  - Class
  - Object
  - interface
  - etc...

## Comments in Java

```java
//This is a single line comment
/*
This is a
multiline comment
*/
```

## input in Java

`next`, `nextLine`, `nextInt`, `nextByte`, `nextFloat`, `nextDouble`, `nextBoolean`, `nextShort`, `nextLong` etc...

```java
import java.util.Scanner;
//or
// import java.util.*;
public class className {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello " + name);

        sc.close();
    }
}
```

## Type conversion in Java

implicit or widening conversion

`conversion` happens when:

- type compatible
- destination type > source type

byte -> short -> int -> float -> long -> double

## Type casting in Java

explicit or narrowing conversion

```java
int marks = (int) (99.99f);
```

## Type `Promotion` in Expressions

1. Java automatically promotes each byte, short, or char operand to int when evaluating an expression
2. If one operand is long, float, or double the whole expression is promoted to long, float, or double respectively

---

## `Operators` in Java

Symbol that tell compiler to perform some operation

```
sum = a + b
```

a and b = operands

`+` = operator expression

`Types` of operators

- Arithmetic operators (binary/ unary)
- Relational operators
- Logical operators
- Assignment operators
- Bitwise operators [we will discuss later]

### Arithmetic Operators

| Binary | Unary |
| ------ | ----- |
| +      | ++    |
| -      | --    |
| \*     |       |
| \\     |       |
| %      |       |

### Relational Operators

`==`, `!=`, `>`, `<`, `>=`, `<=`

### Logical Operators

- `&&` (Logical AND)
- `||` (Logical OR)
- `!` (Logical NOT)

## Operator Precedence

operator precedence determines the order in which the operators in an expression are evaluated.

for example: int x = 3 \* 4 - 1;

in the above example, the valude of x will be 11, not 9. This happens because the precedence of `*` operator is higher than `-` operator. That is why the expression is evaluated as (3*4)-1 and no 3 * (4-1)

### Precedence table

| Operators                                 | Precedence                                  |
| ----------------------------------------- | ------------------------------------------- |
| Postfix increment and decrement           | `++` `--`                                   |
| Prefix increment and decrement, and unary | `++` `--` `+` `-` `~` `!`                   |
| multiplicative                            | `*` `/` `%`                                 |
| additive                                  | `+` `-`                                     |
| shift                                     | `<<` `>>` `>>>>`                            |
| relational                                | `<` `>` `<=` `>=` `instanceof`              |
| equality                                  | `==` `!=`                                   |
| bitwise AND                               | `&`                                         |
| bitwise exclusive OR                      | `^`                                         |
| bitwise inclusive OR                      | `\|`                                        |
| logical AND                               | `&&`                                        |
| logical OR                                | `\|\|`                                      |
| ternary                                   | `?:`                                        |
| assignment                                | `=` `!=` `<<=` `>>=` `>>>=` `&=` `^=` `\|=` |

### Associativity of Operators

If an expression has two operators with similar precedence, the expression evaluated according to its `associativity` (either left to right or right to left).

| Operators                                 | Associativity |
| ----------------------------------------- | ------------- |
| postfix increment and decrement           | lr            |
| prefix increment and decrement, and unary | rl            |
| multiplicative                            | lr            |
| additive                                  | lr            |
| shift                                     | lr            |
| relational                                | lr            |
| equality                                  | lr            |
| bitwise AND                               | lr            |
| bitwise exclusive OR                      | lr            |
| bitwise inclusive OR                      | lr            |
| logical AND                               | lr            |
| logical OR                                | lr            |
| ternary                                   | rl            |
| assignment                                | rl            |

## Conditional statements

- if,else
- else if
- ternary operator
- switch

### if else

```java
if (condition) {
    // code to be executed if the condition is true
} else {
    // code to be executed if the condition is false
}
```

### if else if

```java
if (condition1) {
    // code to be executed if the condition1 is true
} else if (condition2) {
    // code to be executed if the condition2 is true
} else {
    // code to be executed if none of the conditions are true
}
```

### ternary operator

```java
condition ? expression1 : expression2
```

[Condition.java](../../src/Basics/Condition.java)

### switch

```java
switch (expression) {
    case value1:
        // code to be executed if expression is equal to value1
        break;
    case value2:
        // code to be executed if expression is equal to value2
        break;
    default:
        // code to be executed if expression is not equal to any of the values
}
```
[Switch.java](../../src/Basics/Switch.java)

## Loops (flow control)

### while loop

```java
while (condition) {
    // code to be executed while the condition is true
}
```

print sum of first n natural numbers

```java
public class Cls {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int i = 1;
        int sum = 0;
        while(i<=n){
            sum+=i;
            i++;
        }
        System.out.println(sum);
        sc.close();
    }
}
```

### for loop

```java
for (initialization; condition; update) {
    // code to be executed while the condition is true
}
```

print reverse of number

```java
public class Cls {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int reverse = 0;
        int temp = n;
        while (temp != 0) {
            int lastDigit = temp % 10;
            reverse = reverse * 10 + lastDigit;
            temp /= 10;
        }
        System.out.println(reverse);
        sc.close();
    }
}
```

### do-while loop

```java
do{
    // do something
}while(condition);
```

[Loops.java](../../src/Basics/Loops.java)

[CountNums.java](../../src/Basics/CountNums.java)

[Fibonachi.java](../../src/Basics/Fibonachi.java)

[Reverse.java](../../src/Basics/Reverse.java)

### Break statement

to exit the loop

Keep entering numbers till user enters a multiple of 10

```java
public class Cls {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            system.out.println(n);
            if(n%10==0) break;
        }while(true);

        sc.close();
    }

}
```

### Continue statement

to skip an iteration

Display all numbers entered by user except multiples of 10

```java
public class Cls {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            if(n%10 ==0) continue;
            System.out.println(n);
        }while(true);

        sc.close();
    }
}
```

[Prime.java](../../src/Basics/Prime.java)

## Function / Method

block of code with a specific purpose. It can be called multiple times with different parameters.

### Syntax

```
returnType methodName(parameterType parameterName) {
    // body of the method

    return
}
```

### what happens in memory

when we call a function it creates a memory block inside of stack and initialize all the variables inside the block after the function finish the memroy block gets deleted

### Function overloading

Multiple functions with the same name but different parameters

there are two ways to solve do this 

- using parameters
- using data type

### Scop 

- block 
- method

[Binomial.java](../../src/Basics/Binomial.java)

[Convert.java](../../src/Basics/Convert.java)
