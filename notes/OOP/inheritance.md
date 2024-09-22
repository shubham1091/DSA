### Inheritance and the `extends` Keyword

**Defining a Subclass:**
To inherit a class, use the `extends` keyword.

```java
class SubclassName extends SuperclassName {
    // body of class
}
```

- Java does not support multiple inheritance for classes (a class can inherit only one superclass).
- A subclass inherits all non-private members of its superclass but cannot access private members directly.

**Superclass Reference to Subclass Object:**
A superclass variable can reference a subclass object. The type of the reference variable determines accessible members.

```java
Superclass ref = new Subclass(); // ref can only access members defined in Superclass
```

**Using `super`:**

- **Calling Superclass Constructor:**
  ```java
  class BoxWeight extends Box {
      double weight;
      BoxWeight(double w, double h, double d, double m) {
          super(w, h, d); // Call superclass constructor
          weight = m;
      }
  }
  ```
- **Accessing Superclass Members:**
  ```java
  class Subclass extends Superclass {
      void display() {
          super.member; // Access superclass member
      }
  }
  ```

**Example:**

```java
class Box {
    private double width;
    private double height;
    private double depth;

    // Constructor
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // Clone constructor
    Box(Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }
}

class BoxWeight extends Box {
    double weight;

    // Constructor
    BoxWeight(double w, double h, double d, double m) {
        super(w, h, d); // Call superclass constructor
        weight = m;
    }

    // Clone constructor
    BoxWeight(BoxWeight ob) {
        super(ob); // Call superclass clone constructor
        weight = ob.weight;
    }
}
```

- `super()` refers to the closest superclass constructor.
- Constructors are executed in the order of derivation from the base class to the subclass.

**Using `final` with Inheritance:**

- **Creating Constants:**
  ```java
  final int FILE_OPEN = 2;
  ```
- **Preventing Method Overriding:**
  ```java
  class Superclass {
      final void method() {
          // method code
      }
  }
  ```
- **Preventing Inheritance:**
  ```java
  final class Superclass {
      // class code
  }
  ```
  - Declaring a class as `final` prevents it from being subclassed.
  - A `final` class implicitly declares all its methods as `final`.

**Key Points:**

- Static methods are not subject to polymorphism and cannot be overridden.
- Static methods in interfaces must have a body.
- Polymorphism does not apply to instance variables.

This concise overview covers inheritance, the `extends` keyword, `super`, the use of `final` in inheritance, and key inheritance rules in Java.
