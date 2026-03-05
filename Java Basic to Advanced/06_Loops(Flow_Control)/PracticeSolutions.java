import java.util.*;

public class PracticeSolutions{

    public static void Q1() {
        for(int i=0; i<5; i++) {
        System.out.println("Hello");
        i+=2;
        }
        //Ans. Hello is printed 2 times.
    }

    public static void Q2() {
        Scanner sc = new Scanner(System.in);
        
        int number;
        int choice;
        int evenSum = 0;
        int oddSum = 0;

        do{
            System.out.println("Enter the number : ");
            number = sc.nextInt();

            if(number % 2 == 0) {
                evenSum += number;
            } else{
                oddSum += number;
            }

            System.out.println("Do you want to choice? Press 1 for yes or 0 for no : ");
            choice = sc.nextInt();
        } while(choice == 1);

        System.out.println("sum of even numbers " + evenSum);
        System.out.println("sum of odd numbers " + oddSum);
    }

    public static void main(String args[]) {
        // Q1();
        // Q2();
    }
}