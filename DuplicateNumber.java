import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicateNumber {

    // Function to find the duplicate number in an array
    public static String findDuplicate(int[] nums) {
        // Create a HashSet to keep track of seen numbers
        Set<Integer> seen = new HashSet<>();

        // Iterate through the array by using for loop
        for (int num : nums) {
            // If the number is already in the set, it's the duplicate
            if (seen.contains(num)) {
                return "Duplicate found: "+num;
            } else {
                // Add the number to the set if it's not seen before
                seen.add(num);
            }
        }
        // If no duplicate is found
        return "No duplicate found";
    }

    public static void main(String[] args) {
        //test case 1
        //create the array to add numbers
        int[] input1 = {1, 3, 4, 9, 2};
        //print the array elements
        System.out.println("The stickers shared: "+Arrays.toString(input1));
        //print the repeated numbers
        System.out.println("Repeated Sticker are: " + findDuplicate(input1));

        // Test Case 2
        int[] input2 = {2, 5, 3, 7, 5, 8};
        System.out.println("\nThe stickers shared: " + Arrays.toString(input2));
        System.out.println("Repeated Sticker are: " + findDuplicate(input2));

    }
}
