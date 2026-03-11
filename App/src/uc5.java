import java.util.Stack;

/**
 * ---------------------------------------------------------
 * MAIN CLASS - UseCase5PalindromeCheckerApp
 * ---------------------------------------------------------
 * Use Case 5: Stack Based Palindrome Checker
 *
 * Description:
 * This class validates a palindrome using a Stack
 * which follows the LIFO (Last In First Out) principle.
 *
 * @author Developer
 * @version 5.0
 */

public class uc5 {

    public static void main(String[] args) {

        String input = "noon";

        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        boolean isPalindrome = true;

        // Compare with popped characters
        for (char c : input.toCharArray()) {

            if (c != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}