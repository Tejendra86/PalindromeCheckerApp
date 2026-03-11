import java.util.Deque;
import java.util.ArrayDeque;

/**
 * ---------------------------------------------------------
 * MAIN CLASS - UseCase7PalindromeCheckerApp
 * ---------------------------------------------------------
 * Use Case 7: Deque Based Optimized Palindrome Checker
 */

public class uc7 {

    public static void main(String[] args) {

        String input = "refer";

        Deque<Character> deque = new ArrayDeque<>();

        // Add characters to deque
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        boolean isPalindrome = true;

        // Compare front and rear
        while (deque.size() > 1) {

            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}