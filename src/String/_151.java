/*
Given an input string s, reverse the order of the words.
A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
Return a string of the words in reverse order concatenated by a single space.
Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should
only have a single space separating the words. Do not include any extra spaces.

Example 1:
Input: s = "the sky is blue"
Output: "blue is sky the"

Example 2:
Input: s = "  hello world  "
Output: "world hello"
Explanation: Your reversed string should not contain leading or trailing spaces.

Example 3:
Input: s = "a good   example"
Output: "example good a"
Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.

Constraints:
1 <= s.length <= 104
s contains English letters (upper-case and lower-case), digits, and spaces ' '.
There is at least one word in s.
 */
package String;

public class _151 {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        int i = n - 1, j = n - 1;

        while (i >= 0) {
            while (i >= 0 && s.charAt(i) == ' ')
                i--;

            j = i;
            while (i >= 0 && Character.isLetterOrDigit(s.charAt(i)))
                i--;

            sb.append(s, i + 1, j + 1).append(" ");
        }

        return sb.toString().trim();
    }
}
