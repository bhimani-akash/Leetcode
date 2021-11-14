/*
Given a balanced parentheses string s, return the score of the string.
The score of a balanced parentheses string is based on the following rule:
"()" has score 1.
AB has score A + B, where A and B are balanced parentheses strings.
(A) has score 2 * A, where A is a balanced parentheses string.

Example 1:
Input: s = "()"
Output: 1

Example 2:
Input: s = "(())"
Output: 2

Example 3:
Input: s = "()()"
Output: 2

Example 4:
Input: s = "(()(()))"
Output: 6

Constraints:
2 <= s.length <= 50
s consists of only '(' and ')'.
s is a balanced parentheses string.
 */
package Stack;

public class _856 {
    public static int scoreOfParentheses(String s) {
        int sum = 0;
        int level = 1;

        s = s.replace("()", "1");
        for (char c: s.toCharArray()) {
            if (c == '(') {
                level *= 2;
            } else if (c == ')') {
                level /= 2;
            } else if (c == '1') {
                sum += level;
            }
        }

        return sum;
    }
}
