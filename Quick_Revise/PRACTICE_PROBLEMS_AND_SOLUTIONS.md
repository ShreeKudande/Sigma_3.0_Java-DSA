# Java DSA: Practice Problems & Solutions
**Quick Reference for Interview & Exam Preparation**

---

## Table of Contents
1. [Array Problems](#array-problems)
2. [String Problems](#string-problems)
3. [Sorting Problems](#sorting-problems)
4. [2D Array Problems](#2d-array-problems)
5. [Bit Manipulation Problems](#bit-manipulation-problems)
6. [Mathematical Problems](#mathematical-problems)

---

# ARRAY PROBLEMS

## Problem 1: Check for Duplicates

**Question:** Given an array, determine if it contains any duplicate elements.

**Solution:**
```java
public static boolean hasDuplicates(int[] arr) {
    // Approach: Sort and compare adjacent elements
    java.util.Arrays.sort(arr);
    
    for (int i = 0; i < arr.length - 1; i++) {
        if (arr[i] == arr[i + 1]) {
            return true;  // Duplicate found
        }
    }
    return false;  // No duplicates
}

// Test Cases
int[] arr1 = {2, 6, 7, 9, 10, 9, 12, 14};
System.out.println(hasDuplicates(arr1));  // Output: true

int[] arr2 = {1, 2, 3, 4, 5};
System.out.println(hasDuplicates(arr2));  // Output: false
```

**Time Complexity:** O(n log n) due to sorting
**Space Complexity:** O(1)

**Alternative Approach (Using HashMap):**
```java
public static boolean hasDuplicatesHashMap(int[] arr) {
    java.util.HashSet<Integer> seen = new java.util.HashSet<>();
    
    for (int num : arr) {
        if (seen.contains(num)) {
            return true;
        }
        seen.add(num);
    }
    return false;
}
// Time: O(n), Space: O(n)
```

---

## Problem 2: Find Minimum and Maximum

**Question:** Find the minimum and maximum elements in an array.

**Solution:**
```java
public static void findMinMax(int[] arr) {
    int min = arr[0];
    int max = arr[0];
    
    for (int i = 1; i < arr.length; i++) {
        if (arr[i] < min) {
            min = arr[i];
        }
        if (arr[i] > max) {
            max = arr[i];
        }
    }
    
    System.out.println("Minimum: " + min);
    System.out.println("Maximum: " + max);
}

// Test Case
int[] arr = {3, 7, 2, 9, 1, 5};
findMinMax(arr);
// Output: Minimum: 1, Maximum: 9
```

**Time Complexity:** O(n)
**Space Complexity:** O(1)

---

## Problem 3: Reverse an Array

**Question:** Reverse the elements of an array in-place.

**Solution:**
```java
public static void reverseArray(int[] arr) {
    int left = 0, right = arr.length - 1;
    
    while (left < right) {
        // Swap elements
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        
        left++;
        right--;
    }
}

// Test Case
int[] arr = {1, 2, 3, 4, 5};
reverseArray(arr);
for (int num : arr) {
    System.out.print(num + " ");
}
// Output: 5 4 3 2 1
```

**Time Complexity:** O(n)
**Space Complexity:** O(1)

---

## Problem 4: Linear Search

**Question:** Find the index of a target element in an unsorted array.

**Solution:**
```java
public static int linearSearch(int[] arr, int target) {
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == target) {
            return i;  // Found at index i
        }
    }
    return -1;  // Not found
}

// Test Case
int[] arr = {3, 7, 2, 9, 1};
System.out.println(linearSearch(arr, 9));   // Output: 3
System.out.println(linearSearch(arr, 10));  // Output: -1
```

**Time Complexity:** O(n)
**Space Complexity:** O(1)

---

## Problem 5: Binary Search

**Question:** Find target element in a sorted array efficiently.

**Solution:**
```java
public static int binarySearch(int[] arr, int target) {
    int start = 0, end = arr.length - 1;
    
    while (start <= end) {
        int mid = start + (end - start) / 2;
        
        if (arr[mid] == target) {
            return mid;  // Found
        } else if (arr[mid] < target) {
            start = mid + 1;  // Search right
        } else {
            end = mid - 1;    // Search left
        }
    }
    return -1;  // Not found
}

// Test Case
int[] sortedArr = {1, 2, 3, 5, 7, 9};
System.out.println(binarySearch(sortedArr, 5));  // Output: 3
System.out.println(binarySearch(sortedArr, 4));  // Output: -1
```

**Time Complexity:** O(log n)
**Space Complexity:** O(1)

**Why Use (mid = start + (end - start) / 2)?**
Prevents integer overflow compared to (start + end) / 2

---

## Problem 6: Search in Rotated Sorted Array

**Question:** Find target in a rotated sorted array.

**Example:** [4, 5, 6, 7, 0, 1, 2], target = 0 → Output: 4

**Solution:**
```java
public static int searchRotated(int[] nums, int target) {
    int start = 0, end = nums.length - 1;
    
    while (start <= end) {
        int mid = start + (end - start) / 2;
        
        if (nums[mid] == target) {
            return mid;
        }
        
        // Check if left half is strictly sorted
        if (nums[start] <= nums[mid]) {
            // Is target in sorted left half?
            if (nums[start] <= target && target < nums[mid]) {
                end = mid - 1;  // Search left
            } else {
                start = mid + 1;  // Search right
            }
        }
        // Right half is strictly sorted
        else {
            // Is target in sorted right half?
            if (nums[mid] < target && target <= nums[end]) {
                start = mid + 1;  // Search right
            } else {
                end = mid - 1;  // Search left
            }
        }
    }
    
    return -1;  // Not found
}

// Test Case
int[] arr = {4, 5, 6, 7, 0, 1, 2};
System.out.println(searchRotated(arr, 0));  // Output: 4
```

**Time Complexity:** O(log n)
**Space Complexity:** O(1)

---

# STRING PROBLEMS

## Problem 1: Palindrome Check

**Question:** Check if a string is a palindrome.

**Examples:**
- "racecar" → true
- "hello" → false
- "noon" → true

**Solution:**
```java
public static boolean isPalindrome(String str) {
    int n = str.length();
    
    for (int i = 0; i <= n / 2; i++) {
        if (str.charAt(i) != str.charAt(n - i - 1)) {
            return false;  // Not a palindrome
        }
    }
    return true;  // Is a palindrome
}

// Test Cases
System.out.println(isPalindrome("racecar"));  // true
System.out.println(isPalindrome("hello"));    // false
System.out.println(isPalindrome("a"));        // true
```

**Time Complexity:** O(n)
**Space Complexity:** O(1)

---

## Problem 2: String Compression

**Question:** Compress a string by replacing consecutive characters with character+count.

**Example:** "aaabbcccdd" → "a3b2c3d2"

**Solution:**
```java
public static String compress(String str) {
    StringBuilder sb = new StringBuilder();
    
    for (int i = 0; i < str.length(); i++) {
        int count = 1;
        sb.append(str.charAt(i));
        
        // Count consecutive same characters
        while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
            count++;
            i++;
        }
        
        // Append count only if > 1
        if (count > 1) {
            sb.append(count);
        }
    }
    return sb.toString();
}

// Test Cases
System.out.println(compress("aaabbcccdd"));  // "a3b2c3d2"
System.out.println(compress("abcd"));        // "abcd"
System.out.println(compress("aaaa"));        // "a4"
```

**Time Complexity:** O(n)
**Space Complexity:** O(n) for StringBuilder

---

## Problem 3: String Manipulation - Capitalize First Letter

**Question:** Capitalize the first letter of each word in a string.

**Example:** "hello world java" → "Hello World Java"

**Solution:**
```java
public static String capitalizeWords(String str) {
    StringBuilder sb = new StringBuilder();
    
    // Capitalize first character
    char ch = Character.toUpperCase(str.charAt(0));
    sb.append(ch);
    
    // Process rest of string
    for (int i = 1; i < str.length(); i++) {
        if (str.charAt(i) == ' ' && i < str.length() - 1) {
            sb.append(str.charAt(i));
            i++;
            sb.append(Character.toUpperCase(str.charAt(i)));
        } else {
            sb.append(str.charAt(i));
        }
    }
    return sb.toString();
}

// Test Case
System.out.println(capitalizeWords("hello world java"));
// Output: "Hello World Java"
```

**Time Complexity:** O(n)
**Space Complexity:** O(n)

---

## Problem 4: Shortest Path

**Question:** Given direction string (N/S/E/W), find shortest distance from origin.

**Example:** "WNEENESENNN" → ?

**Solution:**
```java
public static double shortestPath(String str) {
    int x = 0, y = 0;  // Starting coordinates
    
    for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);
        
        if (ch == 'N') y++;        // North
        else if (ch == 'S') y--;   // South
        else if (ch == 'E') x++;   // East
        else if (ch == 'W') x--;   // West
    }
    
    // Euclidean distance formula
    return Math.sqrt(x * x + y * y);
}

// Test Case
String path = "WNEENESENNN";
System.out.println(shortestPath(path));  // √2 ≈ 1.414
```

**Time Complexity:** O(n)
**Space Complexity:** O(1)

---

## Problem 5: Anagram Check

**Question:** Check if two strings are anagrams.

**Example:** "listen" and "silent" → true

**Solution:**
```java
public static boolean isAnagram(String str1, String str2) {
    // Anagrams must have same length
    if (str1.length() != str2.length()) {
        return false;
    }
    
    // Sort both strings and compare
    char[] arr1 = str1.toCharArray();
    char[] arr2 = str2.toCharArray();
    
    java.util.Arrays.sort(arr1);
    java.util.Arrays.sort(arr2);
    
    return java.util.Arrays.equals(arr1, arr2);
}

// Test Cases
System.out.println(isAnagram("listen", "silent"));  // true
System.out.println(isAnagram("hello", "world"));    // false
System.out.println(isAnagram("abc", "bca"));        // true
```

**Time Complexity:** O(n log n) due to sorting
**Space Complexity:** O(n)

---

# SORTING PROBLEMS

## Problem 1: Sort Array in Descending Order

**Using Bubble Sort:**
```java
public static void bubbleSort(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr.length - i - 1; j++) {
            // For descending: left < right
            if (arr[j] < arr[j + 1]) {
                // Swap
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
}

int[] arr = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
bubbleSort(arr);
for (int num : arr) System.out.print(num + " ");
// Output: 8 7 6 5 4 3 3 2 1 1
```

**Using Selection Sort:**
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
        
        // Swap with current position
        int temp = arr[maxIdx];
        arr[maxIdx] = arr[i];
        arr[i] = temp;
    }
}

int[] arr = {3, 6, 2, 1, 8, 7};
selectionSort(arr);
// Result: [8, 7, 6, 3, 2, 1]
```

**Using Insertion Sort (Ascending):**
```java
public static void insertionSort(int[] arr) {
    for (int i = 1; i < arr.length; i++) {
        int key = arr[i];
        int j = i - 1;
        
        // Shift elements greater than key
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j--;
        }
        
        // Insert key
        arr[j + 1] = key;
    }
}

int[] arr = {5, 3, 8, 4, 2};
insertionSort(arr);
// Result: [2, 3, 4, 5, 8]
```

---

# 2D ARRAY PROBLEMS

## Problem 1: Count Occurrences in 2D Array

**Question:** Count how many times a key appears in 2D array.

**Solution:**
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

// Test Case
int[][] matrix = {{4, 7, 8}, {8, 8, 7}};
System.out.println(countKey(matrix, 8));  // Output: 3
```

**Time Complexity:** O(m × n)
**Space Complexity:** O(1)

---

## Problem 2: Calculate Row Sum

**Question:** Find sum of all elements in a specific row.

**Solution:**
```java
public static int rowSum(int[][] arr, int rowNum) {
    int sum = 0;
    
    for (int j = 0; j < arr[rowNum].length; j++) {
        sum += arr[rowNum][j];
    }
    return sum;
}

// Test Case
int[][] matrix = {{1, 4, 9}, {11, 4, 3}, {2, 2, 3}};
System.out.println(rowSum(matrix, 1));  // Output: 18 (11+4+3)
System.out.println(rowSum(matrix, 0));  // Output: 14 (1+4+9)
```

**Time Complexity:** O(n) where n is number of columns
**Space Complexity:** O(1)

---

## Problem 3: Transpose a Matrix

**Question:** Convert rows to columns and vice versa.

**Example:**
```
Original:     Transposed:
1 2 3         1 4 7
4 5 6    →    2 5 8
7 8 9         3 6 9
```

**Solution:**
```java
public static void transposeMatrix(int[][] arr) {
    int rows = arr.length;
    int cols = arr[0].length;
    
    int[][] transpose = new int[cols][rows];
    
    // Swap rows and columns
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
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

// Test Case
int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
transposeMatrix(matrix);
```

**Time Complexity:** O(m × n)
**Space Complexity:** O(m × n) for new matrix

---

## Problem 4: Search in 2D Array

**Question:** Find if a target exists in 2D array.

**Solution:**
```java
public static boolean search2D(int[][] arr, int target) {
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
            if (arr[i][j] == target) {
                return true;
            }
        }
    }
    return false;
}

// Test Case
int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
System.out.println(search2D(matrix, 5));  // true
System.out.println(search2D(matrix, 10)); // false
```

**Time Complexity:** O(m × n)
**Space Complexity:** O(1)

---

# BIT MANIPULATION PROBLEMS

## Problem 1: XOR Property

**Question:** What is x ^ x?

**Answer:** Always 0

**Explanation:**
```java
int x = 5;       // 0101
System.out.println(x ^ x);  // 0000 = 0
// XOR returns 1 only when bits are different
// Same number has same bits, so result is 0
```

---

## Problem 2: Swap Without Temporary Variable

**Question:** Swap two numbers using XOR without using temp variable.

**Solution:**
```java
int x = 3, y = 5;
System.out.println("Before: x = " + x + ", y = " + y);

x = x ^ y;
y = x ^ y;  // y = (x^y) ^ y = x
x = x ^ y;  // x = (x^y) ^ x = y

System.out.println("After: x = " + x + ", y = " + y);
// Output: Before: x = 3, y = 5
//         After: x = 5, y = 3
```

**Why it works:**
```
x = 3 (011), y = 5 (101)
Step 1: x = 3 ^ 5 = 6 (110)
Step 2: y = 6 ^ 5 = 3 (011) = original x
Step 3: x = 6 ^ 3 = 5 (101) = original y
```

---

## Problem 3: Add 1 Without Using + Operator

**Question:** Add 1 to number using only bitwise operators.

**Solution:**
```java
// Using -~x notation
int x = 6;
System.out.println(-~x);  // Output: 7 (equivalent to x + 1)

int y = -4;
System.out.println(-~y);  // Output: -3 (equivalent to y + 1)
```

**Why it works:**
```
Step 1: ~ flips all bits
Step 2: - (negation) flips bits back and adds 1
Result: Original number + 1
```

---

## Problem 4: Convert Uppercase to Lowercase Using Bitwise

**Question:** Convert uppercase letter to lowercase using bitwise OR.

**Solution:**
```java
// Trick: OR with space character (32)
for (char ch = 'A'; ch <= 'Z'; ch++) {
    System.out.print((char)(ch | ' '));
}
// Output: abcdefghijklmnopqrstuvwxyz

// Why: Uppercase and lowercase differ in bit 5
// 'A' = 65 = 01000001
// ' ' = 32 = 00100000
// 'A' | ' ' = 01100001 = 97 = 'a'
```

---

## Problem 5: Check if Number is Power of 2

**Question:** Determine if number is power of 2.

**Examples:** 8 → true, 12 → false

**Solution:**
```java
public static boolean isPowerOfTwo(int n) {
    // Power of 2 has only one bit set
    // n & (n-1) removes rightmost set bit
    // If n is power of 2, this equals 0
    return n > 0 && (n & (n - 1)) == 0;
}

System.out.println(isPowerOfTwo(8));   // true (1000)
System.out.println(isPowerOfTwo(12));  // false (1100)
System.out.println(isPowerOfTwo(16));  // true (10000)
System.out.println(isPowerOfTwo(1));   // true (2^0)
```

**Explanation:**
```
8 = 1000, 7 = 0111
8 & 7 = 1000 & 0111 = 0000 = 0 ✓ Power of 2

12 = 1100, 11 = 1011
12 & 11 = 1100 & 1011 = 1000 ≠ 0 ✗ Not power of 2
```

---

## Problem 6: Count Set Bits

**Question:** Count number of 1s in binary representation.

**Example:** 5 = 0101 → 2 set bits

**Solution:**
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

System.out.println(countSetBits(5));   // 2 (0101)
System.out.println(countSetBits(7));   // 3 (0111)
System.out.println(countSetBits(8));   // 1 (1000)

// Built-in method
System.out.println(Integer.bitCount(5));  // 2
```

---

# MATHEMATICAL PROBLEMS

## Problem 1: Check Prime Number

**Question:** Determine if a number is prime.

**Optimized Solution using √n:**
```java
public static boolean isPrime(int n) {
    // 0 and 1 are not prime
    if (n <= 1) {
        return false;
    }
    
    // Only check till √n
    // Factors come in pairs: if a×b=n, one must be ≤√n
    for (int i = 2; i * i <= n; i++) {
        if (n % i == 0) {
            return false;  // Found a factor
        }
    }
    return true;  // No factors found
}

// Test Cases
System.out.println(isPrime(7));   // true
System.out.println(isPrime(10));  // false
System.out.println(isPrime(2));   // true
System.out.println(isPrime(1));   // false
```

**Time Complexity:** O(√n)
**Space Complexity:** O(1)

**Why √n Works:**
```
For 36 (√36 = 6):
Factors: (1,36), (2,18), (3,12), (4,9), (6,6)
After 6, pairs repeat. So only check till 6.
```

---

## Problem 2: Sum of First N Natural Numbers

**Question:** Calculate sum of 1 + 2 + 3 + ... + n

**Solutions:**
```java
// Method 1: Loop
public static int sumByLoop(int n) {
    int sum = 0;
    for (int i = 1; i <= n; i++) {
        sum += i;
    }
    return sum;
}

// Method 2: Formula (Optimal)
public static int sumByFormula(int n) {
    return n * (n + 1) / 2;
}

// Test Cases
System.out.println(sumByLoop(5));     // 15 (1+2+3+4+5)
System.out.println(sumByFormula(5));  // 15
System.out.println(sumByFormula(100)); // 5050
```

**Complexity Comparison:**
- Loop: O(n)
- Formula: O(1)

---

## Problem 3: Factorial

**Question:** Calculate n! = n × (n-1) × (n-2) × ... × 1

**Solution:**
```java
public static int factorial(int n) {
    if (n <= 1) {
        return 1;
    }
    
    int result = 1;
    for (int i = 2; i <= n; i++) {
        result *= i;
    }
    return result;
}

// Test Cases
System.out.println(factorial(0));  // 1
System.out.println(factorial(5));  // 120
System.out.println(factorial(10)); // 3628800

// Recursive version
public static int factorialRecursive(int n) {
    if (n <= 1) return 1;
    return n * factorialRecursive(n - 1);
}
```

**Time Complexity:** O(n)
**Space Complexity:** O(1) for iterative, O(n) for recursive (call stack)

---

## Problem 4: GCD (Greatest Common Divisor)

**Question:** Find GCD of two numbers.

**Solution using Euclidean Algorithm:**
```java
public static int gcd(int a, int b) {
    while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}

// Test Cases
System.out.println(gcd(48, 18));  // 6
System.out.println(gcd(12, 8));   // 4
System.out.println(gcd(17, 19));  // 1 (coprime)

// Using built-in method
System.out.println(java.math.BigInteger.valueOf(48)
    .gcd(java.math.BigInteger.valueOf(18)));  // 6
```

**Time Complexity:** O(log min(a,b))

---

## Problem 5: Count Digits

**Question:** Count number of digits in a number.

**Solution:**
```java
public static int countDigits(int n) {
    if (n == 0) return 1;
    
    int count = 0;
    n = Math.abs(n);  // Handle negative numbers
    
    while (n > 0) {
        count++;
        n /= 10;
    }
    return count;
}

// Test Cases
System.out.println(countDigits(12345));  // 5
System.out.println(countDigits(0));      // 1
System.out.println(countDigits(-123));   // 3

// Using String
System.out.println(String.valueOf(12345).length());  // 5
```

**Time Complexity:** O(log n) or O(number of digits)

---

## Problem 6: Reverse a Number

**Question:** Reverse the digits of a number.

**Example:** 12345 → 54321

**Solution:**
```java
public static int reverseNumber(int n) {
    int reverse = 0;
    boolean isNegative = n < 0;
    n = Math.abs(n);
    
    while (n > 0) {
        int digit = n % 10;
        reverse = reverse * 10 + digit;
        n /= 10;
    }
    
    return isNegative ? -reverse : reverse;
}

// Test Cases
System.out.println(reverseNumber(12345));   // 54321
System.out.println(reverseNumber(-123));    // -321
System.out.println(reverseNumber(100));     // 1

// Using String
public static int reverseNumberString(int n) {
    String reversed = new StringBuilder(String.valueOf(Math.abs(n)))
        .reverse().toString();
    return n < 0 ? -Integer.parseInt(reversed) : Integer.parseInt(reversed);
}
```

**Time Complexity:** O(log n)

---

## Problem 7: Armstrong Number

**Question:** Check if number is Armstrong (sum of digits raised to power = number).

**Example:** 153 = 1³ + 5³ + 3³

**Solution:**
```java
public static boolean isArmstrong(int n) {
    int originalNumber = n;
    int digits = String.valueOf(n).length();
    int sum = 0;
    
    while (n > 0) {
        int digit = n % 10;
        sum += Math.pow(digit, digits);
        n /= 10;
    }
    
    return sum == originalNumber;
}

// Test Cases
System.out.println(isArmstrong(153));   // true (1³+5³+3³=153)
System.out.println(isArmstrong(370));   // true (3³+7³+0³=370)
System.out.println(isArmstrong(9474));  // true (9⁴+4⁴+7⁴+4⁴=9474)
System.out.println(isArmstrong(123));   // false
```

---

# SUMMARY TABLE

| Category | Problem | Difficulty | Time Complexity |
|----------|---------|------------|-----------------|
| Array | Duplicates | Easy | O(n log n) |
| Array | Min/Max | Easy | O(n) |
| Array | Reverse | Easy | O(n) |
| Array | Linear Search | Easy | O(n) |
| Array | Binary Search | Medium | O(log n) |
| String | Palindrome | Easy | O(n) |
| String | Compression | Medium | O(n) |
| String | Capitalize | Medium | O(n) |
| Sorting | Bubble Sort | Easy | O(n²) |
| 2D Array | Count Key | Easy | O(m×n) |
| 2D Array | Transpose | Medium | O(m×n) |
| Bit | XOR Swap | Medium | O(1) |
| Math | Prime Check | Medium | O(√n) |
| Math | Sum 1 to N | Easy | O(1) formula |

---

**Practice Strategy:**
1. Solve all problems multiple times
2. Time yourself for interview simulation
3. Optimize from brute force to better solutions
4. Understand WHY each optimization works
5. Practice related variations

---

*Keep coding! 🚀*
