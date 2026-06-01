# Java DSA: Quick Reference Cheat Sheet
**One-Page Quick Revision Guide**

---

## TIME & SPACE COMPLEXITY AT A GLANCE

```
O(1)      - Constant      │ O(n)      - Linear        │ O(n²)     - Quadratic
O(log n)  - Logarithmic   │ O(n log n)- Linearithmic  │ O(2^n)    - Exponential
```

| Operation | Complexity |
|-----------|-----------|
| Array index access | O(1) |
| Array insert/delete | O(n) |
| Linear search | O(n) |
| Binary search | O(log n) |
| String comparison | O(n) |
| Bubble/Selection/Insertion Sort | O(n²) |
| Merge/Quick Sort | O(n log n) |

---

## OPERATORS QUICK REFERENCE

### Arithmetic
```
+  →  Addition        |  -  →  Subtraction     |  *  →  Multiplication
/  →  Division        |  %  →  Modulus (Remainder)
```

### Relational (Return boolean)
```
>  →  Greater than    |  <  →  Less than       |  >=  →  Greater or equal
<=  →  Less or equal  |  ==  →  Equal          |  !=  →  Not equal
```

### Logical (Return boolean)
```
&&  →  AND (both true)   |  ||  →  OR (at least one true)  |  !  →  NOT (reverse)
```

### Bitwise
```
&   →  AND              |  |   →  OR             |  ^   →  XOR
~   →  NOT              |  <<  →  Left shift     |  >>  →  Right shift
```

---

## COMMON PATTERNS

### Loop Through Array
```java
// For loop (best for indexed access)
for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}

// For-each loop (best for iteration)
for (int num : arr) {
    System.out.println(num);
}

// While loop (best for unknown iterations)
int i = 0;
while (i < arr.length) {
    System.out.println(arr[i]);
    i++;
}
```

### Loop Through 2D Array
```java
for (int i = 0; i < matrix.length; i++) {
    for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
    }
    System.out.println();
}
```

### Swap Two Elements
```java
// Using temp variable
int temp = arr[i];
arr[i] = arr[j];
arr[j] = temp;

// Using XOR (no temp)
arr[i] = arr[i] ^ arr[j];
arr[j] = arr[i] ^ arr[j];
arr[i] = arr[i] ^ arr[j];
```

### Find Min/Max
```java
int min = arr[0], max = arr[0];
for (int i = 1; i < arr.length; i++) {
    if (arr[i] < min) min = arr[i];
    if (arr[i] > max) max = arr[i];
}
```

### Linear Search
```java
for (int i = 0; i < arr.length; i++) {
    if (arr[i] == target) return i;
}
return -1;
```

### Binary Search (Sorted Array)
```java
int start = 0, end = arr.length - 1;
while (start <= end) {
    int mid = start + (end - start) / 2;
    if (arr[mid] == target) return mid;
    else if (arr[mid] < target) start = mid + 1;
    else end = mid - 1;
}
return -1;
```

---

## SORTING ALGORITHMS

### Bubble Sort (Descending)
```java
for (int i = 0; i < arr.length; i++) {
    for (int j = 0; j < arr.length - i - 1; j++) {
        if (arr[j] < arr[j + 1]) {  // For descending
            int temp = arr[j];
            arr[j] = arr[j + 1];
            arr[j + 1] = temp;
        }
    }
}
// Time: O(n²), Space: O(1)
```

### Selection Sort (Descending)
```java
for (int i = 0; i < arr.length - 1; i++) {
    int maxIdx = i;
    for (int j = i + 1; j < arr.length; j++) {
        if (arr[maxIdx] < arr[j]) maxIdx = j;
    }
    int temp = arr[maxIdx];
    arr[maxIdx] = arr[i];
    arr[i] = temp;
}
// Time: O(n²), Space: O(1)
```

### Insertion Sort (Ascending)
```java
for (int i = 1; i < arr.length; i++) {
    int key = arr[i];
    int j = i - 1;
    while (j >= 0 && arr[j] > key) {
        arr[j + 1] = arr[j];
        j--;
    }
    arr[j + 1] = key;
}
// Time: O(n²), Space: O(1)
```

