var combinationSum4 = function(nums, target) {
    nums.sort((a, b) => a - b); // Sort numbers to optimize loop

    let dp = new Array(target + 1).fill(0);
    dp[0] = 1;

    for (let i = 1; i <= target; i++) {
        for (let num of nums) {
            if (num > i) break; // Stop if num exceeds the target
            dp[i] += dp[i - num];
        }
    }
    return dp[target];
};