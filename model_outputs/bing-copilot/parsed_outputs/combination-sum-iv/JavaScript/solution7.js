var combinationSum4 = function(nums, target, memo = new Map()) {
    if (target === 0) return 1;
    if (target < 0) return 0;
    if (memo.has(target)) return memo.get(target);

    let count = 0;
    for (const num of nums) {
        count += combinationSum4(nums, target - num, memo);
    }

    memo.set(target, count);
    return count;
};
