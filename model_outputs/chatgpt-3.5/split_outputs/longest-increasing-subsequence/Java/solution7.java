public int lengthOfLIS(int[] nums) {
    Integer[][] memo = new Integer[nums.length][nums.length + 1];
    return lengthOfLISRecursive(nums, -1, 0, memo);
}

private int lengthOfLISRecursive(int[] nums, int prevIndex, int currentIndex, Integer[][] memo) {
    if (currentIndex == nums.length) {
        return 0;
    }
    
    if (memo[prevIndex + 1][currentIndex] != null) {
        return memo[prevIndex + 1][currentIndex];
    }
    
    int taken = 0;
    if (prevIndex == -1 || nums[currentIndex] > nums[prevIndex]) {
        taken = 1 + lengthOfLISRecursive(nums, currentIndex, currentIndex + 1, memo);
    }
    
    int notTaken = lengthOfLISRecursive(nums, prevIndex, currentIndex + 1, memo);
    
    memo[prevIndex + 1][currentIndex] = Math.max(taken, notTaken);
    
    return memo[prevIndex + 1][currentIndex];
}
