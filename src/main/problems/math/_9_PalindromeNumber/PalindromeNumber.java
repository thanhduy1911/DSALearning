package main.problems.math._9_PalindromeNumber;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        // edge case: negative or ends with 0 (but not 0 itself)
        if (x < 0 || (x % 10 == 0 && x != 0)) return false;

        // use reverse to find a half number (avoid overflow if number is bigger integer)
        int rev = 0;
        while (x > rev) {
            /*
                x % 10: get last digit in number x
                rev * 10: build a number from right to left
                For example:
                first run: rev = 0; x = 121
                    rev = rev * 10 + x % 10 == (0 * 10) + (121 % 10) == 0 + 1 => rev = 1
                    x = x / 10 == 121 / 10 == 12 ==> x = 12
                second run: rev = 1; x = 12
                    rev = rev * 10 + x % 10 == (1 * 10) + (12 % 10) == 10 + 2 => rev = 2
                    x = x / 10 == 12 / 10 == 1 ==> x = 1
                x > rev == 1 > 2 ? continue loop (wrong) : get out while loop (correct)
            */
            rev = rev * 10 + (x % 10);
            x /= 10;
        }

        // check both even or odd digit cases
        return (rev == x || rev / 10 == x);
    }
}
