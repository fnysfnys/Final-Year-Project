var canPartition = function(nums) {
    const sum = nums.reduce((acc, num) => acc + num, 0);
    if (sum % 2 !== 0) return false;
    
    const targetSum = sum / 2;
    const n = nums.length;

    const dp = new Array(1 << n).fill(false);
    dp[0] = true;

    for (let i = 0; i < (1 << n); i++) {
        for (let j = 0; j < n; j++) {
            if (i & (1 << j)) {
                dp[i] = dp[i] || (dp[i ^ (1 << j)] && nums[j]);
            }
        }
    }

    return dp[(1 << n) - 1];
};