/**
 * Description:
 * Given an integer x, return true if x is a palindrome, and false otherwise.
 * Example 1:
 * Input: x = 121
 * Output: true
 * Explanation: 121 reads as 121 from left to right and from right to left.
 */

// My solution:
class Solution {
    public boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }

        if (reversed.toString().equals(str) == true) {
            return true;
        } else {
            return false;
        }
    }
}