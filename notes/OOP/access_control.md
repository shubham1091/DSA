### Understanding Access Control in Java

**Access Modifiers:**
Java has four access levels for class members: `public`, `private`, `protected`, and default (no modifier).

**Access Levels:**

| Modifier    | Class | Package | Subclass | Subclass (diff pkg) | World |
| ----------- | ----- | ------- | -------- | ------------------- | ----- |
| `public`    | +     | +       | +        | +                   | +     |
| `protected` | +     | +       | +        | +                   |       |
| `(default)` | +     | +       | +        |                     |       |
| `private`   | +     |         |          |                     |       |

`+` : accessible  
(blank) : not accessible

**Using Access Modifiers:**

- `public`: Accessible everywhere.
- `protected`: Accessible within the same package and by subclasses.
- `Default (no modifier)`: Accessible within the same package.
- `private`: Accessible only within the same class.

**Example:**

```java
// In package packageOne
package packageOne;
public class Base {
    protected void display() {
        System.out.println("in Base");
    }
}

// In package packageTwo
package packageTwo;
public class Derived extends packageOne.Base {
    public void show() {
        new Base().display();       // Not allowed
        new Derived().display();    // Allowed
        display();                  // Allowed
    }
}
```

**Explanation:**

- `new Base().display()`: Not allowed because `Base` is not in the same package and is not a subclass in this context.
- `new Derived().display()`: Allowed because `Derived` is a subclass and can access `protected` members.
- `display()`: Allowed within `Derived` because it inherits `Base`.

**Important Points:**

- `protected` allows access from subclasses and classes in the same package.
- Subclasses can access `protected` members but only through their own instances.
- Accessing `protected` members via a superclass reference outside the package is not allowed.

**Subclass Access:**

- Access is allowed if the object type is the subclass or a subclass of it.
- This ensures the subclass has knowledge and control over its members, maintaining integrity and safety.

**Simplified Rule:**

- If `obj` is of type `S` or its subclass, `S` can access its `protected` members.
- To access a member of a subclass, it may be necessary to cast: `((S)obj).member`.

This concise overview explains access control in Java, focusing on how different access modifiers determine member accessibility within and across packages and subclasses.
