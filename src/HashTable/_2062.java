/*
A substring is a contiguous (non-empty) sequence of characters within a string.
A vowel substring is a substring that only consists of vowels ('a', 'e', 'i', 'o', and 'u') and has all five
vowels present in it.
Given a string word, return the number of vowel substrings in word.

Example 1:
Input: word = "aeiouu"
Output: 2
Explanation: The vowel substrings of word are as follows (underlined):
- "aeiouu"
- "aeiouu"

Example 2:
Input: word = "unicornarihan"
Output: 0
Explanation: Not all 5 vowels are present, so there are no vowel substrings.

Example 3:
Input: word = "cuaieuouac"
Output: 7
Explanation: The vowel substrings of word are as follows (underlined):
- "cuaieuouac"
- "cuaieuouac"
- "cuaieuouac"
- "cuaieuouac"
- "cuaieuouac"
- "cuaieuouac"
- "cuaieuouac"

Example 4:
Input: word = "bbaeixoubb"
Output: 0
Explanation: The only substrings that contain all five vowels also contain consonants, so there are no vowel substrings.

Constraints:
1 <= word.length <= 100
word consists of lowercase English letters only.
 */
package HashTable;

import java.util.HashSet;
import java.util.Set;

public class _2062 {
    public int countVowelSubstrings(String word) {
        int ans = 0;
        int n = word.length();
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < n-4; i++) {
            set.clear();

            for (int j = i; j < n; j++) {
                char ch = word.charAt(j);

                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    set.add(ch);

                    if (set.size() == 5)
                        ans++;

                } else
                    break;
            }
        }

        return ans;
    }
}
