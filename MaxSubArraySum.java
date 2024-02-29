import java.util.Scanner;

public class MaxSubarraySum {

    // Function to find the maximum subarray sum using Kadane's algorithm
    public static int maxSubArray(int[] nums) {
        // Initialize variables for maximum sum and current sum
        int maxSum = nums[0];
        int currentSum = nums[0];

        // Iterate through the array starting from the second element
        for (int i = 1; i < nums.length; i++) {
            // Decide whether to include the current element in the current subarray or start a new subarray
            currentSum = Math.max(nums[i], currentSum + nums[i]);

            // Update the maximum sum if the current subarray sum is greater
            maxSum = Math.max(maxSum, currentSum);
        }

        // Return the maximum sum
        return maxSum;
    }

    // Main method for user interaction
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter numbers separated by commas
        System.out.println("Enter the numbers separated by commas: ");
        String input = scanner.nextLine();

        // Split the input string into an array of strings
        String[] numbers = input.split(",");

        // Convert the array of strings to an array of integers
        int[] nums = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            nums[i] = Integer.parseInt(numbers[i].trim());
        }

        // Calculate the maximum subarray sum using the maxSubArray function
        int maxSum = maxSubArray(nums);

        // Display the result
        System.out.println("The maximum sum of subarray is: " + maxSum);

        // Close the Scanner to avoid resource leaks
        scanner.close();
    }
}
