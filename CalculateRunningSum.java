import java.util.Arrays;

public class RunningSum {

    public static int[] calculateRunningSum(int[] nums) {
        int n = nums.length;
        
        // If the array is empty or has only one element, return the same array
        if (n <= 1) {
            return nums;
        }

        // Iterate through the array starting from the second element
        for (int i = 1; i < n; i++) {
            // Add the current element to the sum of previous elements
            nums[i] += nums[i - 1];
        }

        return nums;
    }

    public static void main(String[] args) {
        // Test cases
        int[] input1 = {1, 2, 3, 4};
        System.out.println("Input: " + Arrays.toString(input1));
        System.out.println("Output: " + Arrays.toString(calculateRunningSum(input1)));

        int[] input2 = {1, 1, 1, 1, 1};
        System.out.println("Input: " + Arrays.toString(input2));
        System.out.println("Output: " + Arrays.toString(calculateRunningSum(input2)));

        int[] input3 = {3, 5, 2, 7};
        System.out.println("Input: " + Arrays.toString(input3));
        System.out.println("Output: " + Arrays.toString(calculateRunningSum(input3)));

        int[] input4 = {0, 0, 0, 0};
        System.out.println("Input: " + Arrays.toString(input4));
        System.out.println("Output: " + Arrays.toString(calculateRunningSum(input4)));

        int[] input5 = {-1, -2, -3, -4};
        System.out.println("Input: " + Arrays.toString(input5));
        System.out.println("Output: " + Arrays.toString(calculateRunningSum(input5)));

        int[] input6 = {10, -2, 3, -1};
        System.out.println("Input: " + Arrays.toString(input6));
        System.out.println("Output: " + Arrays.toString(calculateRunningSum(input6)));
    }
}
