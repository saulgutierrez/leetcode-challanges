/**
 * Description:
 * Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 
 * if needle is not part of haystack.
 * Example 1:
 * Input: haystack = "sadbutsad", needle = "sad"
 * Output: 0
 * Explanation: "sad" occurs at index 0 and 6.
 * The first occurrence is at index 0, so we return 0.
 */

// My solution:
class Solution {
public:
    int strStr(string haystack, string needle) {
        for (int i = 0; i <= haystack.length() - needle.length(); ++i) {
            if (haystack.find(needle) == string::npos) {
                return -1;
            }
        }
        return haystack.find(needle);
    }
};