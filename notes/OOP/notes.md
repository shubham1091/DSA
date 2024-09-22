# Enumerations in Java

An enumeration is a list of named constants. In Java, an enumeration defines a class type. By making enumerations into classes, the capabilities of the enumeration are greatly expanded.

## Creating an Enumeration

An enumeration is created using the `enum` keyword. Enum declaration can be done outside a class or inside a class but not inside a method. We can declare the `main()` method inside an enum. Hence, we can invoke enum directly from the Command Prompt.

```java
enum Color {
    Red, Blue, Green
}
```

Internally, the above enum `Color` is converted to:

```java
class Color {
    public static final Color Red = new Color();
    public static final Color Blue = new Color();
    public static final Color Green = new Color();
}
```

## Enum and Inheritance

- All enums implicitly extend `java.lang.Enum` class. As a class can only extend one parent in Java, an enum cannot extend anything else.
- An enum cannot be a superclass.
- The `toString()` method is overridden in `java.lang.Enum` class, which returns the enum constant name.
- Enum can implement many interfaces.

Two enumeration constants can be compared for equality by using the `==` relational operator.

## Methods in Enum

### `values()`, `ordinal()`, and `valueOf()` Methods

These methods are present inside `java.lang.Enum`.

- `values()` method can be used to return all values present inside the enum.
- Order is important in enums. By using the `ordinal()` method, each enum constant index can be found, just like an array index.
- `valueOf()` method returns the enum constant of the specified string value, if it exists.

### Enum and Constructor

- Enum can contain a constructor and it is executed separately for each enum constant at the time of enum class loading.
- We can’t create enum objects explicitly and hence we can’t invoke the enum constructor directly.
- The constructor cannot be public or protected; it must have private or default modifiers.
- Why? If we create public or protected, it will allow initializing more than one object. This is totally against the enum concept.

### Enum and Methods

Enum can contain concrete methods only, i.e., no abstract methods.

You can compare for equality an enumeration constant with any other object by using `equals()`, which overrides the `equals()` method defined by `Object`. Although `equals()` can compare an enumeration constant to any other object, those two objects will be equal only if they both refer to the same constant within the same enumeration. Simply having ordinal values in common will not cause `equals()` to return true if the two constants are from different enumerations. Remember, you can compare two enumeration references for equality by using `==`.
