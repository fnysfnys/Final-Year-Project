var canPartition = function(nums) {
    const sum = nums.reduce((acc, num) => acc + num, 0);
    if (sum % 2 !== 0) return false;
    const target = sum / 2;
    
    const dp = Array(1 << nums.length).fill(false);
    dp[0] = true;
    
    for (let mask = 1; mask < (1 << nums.length); mask++) {
        let currentSum = 0;
        for (let i = 0; i < nums.length; i++) {
            if (mask & (1 << i)) {
                currentSum += nums[i];
            }
        }
        dp[mask] = dp[mask] || (currentSum === target);
    }
    
    return dp[(1 << nums.length) - 1];
};
