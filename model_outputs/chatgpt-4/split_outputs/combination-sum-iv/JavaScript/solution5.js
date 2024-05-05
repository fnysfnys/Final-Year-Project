var combinationSum4 = function(nums, target) {
    let dp = new Array(target + 1).fill(0);
    dp[0] = 1;

    for (let i = 0; i <= target; i++) {
        for (let num of nums) {
            if (i + num <= target) {
                dp[i + num] += dp[i];
            }
        }
    }
    return dp[target];
};
