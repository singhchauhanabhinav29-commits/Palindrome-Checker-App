/**
 * ============================================================
 * MAIN CLASS - UseCase3PalindromeCheckerApp
 * ============================================================
 *
 * Use Case 2: User Input Palindrome Validation
 *
 * Description:
 * This class demonstrates palindrome validation
 * using user input from the console.
 *
 * At this stage, the application:
 * - Accepts a string from the user
 * - Compares characters from both ends
 * - Determines whether the string is a palindrome
 * - Displays the result on the console
 *
 * This use case introduces dynamic input handling
 * using the Scanner class.
 *
 * @author Developer
 * @version 2.0
 */

import java.util.Scanner;

public class PalindromeCheckerApp {

    /**
     * Application entry point for UC3.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Step 1: Create Scanner object
        Scanner scanner = new Scanner(System.in);

        // Step 2: Accept user input
        System.out.print("Enter text: ");
        String input = scanner.nextLine();

        // Step 3: Assume it is palindrome initially
        boolean isPalindrome = true;

        // Step 4: Loop only till half of the string length
        for (int i = 0; i < input.length() / 2; i++) {

            // Compare characters from both ends
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        // Step 5: Display result
        System.out.println("Input text: " + input);
        System.out.println("Is it a Palindrome? : " + isPalindrome);

        // Step 6: Close scanner
        scanner.close();
    }
}