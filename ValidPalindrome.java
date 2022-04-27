// https://leetcode.com/problems/valid-palindrome/

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^A-Za-z0-9]", "");
        s = s.toLowerCase();
        String temp = (new StringBuilder(s)).reverse().toString();
        if (!s.equals(temp)) {
            return false;
        }
        return true;
    }
}
