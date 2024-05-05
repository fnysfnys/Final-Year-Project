var canPartition = function(nums) {
    const sum = nums.reduce((acc, num) => acc + num, 0);
    if (sum % 2 !== 0) return false;
    
    const targetSum = sum / 2;
    const dp = new Array(targetSum + 1).fill(false);
    dp[0] = true;

    for (const num of nums) {
        for (let i = targetSum; i >= num; i--) {
            dp[i] = dp[i] || dp[i - num];
        }
    }

    return dp[targetSum];
};
