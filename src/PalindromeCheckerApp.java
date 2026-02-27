/**
 * ============================================================
 * MAIN CLASS - UseCase5PalindromeCheckerApp
 * ============================================================
 *
 * Use Case 5: Stack Based Palindrome Checker
 *
 * Description:
 * This class validates a palindrome using a Stack
 * data structure which follows the LIFO principle.
 *
 * At this stage, the application:
 * - Pushes characters into a stack
 * - Pops them in reverse order
 * - Compares with original sequence
 * - Displays the result
 *
 * This maps stack behavior to reversal logic.
 *
 * @author Developer
 * @version 5.0
 */

import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {

    /**
     * Application entry point for UC5.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Step 1: Create Scanner object
        Scanner scanner = new Scanner(System.in);

        // Step 2: Accept user input
        System.out.print("Enter text: ");
        String input = scanner.nextLine();

        // Step 3: Create a Stack to store characters
        Stack<Character> stack = new Stack<>();

        // Step 4: Push each character of the string into the stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Step 5: Assume palindrome initially
        boolean isPalindrome = true;

        // Step 6: Compare original characters with popped characters
        for (char c : input.toCharArray()) {

            if (c != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        // Step 7: Display result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);

        // Step 8: Close scanner
        scanner.close();
    }
}