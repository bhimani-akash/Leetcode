package Array;

public class _1929 {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] newNums = new int[2*n];

        for (int i = 0; i < n; i++) {
            newNums[i] = nums[i];
            newNums[i+n] = nums[i];
        }

        return newNums;
    }
}
