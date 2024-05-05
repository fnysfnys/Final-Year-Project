var splitArray = function(nums, k) {
    const n = nums.length;
    const dp = new Array(n + 1).fill(0).map(() => new Array(k + 1).fill(Number.MAX_SAFE_INTEGER));
    const prefixSum = new Array(n + 1).fill(0);
    
    for (let i = 0; i < n; i++) {
        prefixSum[i + 1] = prefixSum[i] + nums[i];
    }
    
    dp[0][0] = 0;
    
    for (let i = 1; i <= n; i++) {
        for (let j = 1; j <= k; j++) {
            for (let m = 0; m < i; m++) {
                dp[i][j] = Math.min(dp[i][j], Math.max(dp[m][j - 1], prefixSum[i] - prefixSum[m]));
            }
        }
    }
    
    return dp[n][k];
};