---

## STRING METHODS

```java
String str = "Hello World";

// Length & Characters
str.length()           // 11
str.charAt(0)          // 'H'

// Case conversion
str.toUpperCase()      // "HELLO WORLD"
str.toLowerCase()      // "hello world"

// Substring
str.substring(0, 5)    // "Hello"
str.substring(6)       // "World"

// Contains & Find
str.contains("World")  // true
str.indexOf('o')       // 4
str.lastIndexOf('o')   // 7

// Replace & Trim
str.replace('o', '0')  // "Hell0 W0rld"
"  hello  ".trim()     // "hello"

// Compare
str.equals(other)      // Compare content
str.equalsIgnoreCase(other)  // Ignore case
str.compareTo(other)   // Compare lexicographically

// Split & Join
String[] arr = str.split(" ");  // ["Hello", "World"]
String joined = String.join("-", arr);  // "Hello-World"

// Convert
String s = String.valueOf(123);  // "123"
int n = Integer.parseInt("123");  // 123

// Character operations
Character.isDigit(ch)   // true if digit
Character.isLetter(ch)  // true if letter
Character.toUpperCase(ch)
Character.toLowerCase(ch)
```

---

## COMMON ALGORITHMS

### Check Prime Number
```java
public static boolean isPrime(int n) {
    if (n <= 1) return false;
    for (int i = 2; i * i <= n; i++) {
        if (n % i == 0) return false;
    }
    return true;
}
// Time: O(√n)
```

### Palindrome Check
```java
public static boolean isPalindrome(String str) {
    int n = str.length();
    for (int i = 0; i <= n / 2; i++) {
        if (str.charAt(i) != str.charAt(n - i - 1)) return false;
    }
    return true;
}
// Time: O(n)
```

### Reverse Array
```java
public static void reverse(int[] arr) {
    int left = 0, right = arr.length - 1;
    while (left < right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        left++; right--;
    }
}
// Time: O(n), Space: O(1)
```

### Sum of First N Numbers
```java
// Loop: O(n)
int sum = 0;
for (int i = 1; i <= n; i++) sum += i;

// Formula: O(1) ← USE THIS!
int sum = n * (n + 1) / 2;
```

---

## BIT MANIPULATION TRICKS

```java
// Check if bit is set
(n & 1) == 1          // Check if odd

// Check power of 2
(n & (n - 1)) == 0    // true if power of 2

// Swap without temp
x ^= y; y ^= x; x ^= y;

// Add 1 without +
-~n                    // Equivalent to n + 1

// Count set bits
Integer.bitCount(n)

// Get bit at position i
(n >> i) & 1

// Set bit at position i
n | (1 << i)

// Clear bit at position i
n & ~(1 << i)

// Toggle bit at position i
n ^ (1 << i)

// Check if nth bit is set
(n >> i) & 1

// Convert upper to lower
ch | ' '               // 'A' | ' ' = 'a'

// XOR property
x ^ x = 0
x ^ 0 = x
x ^ ~x = -1
```

---

## 2D ARRAY OPERATIONS

### Print 2D Array
```java
for (int i = 0; i < matrix.length; i++) {
    for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
    }
    System.out.println();
}
```

### Count Occurrences
```java
int count = 0;
for (int i = 0; i < matrix.length; i++) {
    for (int j = 0; j < matrix[i].length; j++) {
        if (matrix[i][j] == key) count++;
    }
}
```

### Row Sum
```java
int sum = 0;
for (int j = 0; j < matrix[row].length; j++) {
    sum += matrix[row][j];
}
```

### Column Sum
```java
int sum = 0;
for (int i = 0; i < matrix.length; i++) {
    sum += matrix[i][col];
}
```

### Transpose Matrix
```java
int[][] transpose = new int[cols][rows];
for (int i = 0; i < rows; i++) {
    for (int j = 0; j < cols; j++) {
        transpose[j][i] = matrix[i][j];
    }
}
```

