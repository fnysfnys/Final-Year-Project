class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        return slices(nums, nums.length - 1);
    }

    private int slices(int[] nums, int end) {
        if (end < 2) return 0;
        int sum = 0;
        if (nums[end] - nums[end - 1] == nums[end - 1] - nums[end - 2]) {
            sum = 1 + slices(nums, end - 1);
        } else {
            slices(nums, end - 1);
        }
        return sum;
    }
}
