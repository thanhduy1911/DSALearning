package math._9_PalindromeNumber;

public class Main {
    public static void main(String[] args) {
        PalindromeNumber check = new PalindromeNumber();

        System.out.println("Is this palindrome number: " + check.isPalindrome(10));
        System.out.println("Is this palindrome number: " + check.isPalindrome(123));
        System.out.println("Is this palindrome number: " + check.isPalindrome(121));
        System.out.println("Is this palindrome number: " + check.isPalindrome(-121));
    }
}
