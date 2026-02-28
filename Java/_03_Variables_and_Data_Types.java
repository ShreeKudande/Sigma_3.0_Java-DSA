public class _03_Variables_and_Data_Types {

    public static void boilerPlate() {
        /*
        public class <YourClassNameGoesHere> {
            public static void main(String args[]) {
      
            }
        }
        */
    }

    public static void outputInJava() {
        System.out.print("Hey Shree!"); // Prints text without a new line
        System.out.println("Hey Shree!"); // Prints text and moves to a new line
        System.out.print("Hey Shree!\n Hey Shree!"); // '\n' adds a new line inside the text (Escape Sequence Cha)
    }

    public static void printPattern() {
        System.out.println("****");
        System.out.println("***");
        System.out.println("**");
        System.out.println("*");
    }

    public static void variablesInJava() {
        /*
        In Java, variables are containers used to store data in memory. Variables define how data is stored, accessed, and manipulated.

        A variable in Java has three components,

        Data Type: Defines the kind of data stored (e.g., int, String, float).
        Variable Name: A unique identifier following Java naming rules.
        Value: The actual data assigned to the variable.

        Note:-
        - Variables store data.
        - Literals are the fixed values assigned to variables.
        - Identifiers are the names given to variables, methods, classes, etc.

        The general rules for naming variables are:
            - Names can contain letters, digits, underscores, and dollar signs
            - Names must begin with a letter
            - Names should start with a lowercase letter, and cannot contain whitespace
            - Names can also begin with $ and _
            - Names are case-sensitive ("myVar" and "myvar" are different variables)
            - Reserved words (like Java keywords, such as int or boolean) cannot be used as names
        */

       int a = 10;
       int b = 5;
       System.out.println(a+b);

       String name = "Shree Kudande";
       System.out.println(name);

       a = 15; //we can change variable values after assigning it.
       a = b; //Or we can assign it too other variables value
       System.out.print(a);
    }

    public static void dataTypesInJava() {
        /* 
        Primitive data types are the basic building blocks that store simple, single values directly in memory, while Non-primitive (reference) data types are complex, user-defined types that store references (memory addresses) to objects. 

        Two main categories:
        #Primitive Data Types – the building blocks
            ·byte, short, int, long → Numbers
            ·float, double → Decimals
            ·char → Single character
            ·boolean → true/false
        #Non-Primitive Data Types – objects & references
            ·String
            ·Arrays
            ·Classes
            ·Interfaces
         */

        byte b = 8;
        System.out.println(b);

        char ch = 'a'; //If we type 'abc' in value it would give error because we can only save single characters in char.
        System.out.println(ch);

        boolean var = true; //Or false & its used to check conditions like if its true or false.
        System.out.println(var);

        float price = 10.5f;
        int number = 16;
        short n = 365;
        // & there are 'long' & 'double' too, long is used for numbers only but it gives more memeory for bigger numbers and double is used for decimals which is also bigger then float

        /* NOTE: "Lossy Conversion" error occurs when putting a larger type (double) into a smaller type (float).It is called "lossy" because you risk losing information (precision or magnitude) during the process.
        Think of it like trying to pour a liter of water into a half-liter cup — the excess simply spills over.
        Example: 'float price = 10.5;' fails because 10.5 is a double by default.
        Fix: Use '10.5f' to explicitly define it as a float.*/

        /* Size of Data Types -->
         * Data Type | Size    | Description & Range (Magnitude)
         * ----------------------------------------------------------------------------------------
         * byte      | 1 byte  | Stores whole numbers from -128 to 127
         * short     | 2 bytes | Stores whole numbers from -32,768 to 32,767 (~32 Thousand)
         * int       | 4 bytes | Stores whole numbers from -2,147,483,648 to 2,147,483,647 (~2.14 Billion)
         * long      | 8 bytes | Stores whole numbers from -9,223,372... to 9,223,372... (~9.22 Quintillion)
         * float     | 4 bytes | Stores fractional numbers. Sufficient for 6 to 7 decimal digits
         * double    | 8 bytes | Stores fractional numbers. Sufficient for 15 decimal digits
         * boolean   | 1 bit   | Stores true or false values
         * char      | 2 bytes | Stores a single character/letter or ASCII values
        */

    }

    //main method
    public static void main(String args[]) {
        // boilerPlate();
        // outputInJava();
        // printPattern();
        // variablesInJava();
        // dataTypesInJava();
        
    }
}
