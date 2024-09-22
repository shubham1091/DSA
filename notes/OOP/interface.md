### Interfaces in Java

**Multiple Inheritance through Interfaces:**
Java does not support multiple inheritance with classes to avoid ambiguity when two classes have the same method signature. Instead, Java provides interfaces which allow a class to inherit multiple abstract methods from different sources.

**Defining an Interface:**

```java
interface MyInterface {
    void method1(); // implicitly public and abstract
    int MY_CONSTANT = 10; // implicitly public, static, and final
}
```

- Methods in an interface are by default `public` and `abstract`.
- Variables in an interface are by default `public`, `static`, and `final`.

**Implementing an Interface:**
A class that implements an interface must provide implementations for all its methods.

```java
class MyClass implements MyInterface {
    public void method1() {
        // method body
    }
}
```

- The methods implementing an interface must be declared `public`.

**Multiple Interfaces:**
A class can implement multiple interfaces.

```java
interface InterfaceA {
    void methodA();
}

interface InterfaceB {
    void methodB();
}

class MyClass implements InterfaceA, InterfaceB {
    public void methodA() {
        // method body
    }

    public void methodB() {
        // method body
    }
}
```

**Interface Reference Variables:**
You can use an interface type to declare a reference variable. Any instance of a class that implements the interface can be assigned to that reference variable.

```java
InterfaceA obj = new MyClass(); // MyClass implements InterfaceA
obj.methodA();
```

- The method to be executed is determined at runtime, enabling dynamic method resolution.

**Default Methods:**
Interfaces can have methods with a default implementation. This allows the interface to evolve without breaking existing implementations.

```java
interface MyInterface {
    void existingMethod();

    default void newMethod() {
        System.out.println("This is a default method.");
    }
}

class MyClass implements MyInterface {
    public void existingMethod() {
        // implementation
    }
}
```

**Static Methods in Interfaces:**
Static methods can be defined in interfaces, but they are not inherited by classes that implement the interface.

```java
interface MyInterface {
    static void staticMethod() {
        System.out.println("This is a static method.");
    }
}

class MyClass implements MyInterface {
    // Cannot override staticMethod
}
```

**Nested Interfaces:**
An interface can be declared within a class or another interface. Such an interface is called a nested interface.

```java
class OuterClass {
    public interface NestedInterface {
        boolean isNotNegative(int x);
    }
}

class MyClass implements OuterClass.NestedInterface {
    public boolean isNotNegative(int x) {
        return x >= 0;
    }
}

class Demo {
    public static void main(String[] args) {
        OuterClass.NestedInterface ni = new MyClass();
        System.out.println(ni.isNotNegative(10)); // true
        System.out.println(ni.isNotNegative(-12)); // false
    }
}
```

**Extending Interfaces:**
An interface can extend another interface, inheriting its methods.

```java
interface InterfaceA {
    void methodA();
}

interface InterfaceB extends InterfaceA {
    void methodB();
}

class MyClass implements InterfaceB {
    public void methodA() {
        // implementation
    }

    public void methodB() {
        // implementation
    }
}
```

**Rules and Notes:**

- **Overriding Methods:** When overriding methods, the access modifier must be the same or more accessible. For example, if a method in the parent class is `protected`, the overriding method must be `protected` or `public`.
- **Avoiding Ambiguities:** In cases where a class implements two interfaces with conflicting default methods, the class must override the conflicting method to resolve the ambiguity.
- **Static Methods in Interfaces:** Must have a body and cannot be overridden or inherited.

This comprehensive guide covers the use of interfaces in Java, highlighting their differences from classes, their syntax, and various key features.
