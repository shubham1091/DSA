# Packages in Java

**Purpose and Benefits:**

- **Namespace Management:** Packages help in compartmentalizing the class name space, allowing you to create classes with names that might otherwise conflict with classes in other packages.
- **Visibility Control:** Packages act as a naming and visibility control mechanism.

**Creating a Package:**

- To create a package, use the `package` keyword followed by the package name:
  ```java
  package MyPackage;
  ```

**File System Storage:**

- Java uses file system directories to store packages. The directory name must match the package name exactly and is case-sensitive.
- For example, classes in `MyPackage` must be stored in a directory named `MyPackage`.

**Package Hierarchy:**

- A package hierarchy must be reflected in the file system. For example:
  ```java
  package java.awt.image;
  ```
  This package must be stored in `java\awt\image` on a Windows system.

**Locating Packages:**
The Java run-time system locates packages using three methods:

1. **Current Working Directory:** By default, the Java run-time system starts looking in the current working directory.
2. **CLASSPATH Environment Variable:** You can specify directory paths by setting the `CLASSPATH` environmental variable.
3. **-classpath Option:** Use the `-classpath` option with `java` and `javac` to specify the path to your classes.

**Importing Packages:**

- When a package is imported, only the items declared as `public` within the package will be available to non-subclasses in the importing code.

### Example:

To declare a package and store it correctly:

1. **Declare the package in your Java file:**
   ```java
   package MyPackage;
   ```
2. **Store the file in a directory named `MyPackage`:**
   ```
   MyPackage/
       MyClass.java
   ```

### Important Considerations:

- **Case Sensitivity:** The directory name must match the package name exactly, including case.
- **Renaming Packages:** Renaming a package requires renaming the directory in which the classes are stored.
