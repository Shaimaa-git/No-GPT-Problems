import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FindDuplicateNumber {

    // Function to find the duplicate number in an array
    public static String findDuplicate(int[] nums) {
        // Create a HashSet to keep track of seen numbers
        Set<Integer> seen = new HashSet<>();

        // Iterate through the array using a for-each loop
        for (int num : nums) {
            // If the number is already in the set, it's the duplicate
            if (seen.contains(num)) {
                return "Duplicate found: " + num;
            } else {
                // Add the number to the set if it's not seen before
                seen.add(num);
            }
        }
        // If no duplicate is found
        return "No duplicate found";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the size of the array from the user
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array to store user input
        int[] inputArray = new int[size];

        // Get array elements from the user
        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            inputArray[i] = scanner.nextInt();
        }

        // Print the array elements
        System.out.println("The stickers shared: " + Arrays.toString(inputArray));

        // Find and print the duplicate
        System.out.println("Repeated Sticker are: " + findDuplicate(inputArray));

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
