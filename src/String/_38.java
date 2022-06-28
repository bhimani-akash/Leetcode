/*
The count-and-say sequence is a sequence of digit strings defined by the recursive formula:
countAndSay(1) = "1"
countAndSay(n) is the way you would "say" the digit string from countAndSay(n-1), which is then converted
into a different digit string.
To determine how you "say" a digit string, split it into the minimal number of substrings such that each substring
contains exactly one unique digit. Then for each substring, say the number of digits, then say the digit.
Finally, concatenate every said digit.
For example, the saying and conversion for digit string "3322251":
Given a positive integer n, return the nth term of the count-and-say sequence.

Example 1:
Input: n = 1
Output: "1"
Explanation: This is the base case.

Example 2:
Input: n = 4
Output: "1211"
Explanation:
countAndSay(1) = "1"
countAndSay(2) = say "1" = one 1 = "11"
countAndSay(3) = say "11" = two 1's = "21"
countAndSay(4) = say "21" = one 2 + one 1 = "12" + "11" = "1211"

Constraints:
1 <= n <= 30
 */
package String;

public class _38 {
    public String countAndSay(int n) {
        String val = "1";

        for (int i = 0; i < n - 1; i++) {
            char c = val.charAt(0);

            StringBuilder s = new StringBuilder();
            int count = 1;

            for (int j = 1; j < val.length(); j++) {
                if (c != val.charAt(j)) {
                    s.append(count);
                    s.append(c);
                    count = 0;
                    c = val.charAt(j);
                }

                count++;
            }

            s.append(count);
            s.append(c);
            val = s.toString();
        }

        return val;
    }
}
