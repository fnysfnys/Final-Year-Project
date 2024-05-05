public int lengthOfLIS(int[] nums) {
    return lengthOfLISRecursive(nums, Integer.MIN_VALUE, 0);
}

private int lengthOfLISRecursive(int[] nums, int prev, int current) {
    if (current == nums.length) {
        return 0;
    }
    
    int taken = 0;
    if (nums[current] > prev) {
        taken = 1 + lengthOfLISRecursive(nums, nums[current], current + 1);
    }
    
    int notTaken = lengthOfLISRecursive(nums, prev, current + 1);
    
    return Math.max(taken, notTaken);
}
