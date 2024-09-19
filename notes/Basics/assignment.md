# Assignment

## Variables & data types

### Question 1: In a program, input 3 numbers: A, B, and C. You have to output the average of these 3 numbers

> Hint: Average of N numbers is sum of those numbers divided by N

### Question 2: In a program, input the side of square. You have to output the area of the square.

> Hint: Area of square is (side \* side)

### Question 3: Enter cost of 3 items from the user (using float data type) - a pencil, a pen, and a eraser. You have to output the total cost of the items back to the user as their bil.

> Add on: You can also try adding 18% tax to the items in the bill as an advanced problem.

### Question 4: What will be the type of result in the following code?

```java
byte b = 3;
char c = 'a';
short s = 123;
int i = 124;
float f = 3.14f;
double d = 99.999999;

result = (f*b)+(i%c)-(d*s);
```

### Question 5: Will the following statement give any error in java?

```java
int $ = 24;
```

## Conditional Statements

### Question 1: write a java program to get a number from the user and print whther it is posive or negative

### Question 2: Finish the following code so that it prints you have a fever if your temperature is above 100 and otherwise prints you are fine.

```java
public class Assignment {
    public static void main(String[] args) {
        double temp = 103.5;
    }
}
```

### Question 3: Write a java program to input week number (1-7) and print day of week name

### Question 4: What will be the value of x & y in the following code?

```java
public class Assignment {
    public static void main(String[] args) {
        int a=63, b=36;
        boolean x = (a<b)?true:false;
        int y = (a>b)?a:b;
    }
}
```

### Question 5: Write a java program that takes a year from the user and print whether that year is a leap year or not.

> Hint:
>
> ```mermaid
> graph TD
>    A[Is year divisible by 4?] -->|Yes| B[Is year divisible by 100?]
>    A -->|No| E[Not a Leap Year]
>    B -->|Yes| C[Is year divisible by 400?]
>    C -->|Yes| D[Leap Year]
>    B -->|No| D[Leap Year]
>    C -->|No| E[Not a Leap Year]
> ```

## Loops

### Question 1: Write a program that reads a set of integers, and then prints the sum of the even and odd integers

### Question 2: write a program to find the factorial of any number entered by the user

> Hint: factorial of a number n = n*(n-1)*(n-2)*...*1 and exist for positive numbers only

> we write factorial as n!
> so factorial of 0! = 1, 1!=1, 2!=2, 3!=6, 4!=24 and so on

> Note: Please do not confuse factorial with NOT EQUAL TO operator, they are not the same

### Question 3: write a program to print the multiplication table of a number N, entered by the user.

### Question 4: what is wrong in the following code?

```java
public class Assignment {
    public static void main(String[] args) {
        for (int i=0;i<=5;i++){
            System.out.println("i = "+ i );
        }
        system.out.println("i after the loop = "+ i );
    }
}
```

## Functions

### Question 1: Write a java method to compute the average of three numbers

### Question 2: Write a method named isEven that accepts an integer argument. The method should return true if the argument is even, or false otherwise.

> Also write a program to test your code

### Question 3: Write a java program to check if a number is a palindrome in java

> Hint: A palindrome number is a number that reads the same forwards and backwards.
> For example, 121 is a palindrome, but 123 is not.

### Question 4: write a java method to compute the sum of digits in an integer

> Hint: use `%`
