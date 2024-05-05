class Solution {
    public boolean canPartition(int[] nums) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        if (totalSum % 2 != 0) {
            return false; // Total sum must be even for equal partition
        }
        return canPartitionHelper(nums, 0, 0, totalSum / 2);
    }
    
    private boolean canPartitionHelper(int[] nums, int index, int currentSum, int targetSum) {
        if (currentSum == targetSum) {
            return true;
        }
        if (index >= nums.length || currentSum > targetSum) {
            return false;
        }
        return canPartitionHelper(nums, index + 1, currentSum + nums[index], targetSum)
                || canPartitionHelper(nums, index + 1, currentSum, targetSum);
    }
    
}
