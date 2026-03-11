/**
 * ---------------------------------------------------------
 * MAIN CLASS - UseCase3PalindromeCheckerApp
 * ---------------------------------------------------------
 * Use Case 3: Reverse String Based Palindrome Check
 *
 * Description:
 * This class checks whether a string is a palindrome
 * by reversing the string and comparing it with
 * the original value.
 *
 * @author Developer
 * @version 3.0
 */

public class uc3 {

    public static void main(String[] args) {

        String input = "madam";      // original string
        String reversed = "";        // reversed string

        // Reverse the string
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        // Compare original and reversed string
        if (input.equals(reversed)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }

    }
}