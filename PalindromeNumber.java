// https://leetcode.com/problems/palindrome-number/

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        } else {
            int palindrome = 0;
            int value = x;
            while (x != 0) {
                palindrome = (palindrome * 10) + (x % 10);
                x /= 10;
            }
            if (value == palindrome) {
                return true;
            }
        }
        return false;
    }
}
