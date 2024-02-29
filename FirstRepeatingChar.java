import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FirstRepeatingCharacter {

    // Function to find the first repeating character
    public static Character findFirstRepeatingCharacter(String s) {
        // Create a set to keep track of seen characters
        Set<Character> seenCharacters = new HashSet<>();

        // Iterate through the string
        for (char ch : s.toCharArray()) {
            // If the character is already in the set, it's the first repeating character
            if (seenCharacters.contains(ch)) {
                return ch;
            } else {
                // Add the character to the set if it's not seen before
                seenCharacters.add(ch);
            }
        }

        // If no repeating character is found, return null or a specific message
        return null; // You can also return a specific message like "No repeating characters"
    }

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        // Find the first repeating character
        Character result = findFirstRepeatingCharacter(userInput);

        // Print the result
        if (result != null) {
            System.out.println("First Repeating Character: " + result);
        } else {
            System.out.println("No repeating characters");
        }

        // Close the Scanner
        scanner.close();
    }
}
