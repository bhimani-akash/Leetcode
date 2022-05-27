/*
Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]]
such that:
0 <= a, b, c, d < n
a, b, c, and d are distinct.
nums[a] + nums[b] + nums[c] + nums[d] == target
You may return the answer in any order.

Example 1:
Input: nums = [1,0,-1,0,-2,2], target = 0
Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]

Example 2:
Input: nums = [2,2,2,2,2], target = 8
Output: [[2,2,2,2]]

Constraints:
1 <= nums.length <= 200
-109 <= nums[i] <= 109
-109 <= target <= 109
 */
package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();

        int n = nums.length;

        if (n == 0)
            return res;

        Arrays.sort(nums);

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int target2 = target - nums[j] - nums[i];

                int front = j + 1;
                int back = n - 1;

                while (front < back) {
                    int twoSum = nums[front] + nums[back];

                    if (twoSum < target2)
                        front++;
                    else if (twoSum > target2)
                        back--;
                    else {
                        List<Integer> quad = new ArrayList<>();
                        quad.add(nums[i]);
                        quad.add(nums[j]);
                        quad.add(nums[front]);
                        quad.add(nums[back]);
                        res.add(quad);

                        while (front < back && nums[front] == quad.get(2))
                            ++front;

                        while (front < back && nums[back] == quad.get(3))
                            --back;
                    }
                }

                while (j + 1 < n && nums[j + 1] == nums[j])
                    ++j;
            }

            while (i + 1 < n && nums[i + 1] == nums[i])
                ++i;
        }
        return res;
    }
}
