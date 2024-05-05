public boolean canPartition(int[] nums) {
    int totalSum = 0;
    for (int num : nums) {
        totalSum += num;
    }
    if (totalSum % 2 != 0) {
        return false; // Total sum must be even for equal partition
    }
    int targetSum = totalSum / 2;
    int n = nums.length;
    for (int mask = 0; mask < (1 << n); mask++) {
        int subsetSum = 0;
        for (int i = 0; i < n; i++) {
            if ((mask & (1 << i)) != 0) {
                subsetSum += nums[i];
            }
        }
        if (subsetSum == targetSum) {
            return true;
        }
    }
    return false;
}
