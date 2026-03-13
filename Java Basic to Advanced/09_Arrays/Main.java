import java.util.*;

public class Main {

    public static void introduction() {
        //Definition of an Array
        // List of Elements of the same type placed in a contiguous memory location

        // JAVA ARRAYS: QUICK REFERENCE

        // 1. CORE CONCEPTS
        // - Definition: A fixed-size, ordered collection of elements.
        // - Strongly Typed: All elements must share the exact same data type.
        // - Memory: Stored in contiguous (continuous) memory locations.
        // - 0-Indexed: First element is at index 0, last is at (length - 1).
        // - Fixed Size: Capacity cannot change after creation.

        // 2. SYNTAX & EXAMPLES
        //instantiation is the process of creating an object from a class, while initialization is the process of assigning initial values to that newly created object's properties.

        // A. Declaration (Defining type and name)
        int[] numbers;

        // B. Instantiation (Allocating memory for 5 integers, defaults to 0)
        numbers = new int[5];

        // C. Initialization (Assigning values to indexes)
        numbers[0] = 10;
        numbers[1] = 20;

        // D. All-in-One (Declare, Instantiate, and Initialize)
        String[] fruits = {"Apple", "Banana", "Cherry"};

        // E. Accessing & Modifying
        // String firstFruit = fruits[0]; // Gets "Apple"
        // fruits[1] = "Mango";           // Changes "Banana" to "Mango"

        // F. Getting Array Length (Property, not a method)
        // int size = fruits.length;      // Returns 3
    
    }
    
    public static void operationsInArrays() {
        //Creating an Array
        //dataType arrayName[] = new dataType[size];
        /* int marks[] = new int[50];

        int numbers[] = {1, 2, 3};

        int moreNumbers[] = {4, 5, 6};

        String fruits[] = {"apple", "mango", "orange"}; */

        int marks[] = new int[100];

        Scanner sc = new Scanner(System.in);
        // int phy;
        // phy = sc.nextInt();

        System.out.print("Enter marks for physics : ");
        marks[0] = sc.nextInt(); // phy
        System.out.print("Enter marks for chemistry : ");
        marks[1] = sc.nextInt(); // che
        System.out.print("Enter marks for math : ");
        marks[2] = sc.nextInt(); // math
    
        System.out.println("phy : " + marks[0]);
        System.out.println("che : " + marks[1]);
        System.out.println("math : " + marks[2]);

        // marks[2] = 100;
        // marks[2] = marks[2] + 1;
        // System.out.println("math : " + marks[2]);

        int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("percentage = " + percentage + "%");
        System.out.println("Length of array = " + marks.length);


    }

    public static void update(int marks[], int nonChangable) {
        nonChangable = 10;
        for(int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static void arraysAsFunctionArguments() {

        int marks[] = {97, 98, 99};
        int nonChangable = 5;
        update(marks, nonChangable);

        //print our marks
        System.out.println(nonChangable); // here value remained same even after changing it in update function too 10 ; Output - 5
        for(int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        } //this value changed because arrays values are passed by reference to the update function

    }

    public static void main(String args[]) {
        // introduction();
        // operationsInArrays();
        // arraysAsFunctionArguments();
        

    }
}