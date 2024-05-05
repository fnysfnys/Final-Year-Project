var canPartition = function(nums) {
    let sum = nums.reduce((acc, curr) => acc + curr, 0);
    if (sum % 2 !== 0) return false;
    let target = sum / 2;

    let dp = Array(target + 1).fill(false);
    dp[0] = true;

    for (let num of nums) {
        for (let i = target; i >= num; i--) {
            dp[i] = dp[i] || dp[i - num];
            if (dp[target]) return true;
        }
    }

    return dp[target];
};