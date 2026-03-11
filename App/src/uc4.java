/**
 * ---------------------------------------------------------
 * MAIN CLASS - UseCase4PalindromeCheckerApp
 * ---------------------------------------------------------
 * Use Case 4: Character Array Based Palindrome Check
 *
 * Description:
 * This class validates a palindrome by converting
 * the string into a character array and comparing
 * characters using the two-pointer technique.
 *
 * @author Developer
 * @version 4.0
 */

public class uc4 {

    public static void main(String[] args) {

        // Input string
        String input = "radar";

        // Convert string to char array
        char[] chars = input.toCharArray();

        int start = 0;
        int end = chars.length - 1;

        boolean isPalindrome = true;

        // Compare characters
        while (start < end) {

            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}