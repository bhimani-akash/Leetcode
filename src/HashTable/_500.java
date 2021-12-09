/*
Given an array of strings words, return the words that can be typed using letters of the alphabet on only one
row of American keyboard like the image below.

In the American keyboard:
the first row consists of the characters "qwertyuiop",
the second row consists of the characters "asdfghjkl", and
the third row consists of the characters "zxcvbnm".

Example 1:
Input: words = ["Hello","Alaska","Dad","Peace"]
Output: ["Alaska","Dad"]

Example 2:
Input: words = ["omk"]
Output: []

Example 3:
Input: words = ["adsdf","sfd"]
Output: ["adsdf","sfd"]

Constraints:
1 <= words.length <= 20
1 <= words[i].length <= 100
words[i] consists of English letters (both lowercase and uppercase).
 */
package HashTable;

import java.util.ArrayList;
import java.util.List;

public class _500 {
    public String[] findWords(String[] words) {
        String[] strs = {"QWERTYUIOP","ASDFGHJKL","ZXCVBNM"};
        List<String> results = new ArrayList<String>();

        for (String word : words) {
            int count1 = 0, count2 = 0, count3 = 0;

            for (char c : word.toCharArray()) {
                if (strs[0].toLowerCase().indexOf(c) != -1)
                    count1++;
                if (strs[1].toLowerCase().indexOf(c) != -1)
                    count2++;
                if (strs[2].toLowerCase().indexOf(c) != -1)
                    count3++;
            }
            if ((count1 == 0 && count2 == 0) || (count1 == 0 && count3 == 0) || (count2 == 0 && count3 == 0))
                results.add(word);
        }

        return results.toArray(new String[results.size()]);
    }
}
