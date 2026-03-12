import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input : ");
        String input = sc.nextLine();

        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String s = sc.nextLine();

        boolean result = check(s, 0, s.length() - 1);

        System.out.println("Is Palindrome? : " + result);

        sc.close();
    }

    private static boolean check(String s, int start, int end) {

        if (start >= end) {
            return true;
        }

        for (int i = 0; i < normalized.length() / 2; i++) {

            if (normalized.charAt(i) != normalized.charAt(normalized.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Is Palindrome? : " + isPalindrome);

        sc.close();
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        return check(s, start + 1, end - 1);
    }
}