class Solution {
    public boolean canPartition(int[] nums) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        if (totalSum % 2 != 0) {
            return false; // Total sum must be even for equal partition
        }
        int targetSum = totalSum / 2;
        Boolean[][] memo = new Boolean[nums.length][targetSum + 1];
        return canPartitionHelper(nums, 0, 0, targetSum, memo);
    }
    
    private boolean canPartitionHelper(int[] nums, int index, int currentSum, int targetSum, Boolean[][] memo) {
        if (currentSum == targetSum) {
            return true;
        }
        if (index >= nums.length || currentSum > targetSum) {
            return false;
        }
        if (memo[index][currentSum] != null) {
            return memo[index][currentSum];
        }
        boolean result = canPartitionHelper(nums, index + 1, currentSum + nums[index], targetSum, memo)
                || canPartitionHelper(nums, index + 1, currentSum, targetSum, memo);
        memo[index][currentSum] = result;
        return result;
    }
    
}
