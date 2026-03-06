import java.util.*;

public class Main{

    public static void introToNestedLoops() {
        for(int line = 1; line <= 4; line++) {
            for(int star = 1; star <= line; star++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    } 

    public static void invertedStarPattern() {
        for(int line = 1; line <= 4; line++) {
            for(int star = 4; star <= line; star--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }        

    public static void main(String args[]) {
        // introToNestedLoops();
        invertedStarPattern();
    }
}