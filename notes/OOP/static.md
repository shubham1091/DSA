# Static Members
- **Definition**: When a member (variable or method) is declared static, it belongs to the class rather than any instance of the class.
- **Access**: Static members can be accessed before any objects of the class are created and without reference to any object.

#### Static Methods
- **Belonging**: A static method belongs to the class, not to any object.
- **Access**: It can be accessed directly by the class name without needing any object.
- **Data Access**: A static method can access only static data. It cannot access instance variables (non-static data).
- **Calling Other Methods**: A static method can call only other static methods and cannot call non-static methods.
- **Keywords**: A static method cannot refer to `this` or `super` keywords.

#### Example
```java
public class Human {
    String message = "Hello World";

    public static void display(Human human) {
        System.out.println(human.message);
    }

    public static void main(String[] args) {
        Human kunal = new Human();
        kunal.message = "Kunal's message";
        Human.display(kunal);
    }
}
```
- **Explanation**: In the above example, the `display` method is static and can access the non-static `message` variable by explicitly specifying the object reference.

#### Static Blocks
- **Purpose**: Used to initialize static variables. Executed exactly once when the class is first loaded.
- **Example**:
```java
class UseStatic {
    static int a = 3;
    static int b;

    static void meth(int x) {
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    static {
        System.out.println("Static block initialized.");
        b = a * 4;
    }

    public static void main(String args[]) {
        meth(42);
    }
}
```
- **Output**:
```
Static block initialized.
x = 42
a = 3
b = 12
```
- **Explanation**: The static block initializes `b` when the class is loaded, and the `meth` method prints the values of `a`, `b`, and `x`.

#### Static Inner Classes
- **Definition**: Only nested classes can be static.
- **Behavior**: Static inner classes can have static variables.
- **Example**:
```java
public class Static {
    static class Test {
        String name;

        public Test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Kunal");
        Test b = new Test("Rahul");

        System.out.println(a.name); // Kunal
        System.out.println(b.name); // Rahul
    }
}
```
- **Explanation**: The `Test` class is a static nested class and can be instantiated without an instance of the outer class `Static`.

#### Overriding Static Methods
- **Behavior**: Static methods cannot be overridden. Overriding in Java is resolved at runtime based on the type of object, but static methods are resolved at compile time.
- **Static Interface Methods**: Static methods in interfaces are not inherited by implementing classes or sub-interfaces.

### Key Points
- **Static Members**: Belong to the class, not instances.
- **Static Methods**: Can only access static data and methods.
- **Static Blocks**: Used for initializing static variables.
- **Static Inner Classes**: Can exist without an instance of the outer class.
- **Overriding**: Static methods cannot be overridden.
