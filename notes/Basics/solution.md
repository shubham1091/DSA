# Solution

## Variables & data types

### Solution 1:

```java
import java.util.Scanner;
public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        float avg = (A+B+C)/3;
        System.out.println("Average is: "= avg);
        sc.close();
    }
}
```

### Solution 2:

```java
import java.util.Scanner;
public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int side = sc.nextInt();
        int area = side*side;
        System.out.println("Area is: "= area);
        sc.close();
    }
}
```

### Solution 3:

```java
import java.util.Scanner;
public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();

        float totalCost = pencil + pen + eraser;
        System.out.println("Total cost is: "+ totalCost);

        // add on with 18% tax
        float tax = totalCost + (totalCost * 0.18);
        System.out.println("Bill with 18% tax: "+ tax);

        sc.close();
    }
}
```

## Conditional statements

### Solution 1:

```java
public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        if(number > 0){
            System.out.println("Number is positive");
        }else{
            System.out.println("Number is negative");
        }
        sc.close();
    }
}
```

### Solution 2:

```java
public class Solution{
    public static void main(String[] args) {
        double temp = 103.5;
        if(temp > 100){
            System.out.println("You have a fever");
        }else{
            System.out.println("You are fine");
        }
    }
}
```

### Solution 3:

```java
public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 7: ");
        int day = sc.nextInt();
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }
}
```

### Solution 4:

value of x = false & y = 63

### Solution 5:

```java
public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        boolean x = (year % 4 == 0);
        boolean y = (year % 100 !== 0);
        boolean z = ((year%100==0) && (year%400==0));

        if(x&&(y||z)){
            System.out.println("Leap year");
        }else{
            System.out.println("Not a leap year");
        }
    }
}
```

## loops

### solution 1:

```java
public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int evenSum, oddSum;
        while(true){
            System.out.print("Enter an integer: ");
            int number = sc.nextInt();
            if(number%2==0){
                evenSum += number;
            }else{
                oddSum += number;
            }
            System.out.print("Do you want to continue? (y/n): ");
            char choice = sc.next().charAt(0);
            if(choice=='n'){
                break;
            }
        }

        sysout.println("Even sum: "+ evenSum);
        sysout.println("Odd sum: "+ oddSum);
        sc.close();
    }
}
```

### solution 2:

```java
public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sysout.print("Enter a number: ");
        int number = sc.nextInt();
        double factorial = 1;
        for(int i=1; i<=number; i++){
            factorial *= i;
        }
        System.out.println("Factorial of "+ number +" is: "+ factorial);
        sc.close();
    }
}
```

### solution 3:

```java
public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        for(int i=1; i<=number; i++){
            System.out.println(i+" * "+n+" = "+ (i*number));
        }
        sc.close();
    }
}
```

## Function

### solution 1:

```java
public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        system.out.println("average is: "+ average(a,b,c));
        sc.close();
    }

    public static double average(int a, int b, int c){
        return (a+b+c)/3;
    }
}
```

### solution 2:

```java
public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ")
        int number = sc.nextInt();
        if(isEven(number)){
            System.out.println("Number is even");
        }else{
            System.out.println("Number is odd");
        }

        if(isEven(88)== true){
            System.out.println("code is correct");
        }else{
            System.out.println("code is incorrect");
        }
        sc.close();

    }

    public static void test(){
        if(isEven(10)== true){
            System.out.println("code is correct");
        }else{
            System.out.println("code is incorrect");
        }
    }

    public static boolean isEven(int number){
        return number%2==0;
    }
}
```

### solution 3:

```java
public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        if(isPalindrome(number)){
            System.out.println("It is a palindrome");
        }else{
            System.out.println("It is not a palindrome");
        }
        sc.close()
    }

    public static boolean isPalindrome(int number){
        int original = number;
        int reverse = 0;
        while(number>0){
            reverse = reverse*10 + (number%10);
            number /=10;
        }
        return original==reverse;
    }
}
```

### solution 4:
```java
public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        int sum = DigitSum(number);
        System.out.println("Digit sum is: "+ sum);
        sc.close();
    }

    public static int DigitSum(int number){
        int sum = 0;
        while(number != 0){
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
```