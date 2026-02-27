public class UseCase2PalindromeCheckerApp {

    public static void main(String[] args) {

        // Hardcoded string
        String word = "madam";

        // Reverse the string
        String reversed = new StringBuilder(word).reverse().toString();

        // Check if palindrome using if-else
        if (word.equals(reversed)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }
}