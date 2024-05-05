class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 2; j < nums.length; j++) {
                if (isArithmetic(nums, i, j)) {
                    count++;
                }
            }
        }
        return count;
    }

    private boolean isArithmetic(int[] nums, int start, int end) {
        int diff = nums[start + 1] - nums[start];
        for (int i = start + 1; i < end; i++) {
            if (nums[i + 1] - nums[i] != diff) return false;
        }
        return true;
    }
}