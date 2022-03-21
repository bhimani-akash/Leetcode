/*
Given an array of strings words, return the first palindromic string in the array. If there is no such string,
return an empty string "".
A string is palindromic if it reads the same forward and backward.

Example 1:
Input: words = ["abc","car","ada","racecar","cool"]
Output: "ada"
Explanation: The first string that is palindromic is "ada".
Note that "racecar" is also palindromic, but it is not the first.

Example 2:
Input: words = ["notapalindrome","racecar"]
Output: "racecar"
Explanation: The first and only string that is palindromic is "racecar".

Example 3:
Input: words = ["def","ghi"]
Output: ""
Explanation: There are no palindromic strings, so the empty string is returned.

Constraints:
1 <= words.length <= 100
1 <= words[i].length <= 100
words[i] consists only of lowercase English letters.
 */
package Array;

public class _2108 {
    public String firstPalindrome(String[] words) {
        String ans = "";

        for (String word : words) {
            int l = word.length();
            int check = 0;

            for (int i = 0; i < l / 2; i++) {
                if (word.charAt(i) != word.charAt(l - i - 1)) {
                    check = 1;
                    break;
                }
            }

            if(check == 0)
                return word;
        }

        return ans;
    }
}
