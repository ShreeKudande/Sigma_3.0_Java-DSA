public class PracticeSolutions {

    public static void bubbleSort(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length-i-1; j++) {
                if(arr[j] < arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int arr[]) {
        for(int i = 0; i < arr.length-1; i++) {
            int min = i;
            for(int j = i+1; j < arr.length; j++) {
                if(arr[min] < arr[j]) {
                    min = j;
                }
            }
            //swap
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    public static void insertionSort(int arr[]) {

    }

    public static void printArr(int arr[]) {
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void main(String args[]) {
        //Use the following sorting algorithms to sort an array in DESCENDING order:
        int arr[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};

        //Bubble Sort
        // bubbleSort(arr);
        // printArr(arr);

        //Selection Sort
        selectionSort(arr);
        printArr(arr);

        //Insertion Sort
        insertionSort(arr);
        printArr(arr);

        //Counting Sort
    }
}