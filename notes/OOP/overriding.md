# Method Overriding

- **Definition**: In a class hierarchy, when a method in a subclass has the same name and type signature as a method in its superclass, the method in the subclass overrides the method in the superclass.
- **Behavior**: When an overridden method is called from within its subclass, it will always refer to the version defined by the subclass. The superclass version is hidden.
- **Conditions**: Method overriding occurs only when the names and type signatures of the two methods are identical. If they are not, the methods are simply overloaded.

### Dynamic Method Dispatch

- **Definition**: Dynamic method dispatch is the mechanism by which a call to an overridden method is resolved at run time, rather than compile time.
- **Importance**: This mechanism is crucial for Java's implementation of run-time polymorphism.
- **Principle**: A superclass reference variable can refer to a subclass object.
- **Behavior**: When an overridden method is called through a superclass reference, Java determines which version of the method to execute based on the type of the object being referred to at the time of the call. This determination is made at run time.
- **Example**: If class B extends class A, you can override a method in A through B, potentially changing the return type of the method to B.

### Additional Note

- **Return Type Covariance**: If B extends A, you can override a method in A in class B and change the return type to B (a feature known as return type covariance).
