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
        //test five arrays to find the duplicate numbers
        //create the array to add numbers
        int[] input1 = {1, 3, 4, 9, 2};
        //print the array elements
        System.out.println("The stickers shared: "+Arrays.toString(input1));
        //print the repeated numbers
        System.out.println("Repeated Sticker are: " + findDuplicate(input1));

        int[] input2 = {3, 1, 3, 4, 2};
        System.out.println("The stickers shared: "+Arrays.toString(input2));
        System.out.println("Repeated Sticker are: " + findDuplicate(input2));

        int[] input3 = {1, 1};
        System.out.println("The stickers shared: "+Arrays.toString(input3));
        System.out.println("Repeated Sticker are: " + findDuplicate(input3));

        int[] input4 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 1};
        System.out.println("The stickers shared: "+Arrays.toString(input4));
        System.out.println("Repeated Sticker are: " + findDuplicate(input4));

        int[] input5 = {9, 6, 4, 2, 3, 5, 7, 0, 1, 8, 6};
        System.out.println("The stickers shared: "+Arrays.toString(input5));
        System.out.println("Repeated Sticker are: " + findDuplicate(input5));
    }
}
