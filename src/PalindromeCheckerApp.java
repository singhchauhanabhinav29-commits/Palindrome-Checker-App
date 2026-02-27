/**
 * ============================================================
 * MAIN CLASS - UseCase9PalindromeCheckerApp
 * ============================================================
 *
 * Use Case 9: Recursive Palindrome Checker
 *
 * Description:
 * This class validates a palindrome using recursion.
 *
 * Characters are compared from the outer positions,
 * moving inward using recursive calls.
 *
 * The recursion stops when:
 * - All characters are matched, or
 * - A mismatch is found.
 *
 * This use case demonstrates divide-and-conquer
 * logic using method recursion.
 *
 * @author Developer
 * @version 9.0
 */

import java.util.Scanner;

public class PalindromeCheckerApp {

    /**
     * Application entry point for UC9.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Step 1: Create Scanner object
        Scanner scanner = new Scanner(System.in);

        // Step 2: Accept user input
        System.out.print("Enter text: ");
        String input = scanner.nextLine();

        // Step 3: Call recursive check method
        boolean isPalindrome = check(input, 0, input.length() - 1);

        // Step 4: Display result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);

        // Step 5: Close scanner
        scanner.close();
    }

    /**
     * Recursively checks whether a string is palindrome.
     *
     * @param s     Input string
     * @param start Starting index
     * @param end   Ending index
     * @return true if palindrome, otherwise false
     */
    private static boolean check(String s, int start, int end) {

        // Base case: If indices cross or meet
        if (start >= end) {
            return true;
        }

        // If mismatch found
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        // Recursive call moving inward
        return check(s, start + 1, end - 1);
    }
}