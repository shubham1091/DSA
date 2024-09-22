# Understanding Classes and Objects in Java

**Classes and Objects:**

- **Class:** A template for creating objects. It defines a new data type.
- **Object:** An instance of a class. Objects occupy memory and have a physical reality.

**Object Properties:**

1. **State:** The data values of the object.
2. **Identity:** The unique address in memory where the object is stored.
3. **Behavior:** The methods that define the object's operations.

**Creating Objects:**

- **Syntax:**
  ```java
  Box mybox; // Declare reference to object
  mybox = new Box(); // Allocate memory for the object
  ```
  - `mybox` is declared as a reference to a `Box` object.
  - `new Box()` allocates memory for the object and returns a reference to it.

**The `new` Keyword:**

- Allocates memory dynamically at runtime for an object.
- The reference to the allocated memory is stored in the variable.

**Primitive Types vs. Objects:**

- Primitive types (e.g., `int`, `char`) are not objects and are implemented as regular variables for efficiency.

**Object References:**

- Assigning one object reference to another does not create a new object. Both references point to the same object.
  ```java
  Box b1 = new Box();
  Box b2 = b1; // b1 and b2 refer to the same object
  ```
