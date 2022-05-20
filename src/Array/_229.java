/*
Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.

Example 1:
Input: nums = [3,2,3]
Output: [3]

Example 2:
Input: nums = [1]
Output: [1]

Example 3:
Input: nums = [1,2]
Output: [1,2]

Constraints:
1 <= nums.length <= 5 * 104
-109 <= nums[i] <= 109
 */
package Array;

import java.util.ArrayList;
import java.util.List;

public class _229 {
    public List<Integer> majorityElement(int[] nums) {
        int number1 = -1, number2 = -1, count1 = 0, count2 = 0, len = nums.length;

        for (int j : nums) {
            if (j == number1)
                count1++;
            else if (j == number2)
                count2++;
            else if (count1 == 0) {
                number1 = j;
                count1 = 1;
            } else if (count2 == 0) {
                number2 = j;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        List<Integer> ans = new ArrayList<>();
        count1 = 0;
        count2 = 0;

        for (int num : nums) {
            if (num == number1)
                count1++;
            else if (num == number2)
                count2++;
        }

        if (count1 > len / 3)
            ans.add(number1);
        if (count2 > len / 3)
            ans.add(number2);

        return ans;
    }
}
