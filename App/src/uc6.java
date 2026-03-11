import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

/**
 * ---------------------------------------------------------
 * MAIN CLASS - UseCase6PalindromeCheckerApp
 * ---------------------------------------------------------
 * Use Case 6: Queue + Stack Based Palindrome Check
 *
 * Description:
 * This class demonstrates palindrome validation using
 * two data structures:
 * Queue (FIFO) and Stack (LIFO)
 */

public class uc6 {

    public static void main(String[] args) {

        String input = "civic";

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Insert characters into queue and stack
        for (char c : input.toCharArray()) {
            queue.add(c);    // enqueue
            stack.push(c);   // push
        }

        boolean isPalindrome = true;

        // Compare dequeue and pop
        while (!queue.isEmpty()) {

            if (queue.remove() != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}