public boolean canPartition(int[] nums) {
    int sum = 0;
    for (int num : nums) {
        sum += num;
    }
    if (sum % 2 != 0) {
        return false; // If the total sum is odd, partition is not possible.
    }
    int target = sum / 2;
    Boolean[][] memo = new Boolean[nums.length][target + 1];
    return canPartitionRecursive(nums, 0, target, memo);
}

private boolean canPartitionRecursive(int[] nums, int index, int target, Boolean[][] memo) {
    if (target == 0) {
        return true; // Found a valid partition.
    }
    if (index >= nums.length || target < 0) {
        return false; // Out of bounds or target is negative.
    }
    if (memo[index][target] != null) {
        return memo[index][target];
    }
    // Include the current number in the partition or skip it.
    memo[index][target] = canPartitionRecursive(nums, index + 1, target - nums[index], memo) || canPartitionRecursive(nums, index + 1, target, memo);
    return memo[index][target];
}
