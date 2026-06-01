# Java DSA: Comprehensive Revision Notes
**Complete Guide to Data Structures & Algorithms in Java**

---

## Table of Contents
1. [Introduction](#introduction)
2. [Part 1: Java Fundamentals](#part-1-java-fundamentals)
3. [Part 2: Core Data Structures](#part-2-core-data-structures)
4. [Part 3: Algorithms](#part-3-algorithms)
5. [Part 4: Advanced Topics](#part-4-advanced-topics)
6. [Key Takeaways & Best Practices](#key-takeaways--best-practices)

---

## Introduction

### What are Data Structures and Algorithms?

**Data Structure:** A way to organize and store data efficiently in memory.
- Determines how fast we can access, modify, or delete data
- Examples: Arrays, Linked Lists, Trees, Graphs, Hash Tables

**Algorithm:** A step-by-step procedure to solve a problem.
- Determines how efficiently we solve a problem
- Measured by Time Complexity (how fast) and Space Complexity (how much memory)

### Why Does it Matter?
- **Efficiency:** Good DSA choices make programs run faster
- **Scalability:** Programs handle large datasets without crashing
- **Problem-Solving:** DSA teaches logical thinking and optimization

### Time & Space Complexity Basics
| Notation | Name | Example |
|----------|------|---------|
| O(1) | Constant | Accessing array element by index |
| O(log n) | Logarithmic | Binary Search |
| O(n) | Linear | Simple Loop |
| O(n log n) | Linearithmic | Merge Sort, Quick Sort |
| O(n²) | Quadratic | Nested Loops (Bubble Sort) |
| O(2^n) | Exponential | Recursive Fibonacci |

---

# PART 1: JAVA FUNDAMENTALS

## 1. Variables and Data Types

### What are Variables?
A variable is a named container that stores a value in memory.

```java
// Syntax: dataType variableName = value;
int age = 25;
String name = "Shree";
double salary = 50000.50;
boolean isStudent = true;
```

### Primitive Data Types (8 types in Java)

| Data Type | Size | Range | Default Value |
|-----------|------|-------|----------------|
| byte | 1 byte | -128 to 127 | 0 |
| short | 2 bytes | -32,768 to 32,767 | 0 |
| int | 4 bytes | -2^31 to 2^31-1 | 0 |
| long | 8 bytes | -2^63 to 2^63-1 | 0L |
| float | 4 bytes | Decimal (up to ~7 digits) | 0.0f |
| double | 8 bytes | Decimal (up to ~15 digits) | 0.0d |
| char | 2 bytes | Unicode character (0-65535) | '\u0000' |
| boolean | 1 bit | true or false | false |

### Key Concepts
- **Type Casting:** Converting one data type to another
  - Widening (automatic): `int x = 5; long y = x;` (small → large)
  - Narrowing (manual): `long x = 5L; int y = (int)x;` (large → small, risk of data loss)
  
- **Constants:** Use `final` keyword to create immutable variables
  ```java
  final int MAX_STUDENTS = 100; // Cannot be changed
  ```

### Best Practices
1. Use meaningful variable names (`studentAge` not `a`)
2. Initialize variables before using them
3. Use appropriate data types (don't use `double` for integers)
4. Use `final` for values that shouldn't change

---

## 2. Operators

### What are Operators?
Operators are symbols used to perform operations on variables and values.

### Types of Operators

#### A. Arithmetic Operators
```java
int a = 10, b = 3;
System.out.println(a + b);  // Addition: 13
System.out.println(a - b);  // Subtraction: 7
System.out.println(a * b);  // Multiplication: 30
System.out.println(a / b);  // Division: 3 (integer division)
System.out.println(a % b);  // Modulus (Remainder): 1
System.out.println(a + b * 2);  // Follows BODMAS: 16
```

#### B. Relational Operators (Return boolean)
```java
int a = 10, b = 5;
System.out.println(a > b);   // Greater than: true
System.out.println(a < b);   // Less than: false
System.out.println(a >= b);  // Greater or equal: true
System.out.println(a <= b);  // Less or equal: false
System.out.println(a == b);  // Equal to: false
System.out.println(a != b);  // Not equal: true
```

#### C. Logical Operators (Return boolean)
```java
boolean x = true, y = false;
System.out.println(x && y);  // AND: false (both must be true)
System.out.println(x || y);  // OR: true (at least one must be true)
System.out.println(!x);      // NOT: false (reverses boolean)
```

#### D. Assignment Operators
```java
int a = 5;
a += 3;   // a = a + 3;  →  a = 8
a -= 2;   // a = a - 2;  →  a = 6
a *= 2;   // a = a * 2;  →  a = 12
a /= 4;   // a = a / 4;  →  a = 3
a %= 2;   // a = a % 2;  →  a = 1
```

#### E. Unary Operators
```java
int a = 5;
System.out.println(++a);   // Pre-increment: 6 (increment then use)
System.out.println(a++);   // Post-increment: 6 (use then increment)
System.out.println(--a);   // Pre-decrement: 6
System.out.println(a--);   // Post-decrement: 6
```

#### F. Bitwise Operators (Work with binary representation)
```java
int a = 5;      // 0101
int b = 3;      // 0011

System.out.println(a & b);   // AND: 1 (0001)
System.out.println(a | b);   // OR: 7 (0111)
System.out.println(a ^ b);   // XOR: 6 (0110)
System.out.println(~a);      // NOT: -6 (flips all bits)
System.out.println(a << 1);  // Left Shift: 10 (multiply by 2)
System.out.println(a >> 1);  // Right Shift: 2 (divide by 2)
```

### Operator Precedence (BODMAS)
1. Parentheses `()`
2. Exponentiation (not directly in Java)
3. Unary operators `++`, `--`, `!`, `~`
4. Multiplication `*`, Division `/`, Modulus `%`
5. Addition `+`, Subtraction `-`
6. Bitwise Shift `<<`, `>>`
7. Relational `<`, `>`, `<=`, `>=`
8. Equality `==`, `!=`
9. Bitwise AND `&`
10. Bitwise XOR `^`
11. Bitwise OR `|`
12. Logical AND `&&`
13. Logical OR `||`
14. Assignment `=`, `+=`, `-=`, etc.

---

## 3. Conditional Statements

### What are Conditional Statements?
They allow your program to make decisions and execute different code based on different conditions.

### A. if Statement
Executes code if a condition is TRUE.

```java
if (condition) {
    // Execute if condition is true
}

// Example
int age = 18;
if (age >= 18) {
    System.out.println("You can vote");
}
```

### B. if-else Statement
Executes one block if true, another if false.

```java
if (condition) {
    // Execute if true
} else {
    // Execute if false
}

// Example
int marks = 45;
if (marks >= 40) {
    System.out.println("Pass");
} else {
    System.out.println("Fail");
}
```

### C. if-else if-else Statement
Test multiple conditions.

```java
if (condition1) {
    // Execute if condition1 is true
} else if (condition2) {
    // Execute if condition2 is true
} else if (condition3) {
    // Execute if condition3 is true
} else {
    // Execute if all above are false
}

// Example: Grade System
int marks = 75;
if (marks >= 90) {
    System.out.println("Grade A");
} else if (marks >= 80) {
    System.out.println("Grade B");
} else if (marks >= 70) {
    System.out.println("Grade C");
} else {
    System.out.println("Grade F");
}
```

### D. Switch Statement
More efficient than multiple if-else for checking a single variable.

```java
switch (variable) {
    case value1:
        // Execute if variable == value1
        break;
    case value2:
        // Execute if variable == value2
        break;
    default:
        // Execute if no case matches
}

// Example: Day Identifier
int day = 3;
switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday");
        break;
    default:
        System.out.println("Unknown day");
}
```

### E. Ternary Operator
A concise way to write simple if-else.

```java
// Syntax: condition ? valueIfTrue : valueIfFalse
int age = 20;
String status = (age >= 18) ? "Adult" : "Minor";
System.out.println(status);  // Output: Adult
```

### Best Practices
1. Use `switch` instead of multiple `if-else if` for better readability
2. Use ternary operator for simple conditions
3. Don't forget `break` in switch statements
4. Use meaningful condition names

---

## 4. Loops (Flow Control)

### Why Loops?
Loops allow you to execute a block of code repeatedly without writing it multiple times.

### A. While Loop
Executes code while a condition is TRUE.

```java
// Syntax
while (condition) {
    // Code executes as long as condition is true
    // Update: Usually change a variable to avoid infinite loop
}

// Example: Print numbers 1 to 5
int i = 1;
while (i <= 5) {
    System.out.println(i);
    i++;  // Must update i to eventually make condition false
}
// Output: 1 2 3 4 5

// Example: Sum of first N natural numbers
int n = 5;
int sum = 0, num = 1;
while (num <= n) {
    sum += num;
    num++;
}
System.out.println(sum);  // Output: 15
```

### B. For Loop
Used when you know exactly how many times you want to loop.

```java
// Syntax: for (initialization; condition; increment/decrement) { }
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
// Output: 1 2 3 4 5

// Example: Multiplication table
int num = 5;
for (int i = 1; i <= 10; i++) {
    System.out.println(num + " x " + i + " = " + (num * i));
}
```

### C. Do-While Loop
Executes code at least ONCE, then checks condition.

```java
// Syntax
do {
    // Code executes at least once
} while (condition);

// Example
int i = 1;
do {
    System.out.println(i);
    i++;
} while (i <= 5);
// Output: 1 2 3 4 5
// Even if condition was false initially, it executes once!
```

### D. For-Each Loop (Enhanced For Loop)
Used to iterate through arrays and collections.

```java
int[] numbers = {10, 20, 30, 40};
for (int num : numbers) {
    System.out.println(num);
}
// Output: 10 20 30 40

// Example: Sum of array
int[] arr = {2, 4, 6, 8};
int sum = 0;
for (int num : arr) {
    sum += num;
}
System.out.println(sum);  // Output: 20
```

### Loop Control Statements

#### Break Statement
Exits the loop immediately.

```java
for (int i = 1; i <= 10; i++) {
    if (i == 5) {
        break;  // Loop stops when i = 5
    }
    System.out.println(i);
}
// Output: 1 2 3 4
```

#### Continue Statement
Skips the current iteration and goes to the next one.

```java
for (int i = 1; i <= 5; i++) {
    if (i == 3) {
        continue;  // Skips printing 3
    }
    System.out.println(i);
}
// Output: 1 2 4 5
```

### Key Concepts

**Prime Number Check using sqrt optimization:**
```java
public static boolean isPrime(int n) {
    if (n <= 1) return false;
    
    // Only check up to sqrt(n)
    // If n = 100, we check up to 10
    // This is because factors come in pairs
    for (int i = 2; i * i <= n; i++) {
        if (n % i == 0) {
            return false;
        }
    }
    return true;
}

// Why sqrt(n)?
// For number 36: factors are (1,36), (2,18), (3,12), (4,9), (6,6)
// After 6 (sqrt of 36), pairs repeat. So we only need to check till 6.
```

### Best Practices
1. Use `for` loop when iteration count is known
2. Use `while` loop for unknown iteration count
3. Use `for-each` when iterating through collections
4. Avoid infinite loops
5. Use meaningful loop variable names

---

## 5. Functions & Methods

### What are Functions/Methods?
A function is a reusable block of code that performs a specific task.

**Benefits:**
- Reduces code repetition (DRY principle)
- Makes code organized and readable
- Easy to test and debug
- Promotes code reuse

### Method Syntax
```java
public static returnType methodName(parameters) {
    // Method body
    return value;  // If return type is not void
}
```

### Components Explained
- **public:** Accessible from anywhere
- **static:** Can be called without creating object instance
- **returnType:** What the method returns (int, String, void, etc.)
- **methodName:** Name of the method (should be descriptive)
- **parameters:** Inputs to the method

### Examples

#### Method with No Parameters, No Return Value
```java
public static void greet() {
    System.out.println("Hello World!");
}

greet();  // Calling the method
// Output: Hello World!
```

#### Method with Parameters, No Return Value
```java
public static void printSum(int a, int b) {
    System.out.println("Sum: " + (a + b));
}

printSum(5, 3);  // Output: Sum: 8
```

#### Method with Parameters and Return Value
```java
public static int multiply(int a, int b) {
    return a * b;
}

int result = multiply(4, 5);
System.out.println(result);  // Output: 20
```

#### Method for Checking Prime Number
```java
public static boolean isPrime(int n) {
    if (n <= 1) {
        return false;
    }
    
    for (int i = 2; i * i <= n; i++) {
        if (n % i == 0) {
            return false;  // Not prime
        }
    }
    return true;  // Prime
}

System.out.println(isPrime(7));   // Output: true
System.out.println(isPrime(10));  // Output: false
```

### Method Overloading
Same method name with different parameters.

```java
public static int add(int a, int b) {
    return a + b;
}

public static double add(double a, double b) {
    return a + b;
}

public static int add(int a, int b, int c) {
    return a + b + c;
}

System.out.println(add(5, 3));        // Calls first: 8
System.out.println(add(5.5, 3.2));    // Calls second: 8.7
System.out.println(add(5, 3, 2));     // Calls third: 10
```

### Variable Scope

**Local Variables:** Declared inside a method, accessible only within that method.
```java
public static void test() {
    int x = 10;  // Local variable
    System.out.println(x);  // OK
}
System.out.println(x);  // ERROR: x is not accessible here
```

**Global/Class Variables:** Declared at class level, accessible everywhere.
```java
public class Main {
    static int globalVar = 20;  // Can be used anywhere in class
    
    public static void test() {
        System.out.println(globalVar);  // OK
    }
}
```

### Best Practices
1. Keep methods small and focused (do one thing)
2. Use descriptive names (`calculateTotal()` not `calc()`)
3. Use meaningful parameter names
4. Document what method does (use comments for complex logic)
5. Avoid too many parameters (more than 4 is a code smell)

---

# PART 2: CORE DATA STRUCTURES

## 6. Arrays

### What is an Array?
An array is a collection of elements of the same data type stored in contiguous memory locations.

**Characteristics:**
- Fixed size (cannot grow or shrink after creation)
- Index-based (access elements by position, starting from 0)
- Fast access (O(1) time complexity)
- Slow insertion/deletion (need to shift elements)

### Array Declaration and Initialization

```java
// Declaration and initialization
int[] arr1 = {1, 2, 3, 4, 5};

// Declaration with size
int[] arr2 = new int[5];  // Size 5, all elements 0

// Declaration and then assignment
int[] arr3;
arr3 = new int[]{10, 20, 30};

// Alternative syntax
int arr4[] = {5, 10, 15};

// 2D Array
int[][] matrix = {{1, 2}, {3, 4}, {5, 6}};
```

### Common Array Operations

#### Finding Minimum and Maximum
```java
public static int findMin(int[] arr) {
    int min = arr[0];
    for (int i = 1; i < arr.length; i++) {
        if (arr[i] < min) {
            min = arr[i];
        }
    }
    return min;
}

public static int findMax(int[] arr) {
    int max = arr[0];
    for (int i = 1; i < arr.length; i++) {
        if (arr[i] > max) {
            max = arr[i];
        }
    }
    return max;
}

int[] numbers = {3, 7, 2, 9, 1};
System.out.println(findMin(numbers));  // Output: 1
System.out.println(findMax(numbers));  // Output: 9
```

#### Reverse an Array
```java
public static void reverseArray(int[] arr) {
    int left = 0, right = arr.length - 1;
    while (left < right) {
        // Swap
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        left++;
        right--;
    }
}

int[] arr = {1, 2, 3, 4, 5};
reverseArray(arr);
// arr is now {5, 4, 3, 2, 1}
```

#### Check for Duplicates
```java
public static boolean hasDuplicates(int[] arr) {
    java.util.Arrays.sort(arr);
    for (int i = 0; i < arr.length - 1; i++) {
        if (arr[i] == arr[i + 1]) {
            return true;  // Duplicate found
        }
    }
    return false;  // No duplicates
}
```

#### Linear Search
```java
public static int linearSearch(int[] arr, int target) {
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == target) {
            return i;  // Element found at index i
        }
    }
    return -1;  // Element not found
}

int[] arr = {3, 7, 2, 9, 1};
System.out.println(linearSearch(arr, 9));  // Output: 3
```

#### Binary Search (for sorted arrays)
```java
public static int binarySearch(int[] arr, int target) {
    int start = 0, end = arr.length - 1;
    
    while (start <= end) {
        int mid = start + (end - start) / 2;
        
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] < target) {
            start = mid + 1;  // Search right
        } else {
            end = mid - 1;    // Search left
        }
    }
    return -1;  // Not found
}

int[] sortedArr = {1, 2, 3, 5, 7, 9};
System.out.println(binarySearch(sortedArr, 5));  // Output: 3
// Time Complexity: O(log n)
```

### Advantages & Disadvantages

| Advantage | Disadvantage |
|-----------|--------------|
| Fast access (O(1)) | Fixed size |
| Memory efficient | Insertion/deletion is slow (O(n)) |
| Simple to use | Memory wastage if not fully used |

---

## 7. 2D Arrays

### What is a 2D Array?
A 2D array is an array of arrays (like a matrix or table).

**Characteristics:**
- Rows and Columns
- Similar to a spreadsheet or matrix
- Good for storing tabular data

### 2D Array Declaration and Initialization

```java
// Declaration and initialization
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
// This is a 3x3 matrix

// Access elements
System.out.println(matrix[0][0]);  // Output: 1
System.out.println(matrix[1][2]);  // Output: 6
System.out.println(matrix[2][1]);  // Output: 8

// Declaration with size
int[][] arr = new int[3][3];  // 3 rows, 3 columns

// Jagged array (rows can have different lengths)
int[][] jagged = {
    {1, 2},
    {3, 4, 5},
    {6}
};
```

### Common 2D Array Operations

#### Traverse and Print
```java
public static void print2DArray(int[][] arr) {
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();
    }
}

// Using for-each
public static void print2DArray(int[][] arr) {
    for (int[] row : arr) {
        for (int element : row) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
```

#### Count Occurrences of a Key
```java
public static int countKey(int[][] arr, int key) {
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
            if (arr[i][j] == key) {
                count++;
            }
        }
    }
    return count;
}

int[][] matrix = {{4, 7, 8}, {8, 8, 7}};
System.out.println(countKey(matrix, 8));  // Output: 3
```

#### Calculate Row Sum
```java
public static int rowSum(int[][] arr, int rowNum) {
    int sum = 0;
    for (int j = 0; j < arr[rowNum].length; j++) {
        sum += arr[rowNum][j];
    }
    return sum;
}

int[][] matrix = {{1, 4, 9}, {11, 4, 3}, {2, 2, 3}};
System.out.println(rowSum(matrix, 1));  // Output: 18
```

#### Transpose a Matrix
```java
public static void transposeMatrix(int[][] arr) {
    int[][] transpose = new int[arr[0].length][arr.length];
    
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
            transpose[j][i] = arr[i][j];
        }
    }
    
    // Print transposed matrix
    for (int i = 0; i < transpose.length; i++) {
        for (int j = 0; j < transpose[i].length; j++) {
            System.out.print(transpose[i][j] + " ");
        }
        System.out.println();
    }
}

// Original:        Transposed:
// 1 2 3           1 4 7
// 4 5 6    -->    2 5 8
// 7 8 9           3 6 9
```

### Time Complexities
- Traversal: O(m × n) where m is rows, n is columns
- Search: O(m × n)
- Insertion: O(m × n) (may need to shift elements)
- Deletion: O(m × n)

---

## 8. Strings

### What is a String?
A string is a sequence of characters.

**Key Properties:**
- Strings are IMMUTABLE (cannot be changed once created)
- Use String class: `String str = "Hello";`
- Can also use character array: `char[] arr = {'H', 'e', 'l', 'l', 'o'};`

### String Creation

```java
// String literal (stored in String pool)
String s1 = "Hello";

// String object (creates new object in heap)
String s2 = new String("Hello");

// From character array
char[] arr = {'H', 'e', 'l', 'l', 'o'};
String s3 = new String(arr);

// From Scanner
Scanner sc = new Scanner(System.in);
String name = sc.next();        // Single word
String fullName = sc.nextLine(); // Entire line
```

### String Comparison

```java
String s1 = "Shree";
String s2 = "Shree";
String s3 = new String("Shree");

// Using ==  (compares memory reference)
System.out.println(s1 == s2);   // true (same memory)
System.out.println(s1 == s3);   // false (different memory)

// Using .equals() (compares content)
System.out.println(s1.equals(s3));          // true
System.out.println(s1.equalsIgnoreCase(s3)); // true (ignores case)

// Using .compareTo() (returns 0 if equal, <0 if first is smaller, >0 if first is larger)
System.out.println(s1.compareTo(s2));  // 0
```

### Common String Methods

```java
String str = "Hello World";

// Length
System.out.println(str.length());  // 11

// Character at index
System.out.println(str.charAt(0));  // 'H'
System.out.println(str.charAt(6));  // 'W'

// Substring
System.out.println(str.substring(0, 5));   // "Hello"
System.out.println(str.substring(6));      // "World"

// Case conversion
System.out.println(str.toUpperCase());   // "HELLO WORLD"
System.out.println(str.toLowerCase());   // "hello world"

// Contains
System.out.println(str.contains("World")); // true

// Index of
System.out.println(str.indexOf('o'));      // 4
System.out.println(str.lastIndexOf('o'));  // 7

// Replace
System.out.println(str.replace('o', '0'));  // "Hell0 W0rld"

// Trim (removes leading and trailing spaces)
String spaces = "  Hello  ";
System.out.println(spaces.trim());  // "Hello"

// Split
String fruits = "apple,mango,banana";
String[] arr = fruits.split(",");  // ["apple", "mango", "banana"]
```

### Common String Problems

#### Check if Palindrome
```java
public static boolean isPalindrome(String str) {
    int n = str.length();
    for (int i = 0; i <= n / 2; i++) {
        if (str.charAt(i) != str.charAt(n - i - 1)) {
            return false;
        }
    }
    return true;
}

System.out.println(isPalindrome("racecar"));  // true
System.out.println(isPalindrome("hello"));    // false
```

#### String Compression
```java
public static String compress(String str) {
    StringBuilder sb = new StringBuilder();
    
    for (int i = 0; i < str.length(); i++) {
        int count = 1;
        sb.append(str.charAt(i));
        
        while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
            count++;
            i++;
        }
        
        if (count > 1) {
            sb.append(count);
        }
    }
    return sb.toString();
}

System.out.println(compress("aaabbcccdd"));  // "a3b2c3d2"
System.out.println(compress("abcd"));        // "abcd"
```

#### Capitalize First Letter of Each Word
```java
public static String capitalizeWords(String str) {
    StringBuilder sb = new StringBuilder();
    
    char ch = Character.toUpperCase(str.charAt(0));
    sb.append(ch);
    
    for (int i = 1; i < str.length(); i++) {
        if (str.charAt(i) == ' ' && i < str.length() - 1) {
            sb.append(' ');
            i++;
            sb.append(Character.toUpperCase(str.charAt(i)));
        } else {
            sb.append(str.charAt(i));
        }
    }
    return sb.toString();
}

System.out.println(capitalizeWords("hello world java"));  // "Hello World Java"
```

#### Shortest Path
```java
public static double shortestPath(String str) {
    int x = 0, y = 0;
    
    for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);
        if (ch == 'N') y++;
        else if (ch == 'S') y--;
        else if (ch == 'E') x++;
        else if (ch == 'W') x--;
    }
    
    return Math.sqrt(x * x + y * y);
}

System.out.println(shortestPath("WNEENESENNN"));  // 1.414...
```

### StringBuilder vs String

```java
// String concatenation (slow - creates new object each time)
String result = "";
for (int i = 0; i < 1000; i++) {
    result += i;  // O(n^2) time complexity
}

// StringBuilder (fast - modifies in place)
StringBuilder sb = new StringBuilder();
for (int i = 0; i < 1000; i++) {
    sb.append(i);  // O(n) time complexity
}
String result = sb.toString();
```

### Best Practices
1. Use `equals()` not `==` to compare strings
2. Use `StringBuilder` for string concatenation in loops
3. Remember strings are immutable
4. Use meaningful variable names for strings
5. Always check string length before accessing characters

---

# PART 3: ALGORITHMS

## 9. Basic Sorting Algorithms

### What is Sorting?
Arranging elements in a specific order (ascending or descending).

### Why Sorting Matters
- Makes data retrieval faster
- Necessary preprocessing for many algorithms
- Can optimize search operations

---

### 1. Bubble Sort

**Concept:** Compare adjacent elements and swap if they're in wrong order. Repeat until sorted.

**How it Works:**
```
Array: [5, 3, 8, 4, 2]

Pass 1: [5,3,8,4,2] → [3,5,8,4,2] → [3,5,4,8,2] → [3,5,4,2,8]
Pass 2: [3,5,4,2,8] → [3,4,5,2,8] → [3,4,2,5,8]
Pass 3: [3,4,2,5,8] → [3,2,4,5,8]
Pass 4: [2,3,4,5,8]  ← Sorted!
```

**Code (Descending Order):**
```java
public static void bubbleSort(int[] arr) {
    // Outer loop for number of passes
    for (int i = 0; i < arr.length; i++) {
        // Inner loop for comparing adjacent elements
        for (int j = 0; j < arr.length - i - 1; j++) {
            // Swap if left is smaller than right (for descending)
            if (arr[j] < arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
}

int[] arr = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
bubbleSort(arr);
// Result: [8, 7, 6, 5, 4, 3, 3, 2, 1, 1]
```

**Complexity:**
- Time: O(n²) average & worst case, O(n) best case
- Space: O(1)

**Pros & Cons:**
| Pros | Cons |
|------|------|
| Simple to understand | Very slow for large datasets |
| In-place sorting | Many unnecessary comparisons |
| Stable sort | Not suitable for real-world apps |

---

### 2. Selection Sort

**Concept:** Find the maximum element and place it at the end. Repeat for remaining elements.

**How it Works:**
```
Array: [5, 3, 8, 4, 2]

Step 1: Find max(5,3,8,4,2) = 8 → Move to end
        [5, 3, 2, 4, 8]

Step 2: Find max(5,3,2,4) = 5 → Move to end
        [4, 3, 2, 5, 8]

Step 3: Find max(4,3,2) = 4 → Move to end
        [2, 3, 4, 5, 8]

And so on...
```

**Code (Descending Order):**
```java
public static void selectionSort(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
        int maxIdx = i;
        
        // Find index of maximum element
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[maxIdx] < arr[j]) {
                maxIdx = j;
            }
        }
        
        // Swap
        int temp = arr[maxIdx];
        arr[maxIdx] = arr[i];
        arr[i] = temp;
    }
}

int[] arr = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
selectionSort(arr);
// Result: [8, 7, 6, 5, 4, 3, 3, 2, 1, 1]
```

**Complexity:**
- Time: O(n²) always (cannot be optimized)
- Space: O(1)

**Pros & Cons:**
| Pros | Cons |
|------|------|
| Simple implementation | Always O(n²) |
| In-place sorting | No best-case optimization |
| Works well for small datasets | Not stable |

---

### 3. Insertion Sort

**Concept:** Build sorted array one element at a time by inserting each element in its correct position.

**How it Works:**
```
Array: [5, 3, 8, 4, 2]

Step 1: [5] (1 element, already sorted)
Step 2: [5, 3] → Insert 3: [3, 5]
Step 3: [3, 5, 8] → Insert 8: [3, 5, 8]
Step 4: [3, 5, 8, 4] → Insert 4: [3, 4, 5, 8]
Step 5: [3, 4, 5, 8, 2] → Insert 2: [2, 3, 4, 5, 8]
```

**Code:**
```java
public static void insertionSort(int[] arr) {
    // Start from second element
    for (int i = 1; i < arr.length; i++) {
        int key = arr[i];  // Element to insert
        int j = i - 1;
        
        // Shift elements greater than key to the right
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j--;
        }
        
        // Insert key at correct position
        arr[j + 1] = key;
    }
}

int[] arr = {5, 3, 8, 4, 2};
insertionSort(arr);
// Result: [2, 3, 4, 5, 8]
```

**Complexity:**
- Time: O(n²) average & worst case, O(n) best case (when already sorted)
- Space: O(1)

**Pros & Cons:**
| Pros | Cons |
|------|------|
| Efficient for small datasets | Still O(n²) in worst case |
| Stable sort | Slower than quick sort for large data |
| Adaptive (fast for nearly sorted data) | |
| In-place sorting | |

---

### Comparison of Sorting Algorithms

| Algorithm | Best Case | Average Case | Worst Case | Space | Stable |
|-----------|-----------|--------------|-----------|-------|--------|
| Bubble Sort | O(n) | O(n²) | O(n²) | O(1) | Yes |
| Selection Sort | O(n²) | O(n²) | O(n²) | O(1) | No |
| Insertion Sort | O(n) | O(n²) | O(n²) | O(1) | Yes |

---

# PART 4: ADVANCED TOPICS

## 10. Bit Manipulation

### What is Bit Manipulation?
Working directly with the binary representation of numbers for efficient operations.

### Binary Basics

```
Decimal vs Binary:
0 = 0000
1 = 0001
2 = 0010
3 = 0011
4 = 0100
5 = 0101
6 = 0110
7 = 0111
8 = 1000
```

### Bitwise Operators

#### 1. AND (&)
Returns 1 only if both bits are 1.

```java
int a = 5;      // 0101
int b = 3;      // 0011
System.out.println(a & b);  // 0001 = 1

// Use case: Check if bit is set
int num = 5;    // 0101
if ((num & 1) == 1) {
    System.out.println("Odd number");  // Output: Odd number
}
```

#### 2. OR (|)
Returns 1 if at least one bit is 1.

```java
int a = 5;      // 0101
int b = 3;      // 0011
System.out.println(a | b);  // 0111 = 7

// Use case: Set a bit
int num = 5;    // 0101
int result = num | 2;  // Set bit at position 1
// Result: 0111 = 7
```

#### 3. XOR (^)
Returns 1 if bits are different.

```java
int a = 5;      // 0101
int b = 3;      // 0011
System.out.println(a ^ b);  // 0110 = 6

// Key property: x ^ x = 0
int x = 5;
System.out.println(x ^ x);  // 0

// Use case: Find single number
// If array has pairs except one: [1,1,2,2,3]
// Result: 1^1^2^2^3 = 0^0^3 = 3
```

#### 4. NOT (~)
Flips all bits.

```java
int a = 5;      // 0101
System.out.println(~a);  // 1010 = -6 (in two's complement)
```

#### 5. Left Shift (<<)
Shifts bits left, fills with 0s. Equivalent to multiplying by 2^n.

```java
int a = 5;      // 0101
System.out.println(a << 1);  // 1010 = 10 (5 * 2)
System.out.println(a << 2);  // 10100 = 20 (5 * 4)
```

#### 6. Right Shift (>>)
Shifts bits right, fills with sign bit. Equivalent to dividing by 2^n.

```java
int a = 5;      // 0101
System.out.println(a >> 1);  // 0010 = 2 (5 / 2)
System.out.println(a >> 2);  // 0001 = 1 (5 / 4)
```

### Advanced Bit Manipulation Techniques

#### Swap Two Numbers Without Temporary Variable
```java
int x = 3, y = 5;
x = x ^ y;
y = x ^ y;  // y = (x^y)^y = x
x = x ^ y;  // x = (x^y)^x = y

System.out.println("x = " + x + ", y = " + y);  // x = 5, y = 3
```

#### Add 1 Without Using + Operator
```java
// -~x equals x + 1
int x = 6;
System.out.println(-~x);  // Output: 7

// Why? ~ flips bits, - flips them back and adds 1
// Binary of 6: 0110
// ~6: 1001 = -7 (in two's complement)
// -(-7): 7
```

#### Convert Uppercase to Lowercase Using Bitwise OR
```java
for (char ch = 'A'; ch <= 'Z'; ch++) {
    System.out.print((char)(ch | ' '));
}
// Output: abcdefghijklmnopqrstuvwxyz

// Why? Lowercase letters have bit 5 set to 1
// 'A' = 65 = 01000001
// ' ' = 32 = 00100000
// 'A' | ' ' = 01100001 = 97 = 'a'
```

### Important Concepts

#### Check if Number is Power of 2
```java
public static boolean isPowerOfTwo(int n) {
    // A power of 2 has only one bit set
    // n & (n-1) removes the rightmost set bit
    // If n is power of 2, this equals 0
    return n > 0 && (n & (n - 1)) == 0;
}

System.out.println(isPowerOfTwo(8));   // true (1000)
System.out.println(isPowerOfTwo(12));  // false (1100)
```

#### Count Number of Set Bits (1s)
```java
public static int countSetBits(int n) {
    int count = 0;
    while (n > 0) {
        if ((n & 1) == 1) {
            count++;
        }
        n >>= 1;  // Right shift by 1
    }
    return count;
}

System.out.println(countSetBits(5));  // 2 (0101 has two 1s)
```

#### Find Rightmost Set Bit
```java
int n = 12;  // 1100
int rightmost = n & -n;
System.out.println(rightmost);  // 4 (0100)
```

### Best Practices
1. Bitwise operations are very fast
2. Use for optimization when needed
3. Code can be hard to understand - add comments
4. Great for competitive programming
5. Useful for embedded systems with memory constraints

---

# KEY TAKEAWAYS & BEST PRACTICES

## General Programming Best Practices

### 1. Code Readability
```java
// BAD
int a,b,c;
c=a+b;

// GOOD
int firstNumber, secondNumber, sum;
sum = firstNumber + secondNumber;
```

### 2. DRY Principle (Don't Repeat Yourself)
```java
// BAD - Repeated code
for (int i = 0; i < 5; i++) System.out.println(i);
for (int i = 0; i < 5; i++) System.out.println(i * 2);

// GOOD - Use methods
public static void printNumbers(int max) {
    for (int i = 0; i < max; i++) System.out.println(i);
}

public static void printDoublesNumbers(int max) {
    for (int i = 0; i < max; i++) System.out.println(i * 2);
}
```

### 3. Meaningful Names
```java
// BAD
int x, y, z;
void p() { }
char c;

// GOOD
int studentAge, totalMarks, finalScore;
void processArray() { }
char initialLetter;
```

### 4. Keep Methods Small
A method should do ONE thing well. If it's >20 lines, consider breaking it.

### 5. Handle Edge Cases
```java
// Always consider edge cases
public static int findMax(int[] arr) {
    if (arr == null || arr.length == 0) {
        return Integer.MIN_VALUE;  // or throw exception
    }
    // ... rest of code
}
```

### 6. Use Comments Wisely
```java
// GOOD - Explains WHY, not WHAT
// Using sqrt optimization because factors come in pairs
for (int i = 2; i * i <= n; i++) {
    if (n % i == 0) return false;
}

// BAD - Just explains WHAT (code already shows this)
// Loop from 2 to sqrt(n)
for (int i = 2; i * i <= n; i++) {
    if (n % i == 0) return false;
}
```

---

## Data Structure Selection Guide

**Use Arrays when:**
- You need fast random access
- Size is fixed
- Memory is limited

**Use 2D Arrays when:**
- You need tabular/matrix data
- Working with grids or boards

**Use Strings when:**
- Working with text
- Pattern matching
- Data processing

---

## Algorithm Selection Guide

**Use Sorting when:**
- Data needs to be ordered
- Preprocessing for search algorithms
- Output requirements

**Bubble Sort:** Only for learning or very small datasets
**Selection Sort:** Small datasets where memory is not an issue
**Insertion Sort:** Nearly sorted data or small datasets

---

## Time Complexity Quick Reference

```
Operation              | Time Complexity
----------------------|----------------
Array access           | O(1)
Array search (linear)  | O(n)
Array search (binary)  | O(log n)
Array sort (bubble)    | O(n²)
Array sort (efficient) | O(n log n)
String comparison      | O(n) where n = length
Bitwise operation      | O(1) or O(number of bits)
```

---

## Common Mistakes to Avoid

1. **Off-by-One Errors:**
   ```java
   // WRONG - Accesses index 10 which doesn't exist
   int[] arr = new int[10];
   System.out.println(arr[10]);
   
   // RIGHT
   for (int i = 0; i < arr.length; i++)  // Use <, not <=
   ```

2. **Forgetting to Update Loop Variables:**
   ```java
   // WRONG - Infinite loop
   int i = 0;
   while (i < 10) {
       System.out.println(i);
       // forgot i++
   }
   
   // RIGHT
   while (i < 10) {
       System.out.println(i);
       i++;
   }
   ```

3. **Comparing Strings with ==:**
   ```java
   // WRONG
   if (str1 == str2) { }
   
   // RIGHT
   if (str1.equals(str2)) { }
   ```

4. **Not Handling Null:**
   ```java
   // WRONG - NullPointerException possible
   public static int findMax(int[] arr) {
       int max = arr[0];  // What if arr is null?
       // ...
   }
   
   // RIGHT
   if (arr == null || arr.length == 0) return Integer.MIN_VALUE;
   ```

5. **Modifying Collections While Iterating:**
   ```java
   // WRONG - Can cause unexpected behavior
   for (int i = 0; i < arr.length; i++) {
       if (arr[i] == target) arr[i] = newValue;  // Risky
   }
   ```

---

## Performance Tips

1. **Use Appropriate Data Types:**
   - Use `int` for integers, not `double`
   - Use `boolean` for true/false, not `int`

2. **Avoid Unnecessary Operations:**
   ```java
   // SLOW - Recalculates length each iteration
   for (int i = 0; i < arr.length; i++) { }
   
   // FAST (for large arrays)
   int len = arr.length;
   for (int i = 0; i < len; i++) { }
   ```

3. **Use StringBuilder for String Concatenation:**
   ```java
   // SLOW - O(n²)
   String result = "";
   for (int i = 0; i < 1000; i++) result += i;
   
   // FAST - O(n)
   StringBuilder sb = new StringBuilder();
   for (int i = 0; i < 1000; i++) sb.append(i);
   ```

4. **Early Exit from Loops:**
   ```java
   // Can be faster
   public static boolean contains(int[] arr, int target) {
       for (int num : arr) {
           if (num == target) return true;
       }
       return false;
   }
   ```

---

## Revision Strategy

1. **Review Daily:** Spend 15 minutes daily reviewing one topic
2. **Code It Out:** Don't just read, write code for each concept
3. **Practice Problems:** Solve 2-3 problems for each topic
4. **Understand, Don't Memorize:** Know WHY, not just WHAT
5. **Track Progress:** Note areas needing more practice

---

## Key Areas to Focus Your Study

### Must Master:
1. **Arrays and Loops** - Foundation of all DSA
2. **Time Complexity** - Critical for optimization
3. **Binary Search** - Used in many algorithms
4. **Sorting Algorithms** - Fundamental concepts

### Important to Know:
1. **String Manipulation** - Frequent in interviews
2. **2D Arrays** - Common in real-world problems
3. **Bit Manipulation** - Optimization trick

### Advanced (When Ready):
1. **Advanced Sorting** (Merge Sort, Quick Sort)
2. **Data Structures** (Linked Lists, Stacks, Queues)
3. **Search Algorithms** (BFS, DFS)

---

## Quick Formula Reference

### Arithmetic
- Sum of first n natural numbers: n × (n + 1) / 2
- Sum of squares: n × (n + 1) × (2n + 1) / 6
- Sum of cubes: [n × (n + 1) / 2]²

### Prime Numbers
- Test primality: Check divisibility from 2 to √n
- Count primes: Use Sieve of Eratosthenes

### Factorial
- n! = n × (n-1) × (n-2) × ... × 1
- Time Complexity: O(n)

### Powers of 2
- 2^0 = 1, 2^1 = 2, 2^2 = 4, 2^3 = 8, 2^4 = 16, 2^5 = 32
- Check power of 2: (n & (n-1)) == 0

---

## Additional Resources for Practice

### Problem Types to Practice:
1. **Array Problems:** Find duplicates, maximum, minimum, rotation
2. **String Problems:** Palindrome, compression, anagrams
3. **Pattern Problems:** Star patterns, number patterns
4. **Mathematical Problems:** Prime, factorial, series

### Practice Approach:
1. Understand the problem
2. Write brute force solution
3. Optimize if needed
4. Code it in Java
5. Test with multiple inputs
6. Handle edge cases

---

**Remember:** The key to mastering DSA is consistent practice and understanding concepts deeply. Start with basics, build strong foundations, then move to advanced topics. Happy coding! 🚀

---

*Last Updated: May 2026*
*Prepared for: Java DSA Revision*
