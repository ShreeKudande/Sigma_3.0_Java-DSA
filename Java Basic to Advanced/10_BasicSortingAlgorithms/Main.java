import java.util.Arrays;

/* 
Basic Algorithms
- Bubble Sort
- Selection Sort
- Insertion Sort
- Counting Sort (Advanced)
 */

public class Main{

    public static void bubbleSort(int arr[]) {
        int temp = 0;
        System.out.println();
        System.out.println("after sorting");

        for(int i = 0; i < arr.length; i++) {

            int swaps = 0;

            for(int j = 0; j < arr.length-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    swaps = 1;
                }
            }
            if(swaps == 0) {
                break;
            }

            System.out.println();
            for(int num : arr) {
            System.out.print(num + " ");
            }
        }

        // for(int num : arr) {
        //     System.out.print(num + " ");
        // }
    }

    public static void selectionSort(int arr[]) {
        for(int i = 0; i < arr.length-1; i++) {
            int min = i;
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[min] > arr[j]) {
                    min = j;
                }
            }
            //swap
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

        for(int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void insertionSort(int arr[]) {
        int n = arr.length;
        
        // Start from the second element (index 1) because a single element is already sorted
        for (int i = 1; i < n; i++) {
            int currentCard = arr[i]; // The element we want to position
            int j = i - 1;            // The last index of the "sorted" portion

            // Compare currentCard with elements in the sorted portion (from right to left).
            // If the sorted element is bigger, shift it one position to the right to make space.
            while (j >= 0 && arr[j] > currentCard) {
                arr[j + 1] = arr[j]; // Shift element right
                j--;                 // Move to the next element on the left
            }
            
            // We found the right spot! Insert the currentCard here.
            arr[j + 1] = currentCard;
        }

        for(int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void main(String args[]) {

        //Bubble Sort
        // int arr[] = {5, 4, 1, 3, 2};

        // System.out.println("before sorting");
        // for(int num : arr) {
        //     System.out.print(num + " ");
        // }

        // bubbleSort(arr);

        //Selection Sort
        // int arr[] = {5, 4, 1, 3, 2};
        // selectionSort(arr);

        //Insertion Sort
        int arr[] = {5, 4, 1, 3, 2};
        insertionSort(arr);
    }

}
