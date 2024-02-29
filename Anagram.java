import java.util.Scanner;

public class AnagramChecker {

    public static boolean areAnagrams(String s, String t) {
        // Remove spaces and convert to lowercase for case-insensitive comparison
        s = s.replaceAll("\\s", "").toLowerCase();
        t = t.replaceAll("\\s", "").toLowerCase();

        // Check if lengths are different, if so, they can't be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        // Create arrays to store the frequency of each character (assuming ASCII characters)
        int[] frequencyS = new int[128];
        int[] frequencyT = new int[128];

        // Count the frequency of each character in string s
        for (char c : s.toCharArray()) {
            frequencyS[c]++;
        }

        // Count the frequency of each character in string t
        for (char c : t.toCharArray()) {
            frequencyT[c]++;
        }

        // Compare the frequency arrays
        for (int i = 0; i < frequencyS.length; i++) {
            if (frequencyS[i] != frequencyT[i]) {
                return false;
            }
        }

        // If all frequencies match, strings are anagrams
        return true;
    }

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first string
        System.out.print("Enter the first string: ");
        String s = scanner.nextLine();

        // Prompt the user to enter the second string
        System.out.print("Enter the second string: ");
        String t = scanner.nextLine();

        // Check if the strings are anagrams and display the result
        boolean result = areAnagrams(s, t);
        System.out.println("Are the strings anagrams? " + result);

        // Close the Scanner to avoid resource leaks
        scanner.close();
    }
}
