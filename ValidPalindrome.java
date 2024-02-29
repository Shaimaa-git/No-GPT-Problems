import java.util.Scanner;

public class PalindromeCheck {

    // Function to check if a cleaned string is a palindrome
    public static boolean isPalindrome(String s) {
        // Remove specified characters (including space) and convert to lowercase
        String cleanedString = s.replaceAll("[-'!?!@#$%^&* ]", "").toLowerCase();

        // Print the cleaned string
        System.out.println("Cleaned String: " + cleanedString);

        // Use two pointers to compare characters from the beginning and the end
        int start = 0;
        int end = cleanedString.length() - 1;

        // Iterate until the pointers meet at the center
        while (start < end) {
            // Compare characters and move pointers towards the center
            if (cleanedString.charAt(start) != cleanedString.charAt(end)) {
                return false; // Characters are not equal, not a palindrome
            }
            start++;
            end--;
        }

        return true; // All characters matched, it's a palindrome
    }

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        // Test if the input string is a palindrome
        System.out.println("Is Palindrome: " + isPalindrome(userInput));

        // Close the Scanner
        scanner.close();
    }
}
