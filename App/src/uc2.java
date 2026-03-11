public class uc2 {

    public static void main(String[] args) {

        String input = "madam";   // Hardcoded string
        boolean isPalindrome = true;

        // Check characters from start and end
        for (int i = 0; i < input.length() / 2; i++) {

            if (input.charAt(i) != input.charAt(input.length() - i - 1)) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        if (isPalindrome) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}