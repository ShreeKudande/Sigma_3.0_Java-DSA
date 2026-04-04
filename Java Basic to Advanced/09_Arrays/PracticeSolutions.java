import java.util.Arrays;

public class PracticeSolutions {

    public static boolean Q1(int num[]) {
        Arrays.sort(num);
        for(int i = 0; i < num.length - 1; i++) {
            if(num[i] == num[i+1]) {
                return true;
            }
        }
        return false;
    }

    public static int Q2(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Target found
            if (nums[mid] == target) {
                return mid;
            }

            // Check if the Left Half is strictly sorted
            if (nums[start] <= nums[mid]) {
                // Is the target inside this sorted left half?
                if (nums[start] <= target && target < nums[mid]) {
                    end = mid - 1; // Yes, search left
                } else {
                    start = mid + 1;  // No, search right
                }
            } 
            // Otherwise, the Right Half must be strictly sorted
            else {
                // Is the target inside this sorted right half?
                if (nums[mid] < target && target <= nums[end]) {
                    start = mid + 1;  // Yes, search right
                } else {
                    end = mid - 1; // No, search left
                }
            }
        }
        
        // Target not found
        return -1; 
    }

    public static 

    public static void main(String args[]) {
        // int num[] = {2, 6, 7, 9, 10, 9, 12, 14};
        // System.out.println(Q1(num));

        // int nums[] = {4, 5, 6, 7, 0, 1, 2};
        // int target = 0;
        // System.out.println(Q2(nums, target));

        //Q3 & Q4 already solved in lecture examples

        int num[] = {-1, 0 , 1, 2, -1, -4};
        Q5(num);
    }
}
