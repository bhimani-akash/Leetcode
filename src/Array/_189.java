package Array;

public class _189 {
    public void rotate(int[] nums, int k) {
        if (nums == null || nums.length < 2 || nums.length == k || k <= 0 ) {
            return;
        }

        int trimmedK = k > nums.length ? k % nums.length : k;

        rotateInternal(0, nums.length - 1, nums);

        rotateInternal(0, trimmedK - 1, nums);

        rotateInternal(trimmedK, nums.length - 1, nums);
    }

    private void rotateInternal(int startIndex, int endIndex, int[] nums) {
        while(startIndex < endIndex) {
            int temp = nums[startIndex];
            nums[startIndex] = nums[endIndex];
            nums[endIndex] = temp;
            startIndex++;
            endIndex--;
        }
    }
}
