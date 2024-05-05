var combinationSum4 = function(nums, target) {
    let set = new Set(nums);
    let dp = new Array(target + 1).fill(0);
    dp[0] = 1;

    for (let i = 1; i <= target; i++) {
        set.forEach(num => {
            if (i >= num) {
                dp[i] += dp[i - num];
            }
        });
    }
    return dp[target];
};