---

## INPUT/OUTPUT

```java
import java.util.Scanner;

Scanner sc = new Scanner(System.in);

int num = sc.nextInt();              // Read integer
double decimal = sc.nextDouble();    // Read double
String word = sc.next();             // Read single word
String line = sc.nextLine();         // Read entire line
char character = sc.next().charAt(0); // Read character

System.out.println(value);           // Print with newline
System.out.print(value);             // Print without newline
System.out.printf("Value: %d", num); // Formatted print
```

---

## METHOD TEMPLATE

```java
public static returnType methodName(parameterType param1, parameterType param2) {
    // Method body
    // Perform operation
    return result;  // If return type is not void
}

// Example
public static int add(int a, int b) {
    return a + b;
}
```

---

## COMMON MISTAKES & FIXES

| Mistake | Fix |
|---------|-----|
| `if (arr[10])` when size is 10 | Use `i < arr.length` not `i <= arr.length` |
| `str1 == str2` | Use `str1.equals(str2)` |
| Infinite loop | Always update loop variable |
| String concatenation in loop | Use StringBuilder instead |
| Null pointer exception | Check if null before using |
| Off-by-one error | Count from 0 to n-1 |
| Array index out of bounds | Use proper bounds checking |

---

## USEFUL JAVA METHODS

```java
// Array utilities
java.util.Arrays.sort(arr);
java.util.Arrays.binarySearch(arr, key);
java.util.Arrays.toString(arr);
java.util.Arrays.equals(arr1, arr2);

// Integer utilities
Integer.MAX_VALUE          // 2147483647
Integer.MIN_VALUE          // -2147483648
Integer.bitCount(n)        // Count 1s in binary
Math.abs(n)                // Absolute value
Math.pow(base, exp)        // Power
Math.sqrt(n)               // Square root
Math.max(a, b)             // Maximum
Math.min(a, b)             // Minimum

// Character utilities
Character.isDigit(ch)
Character.isLetter(ch)
Character.isUpperCase(ch)
Character.isLowerCase(ch)
Character.toUpperCase(ch)
Character.toLowerCase(ch)

// String utilities
String.valueOf(num)        // Convert to String
Integer.parseInt(str)      // String to int
Double.parseDouble(str)    // String to double
```

---

## MATHEMATICAL FORMULAS

```
Sum of 1 to n              : n * (n + 1) / 2
Sum of squares (1² to n²)  : n * (n + 1) * (2n + 1) / 6
Sum of cubes (1³ to n³)    : [n * (n + 1) / 2]²
Factorial (n!)             : n × (n-1) × ... × 1
nCr (Combinations)         : n! / (r! × (n-r)!)
nPr (Permutations)         : n! / (n-r)!
```

---

## VARIABLE TYPES & SIZES

```java
byte   b = 127;           // 1 byte, range: -128 to 127
short  s = 32767;         // 2 bytes, range: -32,768 to 32,767
int    i = 2147483647;    // 4 bytes (most common)
long   l = 9223372036854775807L;  // 8 bytes
float  f = 3.14f;         // 4 bytes
double d = 3.14159265359; // 8 bytes (default)
char   c = 'A';           // 2 bytes
boolean b = true;         // 1 byte (true/false)
```

---

## QUICK PRACTICE CHECKLIST

- [ ] Can you implement all 3 basic sorts?
- [ ] Can you write binary search from memory?
- [ ] Do you know prime check with √n optimization?
- [ ] Can you reverse an array/string?
- [ ] Do you understand bitwise operators?
- [ ] Can you solve palindrome problem?
- [ ] Do you know XOR swap trick?
- [ ] Can you work with 2D arrays?
- [ ] Do you know string methods?
- [ ] Can you calculate time complexity?

---

**Remember:** 
- Practice makes perfect
- Understand concepts, don't just memorize
- Optimize for both time and space
- Always consider edge cases
- Write clean, readable code

**Good luck with your preparation! 🎯**

---

*Last Updated: May 2026*
