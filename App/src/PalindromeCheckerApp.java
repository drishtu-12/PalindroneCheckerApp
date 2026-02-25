public class PalindromeCheckerApp {
    public static void main(String[] args) {
        System.out.println("Welcome to the Palindrome Checker management system");
        System.out.println("Version : 1.0");
        System.out.println("System initialized Successfully");
    }
}
public class UseCase2PalindromeCheckerApp {

    public static void main(String[] args) {

        // Hardcoded string
        String word = "madam";

        // Reverse the string
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        // Check if palindrome
        if (word.equals(reversed)) {
            System.out.println(word + " is a Palindrome.");
        } else {
            System.out.println(word + " is not a Palindrome.");
        }
    }
}
public class UseCase3PalindromeCheckerApp {

    public static void main(String[] args) {

        // Original string
        String original = "madam";

        // Variable to store reversed string
        String reversed = "";

        // Reverse using for loop
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        // Compare original and reversed string
        if (original.equals(reversed)) {
            System.out.println(original + " is a Palindrome.");
        } else {
            System.out.println(original + " is not a Palindrome.");
        }
    }
}
public class UseCase4PalindromeCheckerApp {

    /**
     * Application entry point for UC4.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Declare and initialize input string
        String input = "radar";

        // Convert string into character array
        char[] chars = input.toCharArray();

        // Initialize two pointers
        int start = 0;
        int end = chars.length - 1;

        // Assume palindrome initially
        boolean isPalindrome = true;

        // Compare characters using two-pointer approach
        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Display result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
        System.out.println("DONE");
    }
}
