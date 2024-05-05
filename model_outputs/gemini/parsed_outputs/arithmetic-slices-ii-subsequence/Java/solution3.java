class Solution {
    public int numberOfArithmeticSlices(int[] nums, int start, int end) {
        if (end - start < 2) return 0;
        if (nums[end] - nums[end - 1] != nums[end - 1] - nums[end - 2]) return 0;
        return 1 + numberOfArithmeticSlices(nums, start, end - 1) + numberOfArithmeticSlices(nums, start + 1, end);
    }
    
    public int numberOfArithmeticSlices(int[] nums) {
        return numberOfArithmeticSlices(nums, 0, nums.length - 1);
    }
    
}
