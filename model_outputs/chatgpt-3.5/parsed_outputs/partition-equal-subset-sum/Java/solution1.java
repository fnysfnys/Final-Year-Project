class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if (sum % 2 != 0) {
            return false; // If the total sum is odd, partition is not possible.
        }
        return canPartitionRecursive(nums, 0, sum / 2);
    }
    
    private boolean canPartitionRecursive(int[] nums, int index, int target) {
        if (target == 0) {
            return true; // Found a valid partition.
        }
        if (index >= nums.length || target < 0) {
            return false; // Out of bounds or target is negative.
        }
        // Include the current number in the partition or skip it.
        return canPartitionRecursive(nums, index + 1, target - nums[index]) || canPartitionRecursive(nums, index + 1, target);
    }
}
