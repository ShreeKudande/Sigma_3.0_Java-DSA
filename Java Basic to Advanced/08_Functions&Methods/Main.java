import java.util.*;

public class Main{

    public static void introductionToFunctions() {
        // In Java, functions are exclusively referred to as methods because they must always be defined within a class. A method is a reusable block of code that performs a specific task. Instead of writing the same logic multiple times, you write it once inside a method and "call" or execute it whenever you need that specific task done.

        /* 
        Syntax -->
        returnType name() {
            //body
            return statement;
        }
        */

        // static void myMethod() {
        //     code to be executed
        // }
    }
    
    public static void calculateSum(int a, int b) { //parameters or formal parameters
        /* syntaxWithParameters -->
        returnType name(type param1, type param2) {
            //body
            return statement;
        }
        */
        
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a : ");
        // int a = sc.nextInt();
        // System.out.print("Enter b : ");
        // int b = sc.nextInt();
        int sum = a + b;
        System.out.println("sum is : " + sum);
        // return sum; --> if using this doo change the function type too Int
    }

    public static void whatHappensInMemory() {
        /*
        * What happens in memory?
        * The Call Stack is a LIFO (Last-In, First-Out) memory structure that a program uses 
        * to manage function calls and local variables. Whenever a function is invoked, a new 
        * block of memory called a "Stack Frame" is added (pushed) to the top of the stack. 
        * When the function finishes executing, its frame is deleted (popped) from the stack.
        
        * SUMMARY OF EXECUTION FLOW:
        * * 1. Program Starts: The main() function runs first. A Stack Frame is created for main() 
        * and pushed to the bottom of the Call Stack.
        * * 2. Function is Called: When main() calls sum(), main() is paused. A new Stack Frame 
        * for sum() is pushed exactly on top of the main() frame.
        * * 3. Memory is Isolated: The sum() frame holds its own specific parameters and local 
        * variables (like a, b, and the result). main() cannot see or touch this memory.
        * * 4. Function Finishes: Once sum() completes its task, its entire Stack Frame is 
        * destroyed (popped off the stack). Its local variables are permanently deleted.
        * * 5. Program Resumes: Control goes back down to main(). When main() finishes, its 
        * frame is popped, the stack is empty, and the program ends.
        */
    }

    public static void main(String args[]) {
        // introductionToFunctions(); //function call
        // calculateSum(4, 6); // arguments or actual parameters
        // whatHappensInMemory();
        

        
    }
}
