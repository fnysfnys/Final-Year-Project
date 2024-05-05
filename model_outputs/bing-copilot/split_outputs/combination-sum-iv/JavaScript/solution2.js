var combinationSum4 = function(nums, target, memo = {}) {
    if (target === 0) return 1;
    if (target < 0) return 0;
    if (memo[target] !== undefined) return memo[target];

    let count = 0;
    for (const num of nums) {
        count += combinationSum4(nums, target - num, memo);
    }

    memo[target] = count;
    return count;
};
