package array._125_Valid_Palindrome;

public class Main {
    public static void main(String[] args) {
        // 125. Valid Palindrome
        // Test case
        String s1 = "A man, a plan, a canal: Panama";
        String s4 = "aba";
        String s3 = "race a car";
        String s2 = " ";

        ValidPalindrome isPalindrome = new ValidPalindrome();
        System.out.println(s1 + " is: " + isPalindrome.isPalindrome(s1));
        System.out.println(s4 + " is: " + isPalindrome.isPalindrome(s4));
        System.out.println(s3 + " is: " + isPalindrome.isPalindrome(s3));
        System.out.println(s2 + " is: " + isPalindrome.isPalindrome(s2));
    }
}
