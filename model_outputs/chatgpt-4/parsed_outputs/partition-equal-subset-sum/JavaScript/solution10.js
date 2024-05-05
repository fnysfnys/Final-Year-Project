var canPartition = function(nums) {
    const total = nums.reduce((sum, num) => sum + num, 0);
    if (total % 2 !== 0) return false;
    const target = total / 2;
    const memo = new Map();

    function dfs(i, currentSum) {
        if (currentSum === target) return true;
        if (currentSum > target || i >= nums.length) return false;
        const key = `${i}:${currentSum}`;
        if (memo.has(key)) return memo.get(key);

        const result = dfs(i + 1, currentSum + nums[i]) || dfs(i + 1, currentSum);
        memo.set(key, result);
        return result;
    }

    return dfs(0, 0);
};