/**
 * ============================================================
 * MAIN CLASS - UseCase10PalindromeCheckerApp
 * ============================================================
 *
 * Use Case 10: Normalized Palindrome Validation
 *
 * Description:
 * This class validates a palindrome after preprocessing
 * the input string.
 *
 * Normalization includes:
 * - Removing spaces and symbols
 * - Converting to lowercase
 *
 * This ensures the palindrome check is logical rather
 * than character-format dependent.
 *
 * Example:
 * "A man a plan a canal Panama"
 *
 * @author Developer
 * @version 10.0
 */

import java.util.Scanner;

public class PalindromeCheckerApp {

    /**
     * Application entry point for UC10.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Step 1: Create Scanner object
        Scanner scanner = new Scanner(System.in);

        // Step 2: Accept user input
        System.out.print("Enter text: ");
        String input = scanner.nextLine();

        // Step 3: Normalize string
        String normalized = input
                .replaceAll("[^a-zA-Z0-9]", "")  // Remove spaces & symbols
                .toLowerCase();                  // Convert to lowercase

        // Step 4: Assume palindrome initially
        boolean isPalindrome = true;

        // Step 5: Compare characters from both ends
        for (int i = 0; i < normalized.length() / 2; i++) {

            if (normalized.charAt(i) !=
                    normalized.charAt(normalized.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        // Step 6: Display result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);

        // Step 7: Close scanner
        scanner.close();
    }
}