/*
A sentence is a string of single-space separated words where each word consists only of lowercase letters.
A word is uncommon if it appears exactly once in one of the sentences, and does not appear in the other sentence.
Given two sentences s1 and s2, return a list of all the uncommon words. You may return the answer in any order.

Example 1:
Input: s1 = "this apple is sweet", s2 = "this apple is sour"
Output: ["sweet","sour"]

Example 2:
Input: s1 = "apple apple", s2 = "banana"
Output: ["banana"]

Constraints:
1 <= s1.length, s2.length <= 200
s1 and s2 consist of lowercase English letters and spaces.
s1 and s2 do not have leading or trailing spaces.
All the words in s1 and s2 are separated by a single space.
 */
package HashTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class _884 {
    public String[] uncommonFromSentences(String s1, String s2) {
        List<String> list = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();

        for (String s : s1.split(" "))
            map.put(s, map.getOrDefault(s, 0) + 1);

        for (String s : s2.split(" "))
            map.put(s, map.getOrDefault(s, 0) + 1);

        for (String key : map.keySet())
            if (map.get(key) == 1)
                list.add(key);

        return list.toArray(new String[0]);
    }
}
