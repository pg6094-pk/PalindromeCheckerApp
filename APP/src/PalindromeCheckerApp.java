public class PalindromeCheckerApp {

    public static void main(String[] args) {
        String input = "noon";

        java.util.Stack<Character> stack = new java.util.Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        boolean isPalindrome = true;

        for (char c : input.toCharArray()) {
            if (stack.pop() != c) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input          : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}